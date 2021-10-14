package com.jkhhuse.plan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket getUserDocket() {
    ApiInfo apiInfo = new ApiInfoBuilder().title("Plan")// api标题
        .description("Customer相关接口描述")// api描述
        .version("1.0.0")// 版本号
        .build();

    return new Docket(DocumentationType.SWAGGER_2)// 文档类型（swagger2）
        .apiInfo(apiInfo)// 设置包含在json ResourceListing响应中的api元信息
        .select()// 启动用于api选择的构建器
        .apis(RequestHandlerSelectors.basePackage("com.jkhhuse.plan.controller"))// 扫描接口的包
        .paths(PathSelectors.any())// 路径过滤器（扫描所有路径）
        .build();
  }

//  /**
//   * 拦截器配置配置，过滤静态资源
//   */
//  public void addInterceptors(InterceptorRegistry registry) {
//    registry.addInterceptor(new HttpRequestInterceptor())
//            //添加需要验证登录用户操作权限的请求
//            .addPathPatterns("/**")
//            //排除不需要验证登录用户操作权限的请求
//            .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg", "/*.html", "/**/*.html")
//            .excludePathPatterns("/swagger-resources/**");
//  }
//
//  /**
//   * Swagger配置
//   * @param registry
//   */
//  public void addViewControllers(ViewControllerRegistry registry) {
//    registry.addRedirectViewController("/api/v2/api-docs", "/v2/api-docs");
//    registry.addRedirectViewController("/api/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui");
//    registry.addRedirectViewController("/api/swagger-resources/configuration/security", "/swagger-resources/configuration/security");
//    registry.addRedirectViewController("/api/swagger-resources", "/swagger-resources");
//  }
//
//  public void addResourceHandlers(ResourceHandlerRegistry registry) {
//    // 静态资源放行
//    registry.addResourceHandler("/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
//    registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//    registry.addResourceHandler("/api/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//  }
}