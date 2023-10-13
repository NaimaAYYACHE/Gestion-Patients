package com.emsi.thym;

import com.emsi.thym.entities.Patient;
import com.emsi.thym.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class ThymApplication  {
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(ThymApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
        PasswordEncoder passwordEncoder = passwordEncoder();
        return args -> {
            UserDetails u1 = jdbcUserDetailsManager.loadUserByUsername("user11");

          if(u1==null){
          jdbcUserDetailsManager.createUser(
                  User.withUsername("user22").password(passwordEncoder.encode("1234")).roles("USER").build()
          );
            }
          if(u1==null){
                jdbcUserDetailsManager.createUser(
                        User.withUsername("admin2").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()
                );
          }
        };
    }

}
