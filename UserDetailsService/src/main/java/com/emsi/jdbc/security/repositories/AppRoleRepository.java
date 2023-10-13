package com.emsi.jdbc.security.repositories;

import com.emsi.jdbc.security.entities.AppRole;
import com.emsi.jdbc.security.entities.AppUser;
import org.apache.tomcat.util.descriptor.web.SecurityRoleRef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {

}
