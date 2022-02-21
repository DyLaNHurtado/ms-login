package es.dylanhurtado;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import es.dylanhurtado.dao.UserRepository;
import es.dylanhurtado.entities.User;

@SpringBootApplication
public class MsLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLoginApplication.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository userRepository) {
		
		return args->{
			Stream.of("A","B","C").forEach(cn->{ 
				userRepository.save(new User(null,cn,cn));
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
