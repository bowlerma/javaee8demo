/**
 * (c) Midland Software Limited 2019
 * Name     : AsyncEventHandler.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.asyncevents;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;

/**
 *
 */
public class AsyncEventHandler {

    public void eventHandler(@Observes AsyncEvent event) {
        System.out.println("THREAD ID: " + Thread.currentThread().getId());
    }
}
