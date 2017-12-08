package haaga.lms.lms;

import java.util.HashSet;
import java.util.Set;

//import java.util.Properties;
//
//import javax.activation.DataSource;
//import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;

import haaga.lms.lms.domain.User;
import haaga.lms.lms.domain.UserRepository;

import haaga.lms.lms.domain.Course;
import haaga.lms.lms.domain.CourseRepository;

@SpringBootApplication
//@EnableOAuth2Sso
public class LmsApplication {
	
	@Autowired
    private UserRepository userrepo;

    @Autowired
    private CourseRepository courserepo;

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDatabase() {
		return (args) -> {

			// Create users: admin/admin user/user
			User user1 = new User("user1", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			User user3 = new User("user3", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user4 = new User("user4", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user5 = new User("user5", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user6 = new User("user6", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			

//			courserepo.save(new Course("HTML", "public", "Basic HTML", "Pasila", "50e") );
//			courserepo.save(new Course("Basic Javascript", "public", "Basic Javascript", "Helsinki Kirjasto 10", "50e") );
//			courserepo.save(new Course("Guitar for beginners", "public", "Guitar classic", "Sello", "100e") );

			Course course1 = new Course("HTML", "public", "Basic HTML", "Pasila", "50e");
			Course course2 = new Course("Basic Javascript", "public", "Basic Javascript", "Helsinki Kirjasto 10", "50e");
			Course course3 = new Course("Guitar for beginners", "public", "Guitar classic", "Sello", "100e");
			
			
			userrepo.save(user1);
			userrepo.save(user2);
			userrepo.save(user3);
			userrepo.save(user4);
			userrepo.save(user5);
			userrepo.save(user6);
			
			courserepo.save(course1);
			courserepo.save(course2);
			courserepo.save(course3);
			
			
			Set<Course> courses = new HashSet<Course>();
			courses.add(course1);
			courses.add(course3);
			user1.setCourses(courses);
			userrepo.save(user1);
			
			courses.remove(course1);
			courses.add(course2);
			user2.setCourses(courses);
			userrepo.save(user2);
			
//			Set<User> users = new HashSet<User>();
//			users.add(user4);
//			users.add(user3);
//			course3.setUsers(users);
//			courserepo.save(course3);


		};
	}
	

}
