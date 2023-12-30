package io.incondensable.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author abbas
 */
@Component
public class ControllerLogger {

    private final Logger logger = LoggerFactory.getLogger(ControllerLogger.class);

    public void logRequest(String scope, String parameters) {
        logger.info("Request in: " + scope + (parameters.isBlank() ? "" : " with params: " + parameters));
    }

    public void logResponse(String scope, String parameters, long duration) {
        logger.info("Request in: " + scope + (parameters.isBlank() ? "" : " with params: " + parameters) + " in: " + duration + " milliseconds.");
    }

}
