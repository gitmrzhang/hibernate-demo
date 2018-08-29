## hibernate 根据实体创建表

### 测试说明

1. 修改com.zhang.hibernate.demo.entity.UserDO 实体添加字段
2. 程序入口 : com.zhang.hibernate.demo.Application 执行main方法将会在数据库表中增加相应的字段
3. 扫描指定的实体类,EntityScanner.scanPackages("com.zhang.hibernate.demo.entity"),该方法中的路径替换成自己的,可以指定多个路径如:EntityScanner.scanPackages("com.zhang.hibernate.demo.entity","com.zhang.hibernate.demo.entity2")

### 配置说明

1. hibernate的配置在 hibernate.cfg.xml中,修改相应的数据库连接URL