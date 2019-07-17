package tk.zetsuboutoshio.cathr.searchorchestrator.service;

import org.springframework.stereotype.Service;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchPattern;
import tk.zetsuboutoshio.cathr.searchorchestrator.repository.SearchEngineCrudRepository;

@Service
public class SearchPatternServiceImpl implements SearchPatternService {

    private final SearchEngineCrudRepository searchEngineCrudRepository;

    public SearchPatternServiceImpl(SearchEngineCrudRepository searchEngineCrudRepository) {
        this.searchEngineCrudRepository = searchEngineCrudRepository;
    }

    public boolean create(SearchPattern pattern) {

        searchEngineCrudRepository.save(pattern);

        return true;
    }

}
