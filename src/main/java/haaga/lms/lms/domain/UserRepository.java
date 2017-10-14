package haaga.lms.lms.domain;

import org.springframework.data.repository.CrudRepository;

import haaga.lms.lms.domain.User;;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username); 
}