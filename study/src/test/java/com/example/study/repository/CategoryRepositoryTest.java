package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entitiy.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;


public class CategoryRepositoryTest extends StudyApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void create(){

        String type = "COMPUTER";
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        Category category = new Category();
        category.setType(type);
        category.setTitle(title);
        category.setCreatedAt(createdAt);
        category.setCreatedBy(createdBy);

        Category newCategory = categoryRepository.save(category);
        Assertions.assertEquals(newCategory.getType(),type);
        Assertions.assertNotNull(newCategory);
        Assertions.assertEquals(newCategory.getType(),type);
        Assertions.assertEquals(newCategory.getTitle(),title);

    }
    @Test
    public void read(){

        String type = "COMPUTER";

        Optional<Category> optionalCategory = categoryRepository.findById(2L);

        // select * from category where type = 'COMPUTER'

        optionalCategory.ifPresent(c ->{


            System.out.println(c.getId());
            System.out.println(c.getType());
            System.out.println(c.getTitle());
        });

    }
    @Test
    public void Update(){

    }
    @Test
    public void Delete(){


        Optional<Category> Category = categoryRepository.findById(2L);

        Category.ifPresent(c->{
            categoryRepository.delete(c);
        });
        Optional<Category> deleteCategory = categoryRepository.findById(2L);
        if(deleteCategory.isPresent()){
            System.out.println(" 데이터 :" +deleteCategory.get());
        }else{
            System.out.println("데이터 삭제, 데이터 없음");
        }

    }
}
