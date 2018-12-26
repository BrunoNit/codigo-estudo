package br.com.pueyo.cdi.injection;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Runner {
    
     public static void main(String[] args) {
         SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
         SeContainer container = containerInit.initialize();
         container.getBeanManager().fireEvent(new SimpleEvent());
         container.close();

    }

}
