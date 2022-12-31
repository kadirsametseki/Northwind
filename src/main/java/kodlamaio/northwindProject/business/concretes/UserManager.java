package kodlamaio.northwindProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwindProject.business.abstracts.UserService;
import kodlamaio.northwindProject.core.dataAccess.UserDao;
import kodlamaio.northwindProject.core.entities.User;
import kodlamaio.northwindProject.core.utilities.results.DataResult;
import kodlamaio.northwindProject.core.utilities.results.Result;
import kodlamaio.northwindProject.core.utilities.results.SuccessDataResult;
import kodlamaio.northwindProject.core.utilities.results.SuccessResult;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserManager implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.getByEmail(email), "Kullanıcı bulundu");
	}


}
