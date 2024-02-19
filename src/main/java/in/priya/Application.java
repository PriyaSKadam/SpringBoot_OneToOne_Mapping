package in.priya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.priya.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	    PersonService service=context.getBean(PersonService.class);
	    
	    service.savePersonWithPassport();
	    //service.savePassport();
	}

}
