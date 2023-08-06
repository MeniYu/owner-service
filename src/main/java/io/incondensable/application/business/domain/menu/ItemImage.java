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
public class ItemImage {

    @Id
    @GeneratedValue(generator = "imagePrimaryKeyGenerator")
    @GenericGenerator(
            name = "imagePrimaryKeyGenerator",
            parameters = @Parameter(
                    name = "property", value = "user"
            )
    )
    private Long id;

    private String name;
    private String format;
    private int sizeInByte;
    private String description;

    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    private Item item;

    private Long setId(Long id) {
        return this.id;
    }
}
