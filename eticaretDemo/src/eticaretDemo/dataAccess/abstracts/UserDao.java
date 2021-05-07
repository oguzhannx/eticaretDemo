package eticaretDemo.dataAccess.abstracts;

import eticaretDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void Update(User user);
	User getEmail(String message);
	
}
