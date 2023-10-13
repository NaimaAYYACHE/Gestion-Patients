package com.emsi.thym.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "403";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
