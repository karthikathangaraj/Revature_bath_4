package services;

import java.sql.SQLException;

import Com.DAO.UserADAO;
import Com.ENTITY.User;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	UserADAO  u1=new UserADAO();
	User newUser = new User(1, "John Doe", "john@example.com");
    u1.addinfo(newUser);
    User fetchedUser = u1.getUser(1);
    if (fetchedUser != null) {
        System.out.println("User: " + fetchedUser.getName() + ", Email: " + fetchedUser.getEmail());
    }

}
}
