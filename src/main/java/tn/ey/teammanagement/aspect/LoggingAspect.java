package tn.ey.teammanagement.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 * Aspect for logging execution of service and repository Spring components.
 * @author Wissal Talbi
 *
 */
@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @After("execution(* tn.ey.teammanagement.services.*.get*(..))")
    public void logAfterThrowing(JoinPoint thisJoinPoint) {
        log.info("Out of the method (After)" + thisJoinPoint.getSignature().getName());
    }
}
