package haaga.lms.lms.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

import javax.persistence.*;
import java.util.Set;
import haaga.lms.lms.domain.User;

@Entity
public class Course{

	public Long getId() {
		return Id;
	}

	public void setId(Long Id) {
		this.Id = Id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Id @GeneratedValue @Column(name="COURSE_ID", nullable = false, unique = true) 
	private Long Id;
	
	@Column(name = "coursename", nullable = false, unique = false)	
	private String coursename;
	
	@Column(name = "privacy", nullable = false, unique = false)	
	private String privacy;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@Column(name = "location", nullable = true)
	private String location;

	@Column(name = "price", nullable = true)
	private String price;
	
//	@Column(name = "users", nullable = true)
	
	
	@ManyToMany(mappedBy = "courses")
	private Set<User> users;
	
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Course(String coursename, Set<User> users){
        this.coursename = coursename;
        this.users = users;
    }
    
	public Course() {
		
	}
	
	public Course(String coursename, String privacy, String description, String location, String price) {
		super();
		this.coursename = coursename;
		this.privacy = privacy;
		this.description = description;
		this.location = location;
		this.price = price;
	}
}
