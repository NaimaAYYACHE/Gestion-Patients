package com.emsi.jdbc.security.repositories;

import com.emsi.jdbc.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser ,String> {
    AppUser findByUsername(String u);
}
