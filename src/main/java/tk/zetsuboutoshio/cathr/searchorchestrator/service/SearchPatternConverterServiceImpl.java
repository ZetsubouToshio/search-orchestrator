package tk.zetsuboutoshio.cathr.searchorchestrator.service;

import org.springframework.stereotype.Service;
import tk.zetsuboutoshio.cathr.searchorchestrator.dto.SearchPatternDTO;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchArgument;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchPattern;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchSource;
import tk.zetsuboutoshio.cathr.searchorchestrator.repository.SearchSourceCrudRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchPatternConverterServiceImpl implements SearchPatternConverterService {

    private final SearchSourceCrudRepository searchSourceCrudRepository;

    public SearchPatternConverterServiceImpl(SearchSourceCrudRepository searchSourceCrudRepository) {
        this.searchSourceCrudRepository = searchSourceCrudRepository;
    }


    @Override
    public SearchPattern fromDTO(SearchPatternDTO dto) {

        SearchPattern pattern = new SearchPattern();

        SearchSource source = searchSourceCrudRepository.findByName(dto.getSource());

        pattern.setSource(source);

        List<SearchArgument> args = dto.getProperties()
                .entrySet()
                .stream()
                .map(e -> new SearchArgument(e.getKey(), e.getValue()))
                .collect(Collectors.toList());

        pattern.setArguments(args);

        return pattern;
    }

    @Override
    public SearchPatternDTO toDTO(SearchPattern pattern) {
        return null;
    }
}
