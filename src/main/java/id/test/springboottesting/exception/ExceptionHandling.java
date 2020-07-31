package id.test.springboottesting.exception;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;


/**
 * @author e1077326
 *
 */
@Profile("test")
@ControllerAdvice
public class ExceptionHandling implements ProblemHandling {
}
