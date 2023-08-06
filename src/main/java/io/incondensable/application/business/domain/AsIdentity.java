package io.incondensable.application.business.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * @author abbas
 */
@MappedSuperclass
public abstract class AsIdentity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meniyu_id_generator")
    private Long id;

    public Long getId() {
        return id;
    }
}
