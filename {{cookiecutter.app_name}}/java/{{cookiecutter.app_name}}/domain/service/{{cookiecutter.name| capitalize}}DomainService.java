package {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.service;

import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.entity.{{cookiecutter.name|capitalize}};
import {{cookiecutter.pkg}}.{{cookiecutter.name}}.domain.repository.{{cookiecutter.name|capitalize}}Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.function.Supplier;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buyou.domain.framework.Command;
import com.buyou.domain.framework.kernel.EntityListQuery;

/**
 * Generated by code
 *
 * @author evan
 */
public class {{cookiecutter.name|capitalize}}DomainService {

    private static final Logger logger = LoggerFactory.getLogger({{cookiecutter.name|capitalize}}DomainService.class);
    
    private final {{cookiecutter.name|capitalize}}Repository {{cookiecutter.name}}Repository;

    private final {{cookiecutter.name|capitalize}}Lifecycle {{cookiecutter.name}}Lifecycle;

    public {{cookiecutter.name|capitalize}}DomainService({{cookiecutter.name|capitalize}}Repository {{cookiecutter.name}}Repository) {
        if (null == {{cookiecutter.name}}Repository) {
            throw new IllegalStateException("{{cookiecutter.name}}Repository is null");
        }
        this.{{cookiecutter.name}}Repository = {{cookiecutter.name}}Repository;
        this.{{cookiecutter.name}}Lifecycle = new {{cookiecutter.name|capitalize}}Lifecycle({{cookiecutter.name}}Repository);
    }


    public {{cookiecutter.name|capitalize}} new{{cookiecutter.name|capitalize}}(Supplier<{{cookiecutter.name|capitalize}}> supplier) {
        return this.{{cookiecutter.name}}Lifecycle.startEntity(supplier);
    }

    public {{cookiecutter.name|capitalize}} delete{{cookiecutter.name|capitalize}}(Long id) {
        var entity = get{{cookiecutter.name|capitalize}}(id);
        if (this.{{cookiecutter.name}}Lifecycle.destroyEntity(entity)) {
            logger.info("delete {{cookiecutter.name}} entity {} success", id);
        } else {
            logger.info("delete {{cookiecutter.name}} entity {} fail", id);
            return null;
        }
        return entity;
    }

    public boolean update{{cookiecutter.name|capitalize}}(Long id, {{cookiecutter.name|capitalize}} changed) {
        var entity = get{{cookiecutter.name|capitalize}}(id);
        if (null != entity) {
            entity.setName(changed.getName());
            return this.{{cookiecutter.name}}Repository.save(entity);
        }
        return false;
    }

    /** @return */
    public List<{{cookiecutter.name|capitalize}}> get{{cookiecutter.name|capitalize}}List() {
        var query = Wrappers.<{{cookiecutter.name|capitalize}}>lambdaQuery();
        var elq = new EntityListQuery(new Page<{{cookiecutter.name|capitalize}}>(1, 100), query);
        return this.{{cookiecutter.name}}Repository.list(elq);
    }

    /** @return */
    public int get{{cookiecutter.name|capitalize}}Count() {
        var query = Wrappers.<{{cookiecutter.name|capitalize}}>lambdaQuery();
        var elq = new EntityListQuery(null, query);
        return this.{{cookiecutter.name}}Repository.count(elq);
    }

    public {{cookiecutter.name|capitalize}} get{{cookiecutter.name|capitalize}}(Long id) {
        if (null == id || id < 0) {
            return null;
        }
        return this.{{cookiecutter.name}}Repository.load(id);
    }

    /**
     * 演示： 1. 没有参数的函数调用 2. 没有返回对象
     *
     * @param idSupplier
     * @return
     */
    public {{cookiecutter.name|capitalize}} voidFunction(Supplier<Long> idSupplier) {
        return {{cookiecutter.name}}Lifecycle.handleCommand(idSupplier, {{cookiecutter.name|capitalize}}::working);
    }

    /**
     * 演示： 1. 参数的函数调用 2. 没有返回对象
     *
     * @param idSupplier
     * @param command
     * @return
     */
    public {{cookiecutter.name|capitalize}} voidFunctionWithCommand(Supplier<Long> idSupplier, Command command) {
        var {{cookiecutter.name}} = this.{{cookiecutter.name}}Repository.load(idSupplier.get());
        return {{cookiecutter.name}}Lifecycle.handleCommand(idSupplier, {{cookiecutter.name}}, {{cookiecutter.name}}::working, command);
    }

    /**
     * 演示： 1. 参数的函数调用 2. 有返回对象
     *
     * @param idSupplier
     * @param command
     * @return
     */
    public {{cookiecutter.name|capitalize}} voidFunctionWidthCommandAndReturn(Supplier<Long> idSupplier, Command command) {
        var {{cookiecutter.name}} = this.{{cookiecutter.name}}Repository.load(idSupplier.get());
        return {{cookiecutter.name}}Lifecycle.handleCommand(
            idSupplier, {{cookiecutter.name}}, {{cookiecutter.name}}::working0, command, (result) -> {});
    }

}
