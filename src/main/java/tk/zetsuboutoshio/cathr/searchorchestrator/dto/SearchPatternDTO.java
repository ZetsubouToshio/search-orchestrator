package tk.zetsuboutoshio.cathr.searchorchestrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;


@Data
public class SearchPatternDTO implements Serializable {

    private String id;
    private String source;
    private Map<String, String> properties;

}
