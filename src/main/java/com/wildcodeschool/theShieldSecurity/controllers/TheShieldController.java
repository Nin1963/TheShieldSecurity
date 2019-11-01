package com.wildcodeschool.theShieldSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheShieldController {

    @GetMapping("/")
    public String hello() {
        return "welcome to the SHIELD";
    }
    
    @GetMapping("/avengers/assemble")
    public String ass() {
        return "Avengers... Assemble";
    }
    
    @GetMapping("/secret-bases")
    public String sec() {
        return "    France<br>" + 
        		"<br>" +
        		"    Biarritz<br>" + 
        		"    Bordeaux<br>" + 
        		"    La Loupe 🌲<br>" + 
        		"    Lille<br>" + 
        		"    Lyon<br>" + 
        		"    Marseille<br>" + 
        		"    Nantes<br>" + 
        		"    Orléans<br>" + 
        		"    Paris<br>" + 
        		"    Reims<br>" + 
        		"    Strasbourg<br>" + 
        		"    Toulouse<br>" + 
        		"    Tours<br>" + 
        		"<br>" + 
        		"    Europe<br>" + 
        		"<br>" +
        		"    Berlin<br>" + 
        		"    Bruxelles<br>" + 
        		"    Bucarest<br>" + 
        		"    Lisbonne<br>" + 
        		"    Londres<br>" + 
        		"    Madrid<br>" + 
        		"    Milan";
    }
}