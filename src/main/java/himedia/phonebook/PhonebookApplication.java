package himedia.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhonebookApplication {

	// 메인 메서드가 필요한 이유 -> 스프링 부트는 단독적인 
	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}

}
