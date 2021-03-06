package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.service.{{cookiecutter.name|capitalize}}DomainService;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.repository.{{cookiecutter.name|capitalize}}Repository;

/**
 * Generated by code
 *
 * @author evan
 */
@Configuration
public class {{cookiecutter.name|capitalize}}Configuration {
   
    @Bean
    public {{cookiecutter.name|capitalize}}DomainService {{cookiecutter.name}}DomainService({{cookiecutter.name|capitalize}}Repository {{cookiecutter.name}}Repository) {
        return new {{cookiecutter.name|capitalize}}DomainService({{cookiecutter.name}}Repository);
    }
}
