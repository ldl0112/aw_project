package com.woniu.aw.springboot.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {
    public static void main(String[] args) {
        // 执行
        FastAutoGenerator
                .create("jdbc:mysql://103.39.222.147:3306/aw_db?useSSL=false&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=Asia/Shanghai", "root", "pactera123A")
                .globalConfig(builder -> {
                    // 设置作者
                    builder.author("ldl")
                            // 开启 swagger 模式
                            .fileOverride().enableSwagger()
                            //禁止打开输出目录
                            .disableOpenDir()
                            // 指定输出目录
                            .outputDir("D:\\generator");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.woniu.aw.springboot.jgdt")
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\generator"));
                })
                .strategyConfig(builder -> {
                    // 需要被解析的表名
                    builder.addInclude("user");
                    builder.entityBuilder().enableLombok().enableTableFieldAnnotation();
                    builder.controllerBuilder().enableRestStyle();
                })
                // EnhanceFreemarkerTemplateEngine 里主要重写对自定义类的处理 如vo dto convert等
                .templateEngine(new EnhanceFreemarkerTemplateEngine()).execute();
    }
}
