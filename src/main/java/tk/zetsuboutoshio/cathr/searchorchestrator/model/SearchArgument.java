package tk.zetsuboutoshio.cathr.searchorchestrator.model;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "search_arguments")
public class SearchArgument {

    public SearchArgument(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "uuid", updatable = false, nullable = false)
    private UUID uuid;

    @Column(name = "search_pattern_uuid")
    private UUID searchPatternUUID;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;

}
