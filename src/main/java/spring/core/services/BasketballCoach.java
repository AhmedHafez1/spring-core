package spring.core.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.core.interfaces.Coach;

@Component
public class BasketballCoach implements Coach {
    public BasketballCoach() {
        System.out.println(getClass().getName() + " inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise basketball shooting for 30 minutes";
    }
}
