package spring.core.services;

import org.springframework.stereotype.Component;
import spring.core.interfaces.Coach;

@Component
public class FootballCoach implements Coach {
    public FootballCoach() {
        System.out.println(getClass().getSimpleName() + " inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your kicking and passing for 30 minutes";
    }
}
