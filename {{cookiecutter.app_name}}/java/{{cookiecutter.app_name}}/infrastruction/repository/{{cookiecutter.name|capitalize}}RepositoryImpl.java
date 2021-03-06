package {{cookiecutter.pkg}}.{{cookiecutter.name}}.infrastruction.repository;

import org.springframework.stereotype.Repository;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.repository.mapper.{{cookiecutter.name|capitalize}}Mapper;
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.entity.{{cookiecutter.name|capitalize}};
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.repository.{{cookiecutter.name|capitalize}}Repository;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buyou.domain.framework.kernel.EntityListQuery;
import java.util.Collections;
import java.util.List;
/**
 * Generated by code
 *
 * @author evan
 */
@Repository
public class {{cookiecutter.name|capitalize}}RepositoryImpl implements {{cookiecutter.name|capitalize}}Repository{
    
    private final {{cookiecutter.name|capitalize}}Mapper {{cookiecutter.name}}Mapper; 

    public {{cookiecutter.name|capitalize}}RepositoryImpl({{cookiecutter.name|capitalize}}Mapper {{cookiecutter.name}}Mapper) {
        this.{{cookiecutter.name}}Mapper={{cookiecutter.name}}Mapper;
    }

    @Override
    public {{cookiecutter.name|capitalize}} load(Long aLong) {
      var query = Wrappers.<{{cookiecutter.name|capitalize}}>lambdaQuery();
      query.eq({{cookiecutter.name|capitalize}}::get{{cookiecutter.name|capitalize}}Id, aLong);
      return {{cookiecutter.name}}Mapper.selectOne(query);
    }
  
    @Override
    public boolean save({{cookiecutter.name|capitalize}} {{cookiecutter.name}}) {
      if (null == {{cookiecutter.name}}) {
        return false;
      }
      if ({{cookiecutter.name}}.getId() > 0) {
        int res = {{cookiecutter.name}}Mapper.updateById({{cookiecutter.name}});
        return res > 0;
      } else {
        int res = {{cookiecutter.name}}Mapper.insert({{cookiecutter.name}});
        return res > 0;
      }
    }
  
    @Override
    public boolean delete({{cookiecutter.name|capitalize}} {{cookiecutter.name}}) {
      int res = {{cookiecutter.name}}Mapper.deleteById({{cookiecutter.name}}.getId());
      return res > 0;
    }
  
    @Override
    public List<{{cookiecutter.name|capitalize}}> list(EntityListQuery entityListQuery) {
      if (null == entityListQuery) {
        return Collections.emptyList();
      }
      var page = (Page<{{cookiecutter.name|capitalize}}>) entityListQuery.getPage();
      var query = (Wrapper<{{cookiecutter.name|capitalize}}>) entityListQuery.getQuery();
  
      var p = {{cookiecutter.name}}Mapper.selectPage(page, query);
      return p.getRecords();
    }

    @Override
    public int count(EntityListQuery entityListQuery) {
      if (null == entityListQuery) {
        return 0;
      }
      var query = (Wrapper<{{cookiecutter.name|capitalize}}>) entityListQuery.getQuery();
      return {{cookiecutter.name}}Mapper.selectCount( query);
    }
}
