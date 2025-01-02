package spring.core.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.core.interfaces.Coach;

@Component
public class HandballCoach implements Coach {
    public HandballCoach() {
        System.out.println(getClass().getSimpleName() + " inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your dribbling and shooting for 30 minutes";
    }
}
