package com.emsi.jdbc.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "403";
    }
}
