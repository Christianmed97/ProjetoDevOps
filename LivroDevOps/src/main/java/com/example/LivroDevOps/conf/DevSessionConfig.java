package com.example.LivroDevOps.conf;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.SessionRepository;
import org.springframework.session.MapSessionRepository;

@Configuration
@Profile({"default","homolog"})
public class DevSessionConfig {
	@Bean
	public SessionRepository<?> sessionRepository(){
		return new MapSessionRepository(new ConcurrentHashMap<>());
	}
}
