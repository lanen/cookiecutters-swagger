package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.service;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.newObject}}Dto;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.dto.{{cookiecutter.simpleObject}}Dto;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.entity.{{cookiecutter.name|capitalize}};
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.service.{{cookiecutter.name|capitalize}}DomainService;
import java.util.List;
import java.util.function.Supplier;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * generate by code.
 * 
 * @author evan
 */
@Service
public class {{cookiecutter.name|capitalize}}Service {
   
  private final {{cookiecutter.name|capitalize}}DomainService {{cookiecutter.name}}DomainService;

  /** */
  private Supplier<Long> idGenerator;

  public {{cookiecutter.name|capitalize}}Service({{cookiecutter.name|capitalize}}DomainService {{cookiecutter.name}}DomainService,
      ObjectProvider<Supplier<Long>> idGenerator) {
      this.{{cookiecutter.name}}DomainService = {{cookiecutter.name}}DomainService;
      this.idGenerator = idGenerator.getIfAvailable();
      if (null == this.idGenerator) {
         throw new IllegalStateException("idGenerator is null");
      }
   }

  @Transactional
  public void create{{cookiecutter.name|capitalize}}({{cookiecutter.newObject}}Dto {{cookiecutter.newObject|lower}}) {
     {{cookiecutter.name}}DomainService.new{{cookiecutter.name|capitalize}}(
         () -> {
           var new{{cookiecutter.name|capitalize}} = new {{cookiecutter.name|capitalize}}();
           new{{cookiecutter.name|capitalize}}.setName({{cookiecutter.newObject|lower}}.getName());
           new{{cookiecutter.name|capitalize}}.set{{cookiecutter.name|capitalize}}Id(this.idGenerator.get());
           return new{{cookiecutter.name|capitalize}};
         });
   }
 
  public List<{{cookiecutter.name|capitalize}}> get{{cookiecutter.name|capitalize}}List() {
    return {{cookiecutter.name}}DomainService.get{{cookiecutter.name|capitalize}}List();
  }
 
  public {{cookiecutter.name|capitalize}} get{{cookiecutter.name|capitalize}}(Long {{cookiecutter.name}}Id) {
    return this.{{cookiecutter.name}}DomainService.get{{cookiecutter.name|capitalize}}({{cookiecutter.name}}Id);
  }

  @Transactional
  public {{cookiecutter.name|capitalize}} delete{{cookiecutter.name|capitalize}}(Long id) {
    return this.{{cookiecutter.name}}DomainService.delete{{cookiecutter.name|capitalize}}(id);
  }
  
  @Transactional
  public boolean update{{cookiecutter.name|capitalize}}(Long id, {{cookiecutter.simpleObject}}Dto dto) {
    // TODO: You must change it. 不同业务的更新规则不一样
    return this.{{cookiecutter.name}}DomainService.update{{cookiecutter.name|capitalize}}(id, null);
  }
 
}
