package tk.zetsuboutoshio.cathr.searchorchestrator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchPattern;

import java.util.UUID;

@Repository
public interface SearchEngineCrudRepository extends CrudRepository<SearchPattern, UUID> {
}
