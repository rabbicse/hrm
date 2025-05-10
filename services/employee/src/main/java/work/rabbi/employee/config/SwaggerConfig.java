package work.rabbi.employee.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI employeeOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Employee API")
                        .description("Employee Service API Documentation")
                        .version("v1.0"));
    }
}
