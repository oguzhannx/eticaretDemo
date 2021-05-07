package eticaretDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaretDemo.core.abstracts.AuthService;
import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class SystemAuthManager implements AuthService {
	private UserDao userDao;

	public SystemAuthManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void login(User user) {
		if (user.getEmail() == null || user.getPassword() == null) {
			System.out.println("Email ve þifre zorunlu alandýr.");
			return;
		}
		System.out.println("Sistem Ýle Giriþ Baþarýlý.");
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Þifre 6 karakterden kýsa olmamalýdýr.");
			return;

		}
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ýsim - soyisim 2 karakterdden kýsa olmamalýdýr.");
			return;
		}
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (!matcher.matches()) {
			System.out.println("Mail adresi e posta formatýnda olmalýdýr. (example@example.com)");
			return;
		}
		if (userDao.getEmail(user.getEmail()) != null) {
			System.out.println("Kullanýcý mevcut");
		}

		userDao.add(user);
		System.out.println("Kayýt Baþarýlý");

	}

}
