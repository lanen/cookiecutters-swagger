package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.controller;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.api.{{cookiecutter.name|capitalize}}Api;
import com.buyou.framework.spring.apispec.ApiResponseDto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.newObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.simpleObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.service.{{cookiecutter.name|capitalize}}Service;
import com.buyou.framework.spring.cache.EtagCacheControl;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * generate by code.
 * 
 * @author evan
 */
@RestController
public class {{cookiecutter.name|capitalize}}Controller implements {{cookiecutter.name|capitalize}}Api {

  private final {{cookiecutter.name|capitalize}}Service {{cookiecutter.name}}Service;

  private static final Logger logger = LoggerFactory.getLogger({{cookiecutter.name|capitalize}}Controller.class);

  public {{cookiecutter.name|capitalize}}Controller({{cookiecutter.name|capitalize}}Service {{cookiecutter.name}}Service) {
    this.{{cookiecutter.name}}Service = {{cookiecutter.name}}Service;
  }

  @Override
  public ResponseEntity<ApiResponseDto> create{{cookiecutter.newObject}}(@Valid {{cookiecutter.newObject}}Dto {{cookiecutter.newObject}}) {
    logger.info(
        "create new {{cookiecutter.name}} by user {}",
        SecurityContextHolder.getContext().getAuthentication().getName());
    logger.info("create new {{cookiecutter.name}} with dto:{}", {{cookiecutter.newObject}});
    {{cookiecutter.name}}Service.create{{cookiecutter.name|capitalize}}({{cookiecutter.newObject}});
    return ResponseEntity.ok(new ApiResponseDto.Success<Object>().build());
  }

  @Override
  public ResponseEntity<ApiResponseDto> delete{{cookiecutter.simpleObject}}(Long id) {
    var entity = {{cookiecutter.name}}Service.delete{{cookiecutter.name|capitalize}}(id);
    if (null == entity) {
      return ResponseEntity.ok(new ApiResponseDto.Error<Object>().build());
    }
    return ResponseEntity.ok(new ApiResponseDto.Success<Object>().build());
  }

  @Override
  public ResponseEntity<{{cookiecutter.simpleObject}}Dto> get{{cookiecutter.simpleObject}}(Long id) {
    var {{cookiecutter.name}} = this.{{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}(id);
    var dto = {{cookiecutter.name|capitalize}}Mapping.IN.to{{cookiecutter.name|capitalize}}Dto({{cookiecutter.name}});
    return ResponseEntity.ok()
        .eTag(EtagCacheControl.etagId({{cookiecutter.name}}.getName()))
        .cacheControl(EtagCacheControl.etagCacheControl())
        .body(dto);
  }

  @Override
  public ResponseEntity<List<{{cookiecutter.simpleObject}}Dto>> get{{cookiecutter.simpleObject}}List() {
    return ResponseEntity.ok({{cookiecutter.name|capitalize}}Mapping.IN.to{{cookiecutter.name|capitalize}}DtoList({{cookiecutter.name}}Service.get{{cookiecutter.name|capitalize}}List()));
  }

  @Override
  public ResponseEntity<ApiResponseDto> update{{cookiecutter.simpleObject}}(Long id,
      @Valid {{cookiecutter.simpleObject}}Dto {{cookiecutter.simpleObject}}) {
    return null;
  }
}
