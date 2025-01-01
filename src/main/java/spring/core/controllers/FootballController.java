package spring.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.core.interfaces.Coach;

@RestController
@RequestMapping("/football")
public class FootballController {
    private final Coach coach;

    @Autowired
    public FootballController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
