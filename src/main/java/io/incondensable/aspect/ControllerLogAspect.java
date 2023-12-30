package io.incondensable.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author abbas
 */
@Aspect
@Configuration
public class ControllerLogAspect {

    private final ControllerLogger logger;

    public ControllerLogAspect(ControllerLogger logger) {
        this.logger = logger;
    }

    @Pointcut("within(io.incondensable.application.web.controllers..*)")
    public void controllerPointcut() {
    }

    @Around(value = "controllerPointcut()")
    public Object aroundLog(ProceedingJoinPoint o) throws Throwable {
        long start = new Date().getTime();
        String parameters = o.getArgs().length != 0 ? o.getArgs()[0].toString() : "";
        String scope = extractScope(o.getSignature().getDeclaringTypeName(), o.getSignature().getName());
        logger.logRequest(scope, parameters);

        Object res = o.proceed();

        long end = new Date().getTime();
        logger.logResponse(scope, res.toString(), (end - start));
        return res;
    }

    private String extractScope(String declaringClassName, String methodName) {
        String[] split = declaringClassName.split("\\.");
        String classname = split[split.length - 1];
        return classname + "." + methodName + "()";
    }

}
