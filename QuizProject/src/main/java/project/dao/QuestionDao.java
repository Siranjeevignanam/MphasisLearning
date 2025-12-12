package project.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.model.Question;
import project.util.DbConnect;

public class QuestionDao {

   
    public void insertQuestion(Question question) throws Exception {
        try (Connection con = DbConnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO question (question,option_a,option_b,option_c,option_d,answer) VALUES(?,?,?,?,?,?)"
            );
            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getOption_a());
            ps.setString(3, question.getOption_b());
            ps.setString(4, question.getOption_c());
            ps.setString(5, question.getOption_d());
            ps.setString(6, question.getAnswer());
            ps.executeUpdate();
        }
    }
    
    
    public List<Question> getQuestions() throws Exception
    {
    	List<Question> qns=new ArrayList<>();
    	try (Connection con = DbConnect.getConnection())
    	{
    		PreparedStatement ps=con.prepareStatement("select * from question");
    		
    		ResultSet rs=ps.executeQuery();
    		while (rs.next()) {
                Question q = new Question();
                            // only if id column exists
                q.setQuestion(rs.getString("question"));
                q.setOption_a(rs.getString("option_a"));
                q.setOption_b(rs.getString("option_b"));
                q.setOption_c(rs.getString("option_c"));
                q.setOption_d(rs.getString("option_d"));
                q.setAnswer(rs.getString("answer"));

                qns.add(q);
    		
    	}
    }
    	
    	return qns;
}
}
