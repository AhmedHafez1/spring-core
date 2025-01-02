package spring.core.services;

import spring.core.interfaces.Coach;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println( getClass().getSimpleName() + " inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
