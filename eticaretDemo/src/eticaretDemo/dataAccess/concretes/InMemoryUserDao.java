package eticaretDemo.dataAccess.concretes;

import java.util.List;

import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	private List<User> users;
	
	
	
	public InMemoryUserDao(List<User> users) {
		super();
		this.users = users;
	}



	@Override
	public void add(User user) {
		
		users.add(user);
	}



	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		users.remove(user);
		
	}



	@Override
	public void Update(User user) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public User getEmail(String message) {
		for (User user : users) {
			if (user.getEmail().equals(message)) {
				return user;
			}
		}
		return null;
	}
	

}
