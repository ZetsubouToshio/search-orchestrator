package tk.zetsuboutoshio.cathr.searchorchestrator.service;

import tk.zetsuboutoshio.cathr.searchorchestrator.dto.SearchPatternDTO;
import tk.zetsuboutoshio.cathr.searchorchestrator.model.SearchPattern;

public interface SearchPatternConverterService {
    SearchPattern fromDTO(SearchPatternDTO dto);
    SearchPatternDTO toDTO(SearchPattern pattern);
}
