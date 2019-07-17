package tk.zetsuboutoshio.cathr.searchorchestrator.model;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
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
