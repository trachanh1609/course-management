package haaga.lms.lms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;

import haaga.lms.lms.domain.User;
import haaga.lms.lms.domain.UserRepository;

import haaga.lms.lms.domain.Course;
import haaga.lms.lms.domain.CourseRepository;

@SpringBootApplication
//@EnableOAuth2Sso
public class LmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDatabase(UserRepository userrepo, CourseRepository courserepo ) {
		return (args) -> {

			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			userrepo.save(user1);
			userrepo.save(user2);

			courserepo.save(new Course("HTML", "public", "Basic HTML", "Pasila", "50e") );
			courserepo.save(new Course("Basic Javascript", "public", "Basic Javascript", "Helsinki Kirjasto 10", "50e") );
			courserepo.save(new Course("Guitar for beginners", "public", "Guitar classic", "Sello", "100e") );

		};
	}

}
