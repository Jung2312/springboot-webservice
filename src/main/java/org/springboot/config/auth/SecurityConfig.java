/*
package org.springboot.config.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig{
    //private final CustomQyath2UserService customQyath2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .headers().frameOptions().disable()
                .and().authorizeHttpRequests()
                .antMatchers("/", "/css/**", "/images/**",
                        "/js/**", "h2-console/**").permitAll()
    }
}
*/
