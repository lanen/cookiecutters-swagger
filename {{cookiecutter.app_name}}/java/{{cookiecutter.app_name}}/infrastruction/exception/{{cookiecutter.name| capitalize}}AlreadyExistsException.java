package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.exception;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.errno.{{cookiecutter.name|capitalize}}Errors;

import com.buyou.domain.framework.exception.DomainException;

/**
 * generate by code.
 * 
 * @author evan
 */
public class {{cookiecutter.name|capitalize}}AlreadyExistsException extends DomainException {

  public {{cookiecutter.name|capitalize}}AlreadyExistsException() {
    super({{cookiecutter.name|capitalize}}Errors.ALREADY_EXISTS_ERROR);
  }
}
