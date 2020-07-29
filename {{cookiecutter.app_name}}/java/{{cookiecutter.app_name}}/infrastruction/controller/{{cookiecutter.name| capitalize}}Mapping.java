package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.controller;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.newObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.simpleObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.entity.{{cookiecutter.name|capitalize}};
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Create date 2020/7/16.
 *
 * @author evan
 */
@Mapper
public interface {{cookiecutter.name|capitalize}}Mapping {

  {{cookiecutter.name|capitalize}}Mapping IN = Mappers.getMapper({{cookiecutter.name|capitalize}}Mapping.class);

  @Mappings({
    @Mapping(source = "name", target = "name"),
    @Mapping(source = "{{cookiecutter.name}}Id", target = "{{cookiecutter.name}}Id")
  })
  {{cookiecutter.simpleObject}}Dto to{{cookiecutter.name|capitalize}}Dto({{cookiecutter.name|capitalize}} {{cookiecutter.name}});

  List<{{cookiecutter.simpleObject}}Dto> to{{cookiecutter.name|capitalize}}DtoList(List<{{cookiecutter.name|capitalize}}> {{cookiecutter.name}}List);
}
