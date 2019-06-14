/**
 * (c) Midland Software Limited 2019
 * Name     : OrderingEventHandler.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.observerordering;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

/**
 *
 */
public class OrderingEventHandler {

    public void eventHandler1(@Observes OrderingEvent event) {
        System.out.println("1 2 3");
    }

    public void eventHandler2(@Observes OrderingEvent event) {
        System.out.println("4 5 6");
    }
}
