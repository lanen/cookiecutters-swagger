package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.service;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.newObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.service.{{cookiecutter.name|capitalize}}Service;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.entity.{{cookiecutter.name|capitalize}};
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * generate by code.
 * 
 * @author evan
 */
@SpringBootTest
class {{cookiecutter.name|capitalize}}ServiceLT {
   
  @Mock private {{cookiecutter.name|capitalize}}Service {{cookiecutter.name}}Service;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void create{{cookiecutter.name|capitalize}}() {
    var dto = new {{cookiecutter.newObject}}Dto();
    dto.setName("hello");
    var stuff = {{cookiecutter.name}}Service.create{{cookiecutter.name|capitalize}}(dto);
    Assertions.assertNotNull(stuff);

    Assertions.assertEquals(dto.getName(), stuff.getName());
    Assertions.assertTrue(stuff.get{{cookiecutter.name|capitalize}}Id() > 0);
   }
 
  @Test
  void get{{cookiecutter.name|capitalize}}List() {
    var list = {{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}List();
    Assertions.assertNotNull(list);
    this.create{{cookiecutter.name|capitalize}}();
    list = {{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}List();
    Assertions.assertNotNull(list);
    Assertions.assertTrue(!list.isEmpty());
  }

  @Test
  void get{{cookiecutter.name|capitalize}}Count() {
    this.create{{cookiecutter.name|capitalize}}();
    var count = {{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}Count();
    Assertions.assertTrue(0 < count);
  }
 
  @Test
  void get{{cookiecutter.name|capitalize}}() {
    var stuff = {{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}(1L);
    Assertions.assertNull(stuff);
    var dto = new {{cookiecutter.newObject}}Dto();
    dto.setName("hello");
    stuff = {{cookiecutter.name}}Service.create{{cookiecutter.name|capitalize}}(dto);
    var stuff0 = {{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}(stuff.get{{cookiecutter.name|capitalize}}Id());
    Assertions.assertNotNull(stuff0);
    Assertions.assertEquals(stuff.get{{cookiecutter.name|capitalize}}Id(), stuff0.get{{cookiecutter.name|capitalize}}Id());

  }

  @Test
  void delete{{cookiecutter.name|capitalize}}() {
    var dto = new {{cookiecutter.newObject}}Dto();
    dto.setName("hello");
    var stuff = {{cookiecutter.name}}Service.create{{cookiecutter.name|capitalize}}(dto);
    Assertions.assertNotNull(stuff);
    {{cookiecutter.name}}Service.delete{{cookiecutter.name|capitalize}}(stuff.get{{cookiecutter.name|capitalize}}Id());
    stuff = {{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}(stuff.get{{cookiecutter.name|capitalize}}Id());
    Assertions.assertNull(stuff);  
  }
  
  @Test
  void update{{cookiecutter.name|capitalize}}() {
   
  }
 
}
