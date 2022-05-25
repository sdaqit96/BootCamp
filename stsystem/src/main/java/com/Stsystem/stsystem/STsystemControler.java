package com.Stsystem.stsystem;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

@Controller
public class STsystemControler {

    @GetMapping
    String getGame(Model model){
        model.addAttribute("something", "something about atribute");
        model.addAttribute("matchs", Arrays.asList( new CricketMatch("Pak", "India", LocalDate.of(2022, 5, 26), LocalTime.of(5,30)),
                new CricketMatch("Poland", "Lativa", LocalDate.of(2022, 5, 27), LocalTime.of(5,30)),
                new CricketMatch("Germany", "India", LocalDate.of(2022, 5, 26), LocalTime.of(5,30)),
                new CricketMatch("Malta", "Ukraine", LocalDate.of(2022, 5, 27), LocalTime.of(5,30)),
                new CricketMatch("Belarus", "Russia", LocalDate.of(2022, 5, 26), LocalTime.of(5,30)),
                new CricketMatch("Itely", "Spain", LocalDate.of(2022, 5, 27), LocalTime.of(5,30)),
                new CricketMatch("Grace", "Portugal", LocalDate.of(2022, 5, 27), LocalTime.of(5,30)),
        new CricketMatch("UK", "Canda", LocalDate.of(2022, 5, 28), LocalTime.of(5,30)
        )));
        return "index";
    }
}
