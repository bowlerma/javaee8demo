/**
 * (c) Midland Software Limited 2019
 * Name     : AsyncEventDemo.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.asyncevents;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

/**
 *f
 */
public class AsyncEventDemo {

    public static void main(final String[] args) {

        SeContainerInitializer containerInitializer = SeContainerInitializer.newInstance();
        try (SeContainer container = containerInitializer.initialize()){

            System.out.println("THREAD ID: " + Thread.currentThread().getId());
            BeanManager bm = container.getBeanManager();
            Bean<AsyncEventProducer> bean = (Bean<AsyncEventProducer>) bm.getBeans(AsyncEventProducer.class).iterator().next();
            CreationalContext<AsyncEventProducer> ctx = bm.createCreationalContext(bean);
            AsyncEventProducer producer = (AsyncEventProducer) bm.getReference(bean, AsyncEventProducer.class, ctx);
            producer.createEvent();
        }
    }
}
