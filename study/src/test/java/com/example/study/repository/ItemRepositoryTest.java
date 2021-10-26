package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class ItemRepositoryTest extends StudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){

       Item item = new Item();
       item.setStatus("UNTEGISTERED");
       item.setName("삼성 노트북");
       item.setTitle("삼성 노트북 A100");
       item.setContent("2019년형 노트북입니다");
       item.setPrice(100000);
       item.setBrandName("삼성");
       item.setRegisteredAt(LocalDateTime.now());
       item.setCreatedAt(LocalDateTime.now());
       item.setCreatedBy("Partner01");
       item.setPartnerId(1L); //외래키 설정하고 실행 partnerId는 무조건 있어야된다

        Item newItem = itemRepository.save(item);
        Assertions.assertNotNull(newItem);

    }

    @Test
    @Transactional
    public void read(){

        Long id = 1L;

        Optional<Item> optionalItem = itemRepository.findById(id);

        optionalItem.ifPresent(c->{
            System.out.println(c.getId());
            System.out.println(c.getBrandName());
        });

    }

    @Test
    public void update(){

    }

    @Test
    public void delete(){

    }
}
