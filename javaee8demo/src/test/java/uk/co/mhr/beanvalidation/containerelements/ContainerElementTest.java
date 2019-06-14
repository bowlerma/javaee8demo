/**
 * (c) Midland Software Limited 2019
 * Name     : ContainerElementTest.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.beanvalidation.containerelements;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.Test;

import uk.co.mhr.uk.co.mhr.beanvalidation.containerelements.ContainerElementExample;

/**
 *
 */
public class ContainerElementTest {

    @Test
    public void testContainerElements() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        ContainerElementExample containerElementExample = new ContainerElementExample();
        for (int i = 1; i <= 10; i++) {
            containerElementExample.numbers.add(i);
        }

        assertTrue(validator.validate(containerElementExample).isEmpty());
    }
}
