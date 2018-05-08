package uk.gov.ons.oauthclientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import uk.gov.ons.oauthclientui.configuration.SecurityConfig;
import uk.gov.ons.oauthclientui.controller.ProductController;
import uk.gov.ons.oauthclientui.service.ProductService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {
		SecurityConfig.class,
		ProductController.class,
		ProductService.class
})
public class ProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
	}
}
