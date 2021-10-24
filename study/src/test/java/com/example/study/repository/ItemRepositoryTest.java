package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Optional;

public class ItemRepositoryTest extends StudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){

        Item item = new Item();
        item.setName("노트북");
        item.setPrice(100000);
        item.setContent("맥북");

        Item newItem = itemRepository.save(item);
        System.out.println("newItem : " + newItem);

    }

    @Test
    @Transactional
    public void read(){

        Long id = 1L;

        Optional<Item> item = itemRepository.findById(id);

        //Assert.assertTrue(item);

        item.ifPresent(i->{
            System.out.println(i);
        });
    }

    @Test
    public void update(){

    }

    @Test
    public void delete(){

    }
}
