package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.security.JWTAthenticationEntryPoint;
import com.example.demo.security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {


    @Autowired
    private JWTAthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
        		.cors(cors->cors.disable())
                .authorizeHttpRequests(
                		auth->
                		auth.requestMatchers("/home/**").authenticated()
                        .requestMatchers("/faculty/**").hasRole("FACULTY")  // Only allow FACULTY to access this endpoint
                        .requestMatchers("/student/**").hasRole("STUDENT") 
                		.requestMatchers("/auth/login").permitAll()
                        .anyRequest()
                        .authenticated())
                        .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
                        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }


}