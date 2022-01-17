package com.qmq.springbootpoj.Utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author QMQ_bd137
 * @create_time is 2022-01-17 11:27
 * mybatis-plus自动代码生成工具
 */
public class mybatisPlusGeneratorUtil {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://120.77.96.42:3306/ManageDB_Dev?useUnicode=true&characterEncoding=utf-8&relaxAutoCommit=true&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
        String username = "root";
        String pwd = "mc124289";
        FastAutoGenerator.create(jdbcUrl, username, pwd)
                .globalConfig(builder -> {
                    builder.author("bdQmq") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\WorkSpace\\CZBank\\SpringBootPOJ\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.qmq.springbootpoj") // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\WorkSpace\\CZBank\\SpringBootPOJ\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("MS_User")// 设置需要生成的表名
                            .addTablePrefix("MS_"); // 设置过滤表前缀(参数输入多个)
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
