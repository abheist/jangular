package com.abheist.jangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@SpringBootApplication
public class JangularApplication {

    public static void main(String[] args) {
        SpringApplication.run(JangularApplication.class, args);
    }

    @Configuration
    public class SecurityConfiguration {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http.authorizeHttpRequests((authz) -> authz.anyRequest().authenticated()).httpBasic(withDefaults());
            return http.build();
        }
    }
}
