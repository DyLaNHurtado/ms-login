package es.dylanhurtado.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.dylanhurtado.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long>{
	
}
