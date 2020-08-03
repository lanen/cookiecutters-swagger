package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import com.buyou.framework.spring.apispec.ApiResponseDto;
import com.buyou.framework.spring.apispec.PageDto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.newObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.service.{{cookiecutter.name|capitalize}}Service;
import com.buyou.framework.spring.cache.EtagCacheControl;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

/**
 * generate by code.
 * 
 * @author evan
 */
@SpringBootTest(webEnvironment = RANDOM_PORT)
class {{cookiecutter.name|capitalize}}ControllerTest {

  private static final Logger logger = LoggerFactory.getLogger({{cookiecutter.name|capitalize}}ControllerTest.class);

  @Mock private {{cookiecutter.name|capitalize}}Service {{cookiecutter.name}}Service;

  @InjectMocks private {{cookiecutter.name|capitalize}}Controller {{cookiecutter.name}}Controller;

  @BeforeEach 
  void setUp() {
    RestAssuredMockMvc.standaloneSetup({{cookiecutter.name}}Controller);
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void create{{cookiecutter.newObject}}() {
    var dto = new {{cookiecutter.newObject}}Dto();
    dto.setName("hello");

    given()
      .contentType(ContentType.JSON)
      .body(dto)
    .when()
        .post("/{{cookiecutter.name}}")
    .then()
        .log()
        .ifValidationFails()
        .statusCode(200)
        .body(containsString("Success"));
  }

  @Test
  void delete() {
   
  }

  @Test
  void get{{cookiecutter.simpleObject}}() {
    
  }

  @Test
  void get{{cookiecutter.simpleObject}}List() {
    
  }

  @Test
  void update{{cookiecutter.simpleObject}}() {
  }
}
