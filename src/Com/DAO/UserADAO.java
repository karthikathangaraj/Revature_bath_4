package Com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Com.ENTITY.User;

public class UserADAO {
	
	
	public void addinfo(User user) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
		String sql = "INSERT INTO user (sno, name, email) VALUES (?, ?, ?)";
        PreparedStatement pstmt = c1.prepareStatement(sql);
        pstmt.setInt(1, user.getSno());
        pstmt.setString(2, user.getName());
        pstmt.setString(3, user.getEmail());
        pstmt.executeUpdate();
        c1.close();
    } 
	public User getUser(int id) {
        User user = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel", "root", "root");
            String sql = "SELECT * FROM user WHERE sno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new User(rs.getInt("sno"), rs.getString("name"), rs.getString("email"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
	
	}

