package com.example.study.repository;


import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.Partner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class PartnerRepositoryTest extends StudyApplicationTests {

    @Autowired
    private PartnerRepository partnerRepository;
    @Test
    public void create(){
        String name = "Partner01";
        String status = "REGISTERED";
        String address = "수원시 영통구";
        String callCenter = "070-1111-2222";
        String partnerNumber = "010-1234-1222";
        String businessNumber = "1234567890123";
        String ceoName = "김도영";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";
        Long categoryId = 1L;

        Partner partner = new Partner();
        partner.setName(name);
        partner.setStatus(status);
        partner.setAddress(address);
        partner.setCallCenter(callCenter);
        partner.setPartnerNumber(partnerNumber);
        partner.setBusinessNumber(businessNumber);
        partner.setCeoName(ceoName);
        partner.setRegisteredAt(registeredAt);
        partner.setCreatedAt(createdAt);
        partner.setCreatedBy(createdBy);
       // partner.setCategoryId(categoryId);

        Partner newPartner = partnerRepository.save(partner);
        Assertions.assertNotNull(newPartner);
        Assertions.assertEquals(newPartner.getName(),name);

    }
    @Test
    public void read(){

        Optional<Partner> optionalPartner = partnerRepository.findById(1L);

        optionalPartner.ifPresent(c->{
            System.out.println(c.getId());
            System.out.println(c.getName());
            System.out.println(c.getAddress());
        });
    }
}
