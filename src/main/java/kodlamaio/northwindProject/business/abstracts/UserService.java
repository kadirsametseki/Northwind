package kodlamaio.northwindProject.business.abstracts;

import kodlamaio.northwindProject.core.entities.User;
import kodlamaio.northwindProject.core.utilities.results.DataResult;
import kodlamaio.northwindProject.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> getByEmail(String email);
	
}
