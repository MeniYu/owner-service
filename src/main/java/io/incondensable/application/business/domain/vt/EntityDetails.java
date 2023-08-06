package io.incondensable.application.business.domain.vt;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @author abbas
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EntityDetails {

    private String creatorId;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdAt;

    private String updaterId;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updatedAt;

}
