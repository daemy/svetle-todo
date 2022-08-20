// package xyz.dimitr.mstodo.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class CustomConfiguration implements WebMvcConfigurer {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/api/todo/**")
//                 .allowedOrigins(CorsConfiguration.ALL)
//                 .allowedMethods("PUT", "GET", "DELETE", "POST")
//                 .allowedHeaders(CorsConfiguration.ALL)
//                 .allowCredentials(false).maxAge(3600);
//     }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//         http.authorizeRequests().antMatchers("/api/todo").permitAll();

//         http.headers().frameOptions().sameOrigin();

//         return http.build();
//     }





    
// }
