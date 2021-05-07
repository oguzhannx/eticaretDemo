package eticaretDemo.core.abstracts;

import eticaretDemo.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void register(User user);
}
