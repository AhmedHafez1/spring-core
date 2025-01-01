package spring.core.services;

import org.springframework.stereotype.Component;
import spring.core.interfaces.Coach;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practise your kicking and passing for 30 minutes";
    }
}
