DROP TABLE IF EXISTS `jy_{{cookiecutter.name}}` ;
CREATE TABLE `jy_{{cookiecutter.name}}` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) not null default 0 comment '用户id',
  `{{cookiecutter.name}}_id` bigint(20) NOT NULL COMMENT '业务编号',
  `name` varchar (64) NOT NULL COMMENT '所有者编号',
  `state` tinyint(3) not null default 0 comment '状态',
  `create_time` int(11) not null default 0 comment '创建时间',
  `last_modify` int(11) not null default 0 comment '最近修改时间',
  PRIMARY KEY (`id`),
  KEY(`{{cookiecutter.name}}_id`),
  KEY(`create_time`,`user_id`,`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

