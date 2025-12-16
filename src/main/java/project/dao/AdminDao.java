package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.model.Admin;
import project.model.Question;
import project.model.Quiz;
import project.util.DbConnect;



public class AdminDao {
	Admin a=null;
	public Admin validate(Admin a) {
	    Admin validAdmin = null;
	    try (Connection c = DbConnect.getConnection()) {
	        PreparedStatement ps = c.prepareStatement("SELECT * FROM admin WHERE name=?");
	        ps.setString(1, a.getName());
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            String realPass = rs.getString("password");
	            if (a.getPassword().equals(realPass)) {
	                validAdmin = new Admin();
	                validAdmin.setId(rs.getInt("id"));
	                validAdmin.setName(rs.getString("name"));
	                validAdmin.setPassword(realPass);
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return validAdmin; // ✅ null if invalid
	}


	
	public void updatePassword(String name)
	{
		try ( Connection con=DbConnect.getConnection() ) 	
		{
			PreparedStatement ps=con.prepareStatement("update password from admin where name=?");
			ps.setString(1, a.getName());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public Question getQuestionById(int id) {
	    Question q = null;
	    String sql = "SELECT * FROM question WHERE id=?";
	    try (Connection con = DbConnect.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setInt(1, id);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            q = new Question();
	            q.setId(rs.getInt("id"));
	            q.setQuestion(rs.getString("question"));
	            q.setOption_a(rs.getString("option_a"));
	            q.setOption_b(rs.getString("option_b"));
	            q.setOption_c(rs.getString("option_c"));
	            q.setOption_d(rs.getString("option_d"));
	            q.setAnswer(rs.getString("answer"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return q;
	}

	public void updateQuestion(Question q) {
	    String sql = "UPDATE question SET question=?, option_a=?, option_b=?, option_c=?, option_d=?, answer=? WHERE id=?";
	    try (Connection con = DbConnect.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, q.getQuestion());
	        ps.setString(2, q.getOption_a());
	        ps.setString(3, q.getOption_b());
	        ps.setString(4, q.getOption_c());
	        ps.setString(5, q.getOption_d());
	        ps.setString(6, q.getAnswer());
	        ps.setInt(7, q.getId());
	        ps.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public void saveQuiz(Quiz quiz, List<Integer> questionIds) {
	    String insertQuiz = "INSERT INTO quiz(title) VALUES(?)";
	    String insertQuizQuestions = "INSERT INTO quiz_questions(quiz_id, question_id) VALUES(?, ?)";

	    try (Connection con = DbConnect.getConnection()) {
	        // Insert quiz and request generated keys
	        PreparedStatement ps = con.prepareStatement(insertQuiz, Statement
	        		.RETURN_GENERATED_KEYS);
	        ps.setString(1, quiz.getTitle());
	        ps.executeUpdate();

	        ResultSet rs = ps.getGeneratedKeys();
	        if (rs.next()) {
	            int quizId = rs.getInt(1);

	            // Insert selected questions
	            PreparedStatement ps2 = con.prepareStatement(insertQuizQuestions);
	            for (int qid : questionIds) {
	                ps2.setInt(1, quizId);
	                ps2.setInt(2, qid);
	                ps2.addBatch();
	            }
	            ps2.executeBatch();
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

    
    public List<Quiz> getAllQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();
        String sql = "SELECT * FROM quiz";

        try (Connection con = DbConnect.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Quiz q = new Quiz();
                q.setId(rs.getInt("id"));
                q.setTitle(rs.getString("title"));
                quizzes.add(q);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println((quizzes));
        return quizzes;
    }
	
}

