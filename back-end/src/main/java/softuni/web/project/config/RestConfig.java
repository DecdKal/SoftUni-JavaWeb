package softuni.web.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.core.GrantedAuthority;
import softuni.web.project.user.service.UserService;
import softuni.web.project.util.JwtService;

import java.util.Map;

@Configuration
public class RestConfig {

    @Bean
    public ClientHttpRequestInterceptor requestInterceptor(UserService userService,
                                                           JwtService jwtService) {
        return (r, b, e) -> {
            // put the logged user details into bearer token
            userService
                    .getCurrentUser()
                    .ifPresent(pud -> {
                        String bearerToken = jwtService.generateToken(
                                pud.getUuid().toString(),//
                                Map.of(
                                        "roles",
                                        pud.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList()
                                )
                        );

                        System.out.println("BEARER TOKEN: " + bearerToken);

                        r.getHeaders().setBearerAuth(bearerToken);
                    });

            return e.execute(r, b);
        };
    }
}
