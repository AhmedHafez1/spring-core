package spring.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.core.interfaces.Coach;

@RestController
@RequestMapping("/sport")
public class SportController {
    private final Coach coach;

    @Autowired
    public SportController(@Qualifier("footballCoach") Coach coach) {
        this.coach = coach;
        System.out.println(getClass().getName() + " inside constructor");
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
