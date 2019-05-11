//package com.example.security.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
//import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import java.util.List;
//@Configuration
//public class XmlMessageConvertConfig extends WebMvcConfigurationSupport {
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        Jackson2ObjectMapperBuilder builder = Jackson2ObjectMapperBuilder.xml();
//        builder.indentOutput(true);
//        converters.add(new MappingJackson2XmlHttpMessageConverter(builder.build()));
//        super.configureMessageConverters(converters);
//    }
//}
