/**
 * (c) Midland Software Limited 2019
 * Name     : AsyncEventProducer.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.asyncevents;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 *
 */
public class AsyncEventProducer {

    @Inject
    private Event<AsyncEvent> event;

    public void createEvent() {
        event.fire(new AsyncEvent());
    }
}
