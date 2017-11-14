package haaga.lms.lms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course{

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	private @Id @GeneratedValue Long id;
	
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
