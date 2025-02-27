package dev.hugosiu.Chatbot.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    http.authorizeHttpRequests(
        authorize -> authorize
            .requestMatchers("/api/signup/**").permitAll()
            .requestMatchers("/api/login/**").permitAll()
    ).httpBasic(Customizer.withDefaults());

//        authorize ->
//            authorize.requestMatchers(new AntPathRequestMatcher("/sign-up/**")).permitAll()
//                .requestMatchers(new AntPathRequestMatcher("/h2-console/**")).permitAll()
//                .anyRequest().authenticated()
//        )
//        .httpBasic(Customizer.withDefaults());

    return http.build();

  }

//  @Bean
//  public JwtAuthenticationConverter jwtAuthenticationConverter() {
//    JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
//
//    converter.setJwtGrantedAuthoritiesConverter(jwt ->
//        Optional.ofNullable(jwt.getClaimAsStringList("custom_claims"))
//            .stream()
//            .flatMap(Collection::stream)
//            .map(SimpleGrantedAuthority::new)
//            .collect(Collectors.toList())
//    );
//
//    return converter;
//  }
}