package io.incondensable.application.business.domain.jms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author abbas
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleHelloMessage implements Serializable {

    public static final long serialVersionUID = 8275928909016340571L;

    private UUID id;
    private String message;

}
