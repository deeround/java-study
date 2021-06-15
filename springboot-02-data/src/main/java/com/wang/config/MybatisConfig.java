package com.wang.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

//使用MapperScan批量扫描所有Mapper接口，就不用在每个Mapper接口上添加Mapper注解
@MapperScan(value = "com.wang.mapper")
public class MybatisConfig {
    //自定义mybatis规则，给容器添加一个ConfigurationCustomizer组件
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
