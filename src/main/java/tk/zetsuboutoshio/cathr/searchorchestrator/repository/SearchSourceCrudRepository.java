package tk.zetsuboutoshio.cathr.searchorchestrator.repository;

import org.springframework.data.repository.CrudRepository;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchSource;

public interface SearchSourceCrudRepository extends CrudRepository<SearchSource, Integer> {
    SearchSource findByName(String name);
}
