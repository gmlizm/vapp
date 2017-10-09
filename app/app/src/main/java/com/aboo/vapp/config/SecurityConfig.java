package com.aboo.vapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableOAuth2Sso
//@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
//	}
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {  
        http
		/*.formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll()
        	.and()
        	.logout().invalidateHttpSession(true).clearAuthentication(true).permitAll()
        	.and()*/
        	.authorizeRequests()
        	.antMatchers("/oauth/**").permitAll()
            .antMatchers("/swagger*/**", "/webjars/**", "/v2/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .csrf().disable()
            .httpBasic()
            ;
    }
	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/swagger*/**", "/webjars/**");
//	}
	
}
