package spring.core.services;

import org.springframework.stereotype.Component;
import spring.core.interfaces.Coach;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println(getClass().getSimpleName() + " inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley for 30 minutes";
    }
}
