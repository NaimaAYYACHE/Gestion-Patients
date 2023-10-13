package com.emsi.jdbc;

import com.emsi.jdbc.security.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
public class JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // @Bean
    CommandLineRunner commandLineRunnerUserDetails(AccountService accountService){
        return args -> {
           accountService.addNewRole("USER");
           accountService.addNewRole("ADMIN");

           accountService.addNewUser("naima","1234","naima.ayyache@gmail.com","1234");
           accountService.addNewUser("user2","1234","naima.ayyache@gmail.com","1234");
           accountService.addNewUser("admin","1234","naima.ayyache@gmail.com","1234");

           accountService.addRoleToUser("naima","USER");
           accountService.addRoleToUser("user2","USER");
           accountService.addRoleToUser("admin","USER");
           accountService.addRoleToUser("admin","ADMIN");
        };
    }
}
