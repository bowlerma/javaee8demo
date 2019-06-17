/**
 * (c) Midland Software Limited 2019
 * Name     : ContainerElementExample.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.beanvalidation.containerelements;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 *
 */
public class ContainerElementExample {

    public List<@Min(1) @Max(10) Integer> numbers = new ArrayList<>();

}
