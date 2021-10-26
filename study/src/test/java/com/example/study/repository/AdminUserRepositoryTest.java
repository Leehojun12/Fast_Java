package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.AdminUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;


public class AdminUserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Test
    public void create(){

        AdminUser adminUser = new AdminUser();
        adminUser.setAccount("AdminUser01");
        adminUser.setPassword("1234");
        adminUser.setStatus("REGISTERED");
        adminUser.setRole("PARTNER");
        //adminUser.setCreatedAt(LocalDateTime.now());
       // adminUser.setCreatedBy("AdminServer");

        AdminUser newAdminUser = adminUserRepository.save(adminUser);

        Assertions.assertNotNull(newAdminUser);
        newAdminUser.setAccount("CHANGE");
        adminUserRepository.save(newAdminUser);
    }
    @Test
    public void read(){

        Optional<AdminUser> optionalAdminUser = adminUserRepository.findById(1L);

        optionalAdminUser.ifPresent(c->{
            System.out.println(c.getId());
            System.out.println(c.getStatus());
            System.out.println(c.getRole());
        });
    }
    @Test
    public void update(){

    }
    @Test
    public void delete(){

    }
}
