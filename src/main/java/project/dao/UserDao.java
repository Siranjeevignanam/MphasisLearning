package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import project.model.Admin;
import project.model.QuizResult;
import project.model.User;
import project.util.DbConnect;

public class UserDao {
	
	
	public void addUser(String name,String password)
	{
		try(Connection c=DbConnect.getConnection())
		{
			PreparedStatement ps=c.prepareStatement("insert into user(name,password) values (?,?)");
			ps.setString(1,name);
			ps.setString(2, password);
			ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public User validate(User user) {
	    User validUser = null;
	    try (Connection c = DbConnect.getConnection()) {
	        PreparedStatement ps = c.prepareStatement(
	            "SELECT * FROM user WHERE name=? AND password=?"
	        );
	        ps.setString(1, user.getName());
	        ps.setString(2, user.getPassword());
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            validUser = new User();
	            validUser.setId(rs.getInt("id"));
	            validUser.setName(rs.getString("name"));
	            validUser.setPassword(rs.getString("password"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return validUser; // null if invalid
	}


	public void saveResult(QuizResult result) {
        try (Connection c = DbConnect.getConnection()) {
            PreparedStatement ps = c.prepareStatement(
                "INSERT INTO quiz_results(quiz_id, user_id, score) VALUES (?, ?, ?)"
            );
            ps.setInt(1, result.getQuizId());
            ps.setInt(2, result.getUserId());
            ps.setInt(3, result.getScore());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<QuizResult> getLeaderboard(int quizId) {
        List<QuizResult> list = new ArrayList<>();
        try (Connection c = DbConnect.getConnection()) {
            PreparedStatement ps = c.prepareStatement(
                "SELECT * FROM quiz_results WHERE quiz_id=? ORDER BY score DESC"
            );
            ps.setInt(1, quizId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                QuizResult r = new QuizResult();
                r.setId(rs.getInt("id"));
                r.setQuizId(rs.getInt("quiz_id"));
                r.setUserId(rs.getInt("user_id"));
                r.setScore(rs.getInt("score"));
                list.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
	
    public void saveQuizResult(QuizResult result)
    { String sql = "INSERT INTO quiz_results (quiz_id, user_id, score) VALUES (?, ?, ?)"; 
    try (Connection conn = DbConnect.getConnection();
    		PreparedStatement ps = conn.prepareStatement(sql)) 
    { ps.setInt(1, result.getQuizId()); 
    ps.setInt(2, result.getUserId());
    ps.setInt(3, result.getScore());
    ps.executeUpdate(); }
    catch (SQLException e) { 
    	e.printStackTrace(); 
    	} }
}
