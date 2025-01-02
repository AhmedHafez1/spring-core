package spring.core.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import spring.core.interfaces.Coach;

@Component
public class BasketballCoach implements Coach {
    public BasketballCoach() {
        System.out.println(getClass().getSimpleName() + " inside default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(getClass().getSimpleName() + " inside doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(getClass().getSimpleName() + " inside doMyCleanupStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise basketball shooting for 30 minutes";
    }
}
