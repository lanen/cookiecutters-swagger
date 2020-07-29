package {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.entity.{{cookiecutter.name|capitalize}};
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface {{cookiecutter.name|capitalize}}Mapper extends BaseMapper<{{cookiecutter.name|capitalize}}> {

}