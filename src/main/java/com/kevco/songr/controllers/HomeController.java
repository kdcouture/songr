package com.kevco.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    // ROUTES
    @GetMapping("/")
    public String getHome(Model m) {
        System.out.println("The root area");
        return "helloworld";
    }

    @GetMapping("/hello")
    public String getHelloRoute() {
        return "helloworld";
    }

    @GetMapping("/capitalize/{word}")
    public String getCapitalizeRoute(@PathVariable(required = false) String word, Model m) {
        String toCap = capitalizeString(word);
        m.addAttribute("wordToChange", toCap);
        return "wordresponse";
    }

    @GetMapping("/reverse")
    public String getReverseRoute(@RequestParam(required = false, defaultValue = "") String sentence, Model m) {
        String toRev = reverseString(sentence);
        m.addAttribute("wordToChange", toRev);
        return "wordresponse";
    }
    // END ROUTES

    // METHODS
    public static String reverseString(String sentence) {
        String[] toReverse = sentence.split(" ");
        String Reversed = "";
        for(int i = toReverse.length-1; i >= 0; i--) {
            Reversed += toReverse[i] + " ";
        }
        return Reversed.trim();
    }

    public static String capitalizeString(String word) {
        return word.toUpperCase();
    }
}
