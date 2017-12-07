package haaga.lms.lms.domain;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;

import javax.persistence.*;
import java.util.Set;
import haaga.lms.lms.domain.Course;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	// Username with unique constraint
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String passwordHash;
	
	@Column(name = "email", nullable = true)
	private String email;
	
//	@Column(name = "courses", nullable = true)
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
//    @JoinTable(name = "user_course", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
	@JoinTable(
		    name = "user_course", 
		    joinColumns = { @JoinColumn(name = "id") }, 
		    inverseJoinColumns = { @JoinColumn(name = "courseid") })
	private Set<Course> courses;
	
	public Set<Course> getCourses() {
        return courses;
    }
	
	public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
	
	public User() {
    }
	
	public User(String username, String passwordHash, String role) {
		super();
		this.username = username;
		this.passwordHash = passwordHash;
		this.role = role;
	}
	
	public User(String username, Set<Course> courses){
        this.username = username;
        this.courses = courses;
    }
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "role", nullable = false)
	private String role;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}