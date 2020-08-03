package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.errno;

import com.buyou.domain.framework.errno.ErrorNo;


/**
 * generate by code.
 *
 * @author evan
 */
public interface {{cookiecutter.name|capitalize}}Errors {

  ErrorNo NOT_FOUND = ErrorNo.of({{cookiecutter.moduleCode}}100100, "NOT FOUND");
  ErrorNo CREATE_ERROR = ErrorNo.of({{cookiecutter.moduleCode}}100101, "CREATE ERROR");
  ErrorNo DELETE_ERROR = ErrorNo.of({{cookiecutter.moduleCode}}100102, "DELETE ERROR");
  ErrorNo OWNER_ERROR = ErrorNo.of({{cookiecutter.moduleCode}}100103, "OWNER ERROR");
  ErrorNo INPUT_ERROR = ErrorNo.of({{cookiecutter.moduleCode}}100104, "INPUT FOUND");
  ErrorNo ALREADY_EXISTS_ERROR = ErrorNo.of({{cookiecutter.moduleCode}}100105, "ALREADY EXISTS ERROR");
  
}
