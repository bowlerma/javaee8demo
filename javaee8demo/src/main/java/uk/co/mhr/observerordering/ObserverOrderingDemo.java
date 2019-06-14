/**
 * (c) Midland Software Limited 2019
 * Name     : ObserverOrderingDemo.java
 * Author   : bowlerm
 * Date     : 14 Jun 2019
 */
package uk.co.mhr.observerordering;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 *f
 */
public class ObserverOrderingDemo {

    public static void main(final String[] args) {

        SeContainerInitializer containerInitializer = SeContainerInitializer.newInstance();
        try (SeContainer container = containerInitializer.initialize()){

            for (int i = 1; i <= 10; i++) {
                System.out.println("TEST RUN " + i);
                container.getBeanManager().fireEvent(new OrderingEvent());
            }

        }
    }
}
