package com.manhkm.demo.javasercurity.config;

import com.manhkm.demo.javasercurity.filter.JWTFilter;
import com.manhkm.demo.javasercurity.utils.TokenJwtUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author ManhKM on 2/15/2022
 * @project java-sercurity
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .cors().and().csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/", "/*.html", "/favicon.ico", "/**/*.html", "/**/*.css", "/**/*.js").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilterBefore(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
                // disable page caching
                .headers().cacheControl();
    }

//    public String login(String username, String password) {
//        //Kiểm tra user/pass trong CSDL
//        //Nếu hợp lệ thì sinh JWT theo userId hoặc username và trả về cho client
//        {
//            String token = TokenJwtUtil.generateJwt(userId);
//            return jwt;
//        }
//        //User/pass không hợp lệ thì đăng nhập không thành công
//        return null;
//    }
}
