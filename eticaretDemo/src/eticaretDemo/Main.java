package eticaretDemo;



import java.util.ArrayList;
import java.util.List;

import eticaretDemo.business.concretes.UserManager;
import eticaretDemo.core.adapters.GoogleAuthManagerAdapter;
import eticaretDemo.dataAccess.concretes.InMemoryUserDao;
import eticaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "aaa", "aa1", "aaaa@aaa.com", "aaaaa");
		User user2 = new User(2, "bbb", "bb1", "bbbb@bbb.com", "bbbbb");
		
		List<User> users = new ArrayList<User>();
		
		UserManager manager = new UserManager(new InMemoryUserDao(users), new GoogleAuthManagerAdapter());
		manager.register(user1);
		
	}

}
