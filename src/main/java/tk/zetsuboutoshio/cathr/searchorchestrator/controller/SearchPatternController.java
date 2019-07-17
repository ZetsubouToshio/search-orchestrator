package tk.zetsuboutoshio.cathr.searchorchestrator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.zetsuboutoshio.cathr.searchorchestrator.dto.SearchPatternDTO;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchPattern;
import tk.zetsuboutoshio.cathr.searchorchestrator.service.SearchPatternConverterService;
import tk.zetsuboutoshio.cathr.searchorchestrator.service.SearchPatternService;

@RestController
@RequestMapping("/pattern")
public class SearchPatternController {

    private final SearchPatternService searchPatternService;
    private final SearchPatternConverterService searchPatternConverterService;

    public SearchPatternController(SearchPatternService searchPatternService, SearchPatternConverterService searchPatternConverterService) {
        this.searchPatternService = searchPatternService;
        this.searchPatternConverterService = searchPatternConverterService;
    }


    @PostMapping("/")
    public ResponseEntity<String> createNewSearch(SearchPatternDTO pattern) {

        searchPatternService.create(searchPatternConverterService.fromDTO(pattern));

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Iterable<SearchPattern>> getAll() {
        return new ResponseEntity<>(searchPatternService.getAll(), HttpStatus.OK);
    }

}
