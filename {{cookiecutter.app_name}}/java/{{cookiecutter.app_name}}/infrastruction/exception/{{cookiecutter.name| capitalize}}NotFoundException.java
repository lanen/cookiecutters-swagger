package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.exception;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.errno.MessageErrors;

import com.buyou.domain.framework.exception.DomainException;

/**
 * generate by code.
 * 
 * @author evan
 */
public class {{cookiecutter.name|capitalize}}NotFoundException extends DomainException {

  public {{cookiecutter.name|capitalize}}NotFoundException() {
    super(MessageErrors.NOT_FOUND);
  }
}
