package com.codinglevel.configuration;

public class ApplicationSecurityConfiguration {

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("Mohamed")
//                .password("password")
//                .roles("ADMIN");
//
//        auth.inMemoryAuthentication()
//                .withUser("Hamdi")
//                .password("123")
//                .roles("ROLE");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/login", "/register")
//                .permitAll().anyRequest().authenticated()
//                .antMatchers("/account/**")
//                .hasAuthority("USER").and()
//                .formLogin().and().httpBasic();
//    }
//
//    @Bean
//    public static NoOpPasswordEncoder passwordEncoder() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder
//                .getInstance();
//    }
}
