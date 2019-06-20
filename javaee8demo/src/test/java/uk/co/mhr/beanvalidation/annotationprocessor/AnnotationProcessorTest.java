/**
 * (c) Midland Software Limited 2019
 * Name     : AnnotationProcessorTest.java
 * Author   : bowlerm
 * Date     : 20 Jun 2019
 */
package uk.co.mhr.beanvalidation.annotationprocessor;

import java.lang.reflect.Method;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

import org.junit.jupiter.api.Test;

/**
 *
 */
public class AnnotationProcessorTest {

    @Test
    public void testParameterValidation() throws NoSuchMethodException {
        SubTypeExample typeExample = new SubTypeExample();
        Method method = SubTypeExample.class.getMethod("setTest", String.class);
        Object[] parameterValues = {null};
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        ExecutableValidator executableValidator = factory.getValidator().forExecutables();
        Set<ConstraintViolation<SuperTypeExample>> violations = executableValidator.validateParameters(typeExample, method, parameterValues);
        System.out.println(violations);
    }
}
