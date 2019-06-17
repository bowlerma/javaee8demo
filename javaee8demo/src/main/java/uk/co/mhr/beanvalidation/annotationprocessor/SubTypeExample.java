package uk.co.mhr.beanvalidation.annotationprocessor;

import javax.validation.constraints.NotNull;

public class SubTypeExample extends SuperTypeExample {

    @Override
    public void setTest(String test) {
        super.setTest(test);
    }
}
