package com.eazybytes.springsecsection2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers(HttpMethod.GET, "/myAccount").authenticated()
                        .requestMatchers(HttpMethod.GET, "/myBalance").authenticated()
                        .requestMatchers(HttpMethod.GET, "/myLoans").authenticated()
                        .requestMatchers(HttpMethod.GET, "/myCards").authenticated()
                        .requestMatchers(HttpMethod.GET, "/notices").permitAll()
                        .requestMatchers(HttpMethod.GET, "/contact").permitAll()
        );

        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }

}
