# mybatis-gen-maven-plugin
mybatis实体类，xml，mapper生成，maven插件

## Install
```bash
cd path/to/mybatis-gen-maven-plugin
mvn clean install
```

## Usage
Add <build> to project pom as bellow:

```xml
<build>
        <plugins>
            <plugin>
                <groupId>com.wy</groupId>
                <artifactId>mybatis-gen-maven-plugin</artifactId>
                <version>0.0.1-SNAPSHOT</version>
                <configuration>
                    <host>localhost</host>
                    <port>3306</port>
                    <username>root</username>
                    <password>123456</password>
                    <db>sakila</db>
                    <xmlPath>src/main/resources/sqlmap</xmlPath>
                    <mapperPath>/src/main/java/com/wy/test/mapper</mapperPath>
                    <entityPath>/src/main/java/com/wy/test/entity</entityPath>
                    <!--如果强制生成，不创建分支-->
                    <forceGen>true</forceGen>
                    <entityPackage>com.wy.test.entity</entityPackage>
                    <mapperPackage>com.wy.test.mapper</mapperPackage>
                    <!--可选值 copy 和数据库字段一样  underscoreToCamelCase下划线转驼峰-->
                    <nameStrategy>underscoreToCamelCase</nameStrategy>
                    <!--生成代码分支名-->
                    <branchName>testGen</branchName>
                    <tableMap>
                        <actor/>
                    </tableMap>
                </configuration>
            </plugin>
        </plugins>
    </build>
```