package it.eng.elise.micser.calcola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {EliseMicserCalcolaApplication.class})
public class EliseMicserCalcolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EliseMicserCalcolaApplication.class, args);
	}

}
