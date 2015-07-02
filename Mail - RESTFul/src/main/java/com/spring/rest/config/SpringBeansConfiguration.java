package com.spring.rest.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.rest", includeFilters = @ComponentScan.Filter(RestController.class))
public class SpringBeansConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {

		System.out.println("Configuring message converters");

		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		jsonConverter.setObjectMapper(objectMapper());
		List<MediaType> supportedMedias = new ArrayList<MediaType>();
		supportedMedias.add(new MediaType("application", "json"));
		supportedMedias.add(new MediaType("text", "json"));
		jsonConverter.setSupportedMediaTypes(supportedMedias);

	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		return mapper;
	}

	@Override
	public void configureContentNegotiation(
			ContentNegotiationConfigurer configurer) {
		System.out.println("Configuring content negotiation");
		configurer.favorPathExtension(false)
					.favorParameter(false)
					.ignoreAcceptHeader(true)
					.defaultContentType(MediaType.APPLICATION_JSON);
	}

}
