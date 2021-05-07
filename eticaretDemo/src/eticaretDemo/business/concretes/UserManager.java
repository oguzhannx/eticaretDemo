package eticaretDemo.business.concretes;

import eticaretDemo.business.abstracts.UserService;
import eticaretDemo.core.abstracts.AuthService;
import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private AuthService authService;

	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void login(User user) {
		authService.login(user);
	}

	@Override
	public void register(User user) {
		authService.register(user);

	}

}
