package com.srikanth.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.srikanth.pojos.Student;



public class StudentDAO {
  
		JdbcTemplate template;  
		  
		public void setTemplate(JdbcTemplate template) {  
		    this.template = template;  
		}  
		
		
		public List<Student> getStudents(){  
		    return template.query("select * from tblStudent",new RowMapper<Student>(){  
		        public Student mapRow(ResultSet rs, int row) throws SQLException {  
		            Student student = new Student();  
		            student.setStudentID(rs.getInt(1));  
		            student.setFirstName(rs.getString(2));  
		            student.setLastName(rs.getString(3)); 
		            student.setEmail(rs.getString(4));
		            student.setBranch(rs.getString(5));
		            student.setPhone(rs.getString(6));
		            return student;  
		        }  
		    });  
		}
		
}  

