package io.incondensable.application.business.domain.menu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author abbas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuHeaderIcon {

    @Id
    @GeneratedValue(generator = "headerIconPrimaryKeyGenerator")
    @GenericGenerator(name = "headerIconPrimaryKeyGenerator",
            parameters = @Parameter(
                    name = "property", value = "user"
            ))
    private Long id;

    private String name;
    private String format;
    private int sizeInByte;
    private String description;

    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    private MenuHeader header;

    private void setId(Long id) {
        this.id = id;
    }
}
