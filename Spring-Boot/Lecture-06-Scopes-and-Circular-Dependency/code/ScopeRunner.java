package com.example.scope;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ScopeRunner implements CommandLineRunner {
    private final ApplicationContext context;

    public ScopeRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        Object firstSingleton = context.getBean(SingletonBean.class);
        Object secondSingleton = context.getBean(SingletonBean.class);

        Object firstPrototype = context.getBean(PrototypeBean.class);
        Object secondPrototype = context.getBean(PrototypeBean.class);

        System.out.println("Singleton same? " + (firstSingleton == secondSingleton));
        System.out.println("Prototype same? " + (firstPrototype == secondPrototype));
    }
}
