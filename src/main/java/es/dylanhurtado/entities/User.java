package es.dylanhurtado.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;

	  public User(Long id, String username, String password) {
	    this.id = id;
	    this.username = username;
	    this.password = password;
	  }
	  
	  public User() {}
	  
	  public String toString() {
	    return "User(id=" + getId() + ", username=" + getUsername() + ", password=" + getPassword() + ")";
	  }
	  
	  public Long getId() {
	    return this.id;
	  }
	  
	  public String getUsername() {
	    return this.username;
	  }
	  
	  public String getPassword() {
	    return this.password;
	  }
}

	