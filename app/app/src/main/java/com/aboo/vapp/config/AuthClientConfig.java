//package com.aboo.vapp.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.client.OAuth2ClientContext;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
//import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
//
////@EnableWebSecurity
////@Configuration
////@EnableOAuth2Sso
//public class AuthClientConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private DataSource dataSource;
//	
////    @Override
//    public void init(WebSecurity web) {
//        web.ignoring().antMatchers("/");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests().anyRequest().authenticated();
//    }
//    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////		auth.jdbcAuthentication().dataSource(dataSource);
//    	auth.inMemoryAuthentication().withUser("vapp").password("vapp").roles("USER","ADMIN");
//    }
//
//	@Bean
//	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext,
//			OAuth2ProtectedResourceDetails details) {
//		return new OAuth2RestTemplate(details, oauth2ClientContext);
//	}
//
//}
