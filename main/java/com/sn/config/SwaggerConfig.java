package com.sn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * swagger配置类
 */
@EnableOpenApi
@Configuration
public class SwaggerConfig {

    //配置Swagger的Docket的bean实例
    @Bean
    public Docket docket(Environment environment ) {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo());//配置Swagger信息
        //设置要配置的Swagger环境
        Profiles p = Profiles.of("dev", "test");
        //通过environment.acceptsProfiles判断是否处在自己设定的环境中
        boolean flag = environment.acceptsProfiles(p);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//配置Swagger信息
                .groupName("设备在线")
//                .enable(flag)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.Controller"))
//                .paths(PathSelectors.any())
//                .build()
                ;
    }

    //配置Swagger信息
    /*String title, String description,
     String version, String termsOfServiceUrl,
     Contact contact, String license,
     String licenseUrl,
     Collection<VendorExtension> vendorExtensions*/
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "ERP前后端分离项目-接口文档",
                "/swagger-ui/index.html可查看文档",
                "1.0",//版本信息
                "",//团队信息的url
                new Contact("帮助文档", "https://blog.csdn.net/m0_53157173/article/details/119454044", ""),//作者信息
                /*Contact(String name, String url, String email)*/
                "",
                "",
                new ArrayList<VendorExtension>()
        );
    }
}

