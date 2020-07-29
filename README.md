# cookiecutters-swagger

## 配置文件

```

{
    "project_name": "Swagger API Spec",
    "app_name": "message",
    "name": "message",
    "pkg": "com.buyou.topic",
    "newObject": "CreateMessage",
    "simpleObject": "SimpleMessage",
    "moduleCode": 100
}
```

- newObject : CRUD 中新增需要的DTO
- simpleObject： 获取简易对象的DTO
- moduleCode： 模块的错误码排位 {{moduleCode}}1001001
- name： 模块名（小写）
- pkg： base package

## 当前工程

1. 生成swagger.yaml文件
2. 生成swagger 代码生成配置文件
3. java 工程脚手架

###  java 工程脚手架

支持的特性：

1. controller (CRUD)
2. service (CRUD)
3. errno
4. domain 与 domain service


