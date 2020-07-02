package cn.edgar.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("Edgar")
                .password(new BCryptPasswordEncoder().encode("Edgar"))
                .authorities("ROLE_USER")
                .and().
                passwordEncoder(new BCryptPasswordEncoder())
                .withUser("test")
                .password(new BCryptPasswordEncoder().encode("test"))
                .authorities("ROLE_USER");
    }

}
