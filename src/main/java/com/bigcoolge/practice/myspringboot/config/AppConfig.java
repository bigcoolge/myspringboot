package com.bigcoolge.practice.myspringboot.config;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Mapper dozerMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<String> mappings = new ArrayList<String>();
		mappings.add("META-INF/mapper/user-mappings.xml");
		mappings.add("META-INF/mapper/author-mappings.xml");
		mapper.setMappingFiles(mappings);
		return mapper;
	}
}
