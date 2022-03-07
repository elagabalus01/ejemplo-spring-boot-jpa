package company.spring_jpa.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO Auto-generated method stub
        // super.configure(auth);
        auth.inMemoryAuthentication().
                withUser("admin").
                password("{noop}5520").
                roles("ADMIN","USER").
            and().
                withUser("user").
                password("{noop}1234").
                roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
            .antMatchers("/producto")
            .hasRole("ADMIN")
        .antMatchers("/")
        .hasAnyRole("ADMIN","USER");
    }
}
