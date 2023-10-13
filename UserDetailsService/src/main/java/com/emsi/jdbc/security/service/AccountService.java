package com.emsi.jdbc.security.service;

import com.emsi.jdbc.security.entities.AppRole;
import com.emsi.jdbc.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username,String password,String eamil,String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username,String role);
    void removeRoleFromUser(String username,String role);

    AppUser loadUserByUsername(String username);

}
