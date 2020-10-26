package bo.juanjoses.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ShoppingCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCustomerApplication.class, args);
	}

}
