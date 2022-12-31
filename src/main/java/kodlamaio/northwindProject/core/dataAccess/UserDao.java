package kodlamaio.northwindProject.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwindProject.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User getByEmail(String email);
}
