package br.com.pueyo.cdi.injection;

import javax.enterprise.event.Observes;

public class App {
    
    public void onEvent(@Observes SimpleEvent ignored, SimpleService service) {
        service.run();
    }

}
