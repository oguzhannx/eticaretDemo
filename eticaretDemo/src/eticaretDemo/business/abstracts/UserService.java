package eticaretDemo.business.abstracts;


import eticaretDemo.entities.concretes.User;

public interface UserService {
	void login(User user);
	void register(User user);
}
