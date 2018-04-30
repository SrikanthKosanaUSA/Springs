package com.srikanth.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.srikanth.pojos.Student;
import com.srikanth.dao.StudentDAO;

public class StudentController {

	StudentDAO dao; 
      
    @RequestMapping("/viewstudents")  
    public ModelAndView viewstudents(){  
        List<Student> list=dao.getStudents();  
        return new ModelAndView("viewstudents","list",list);  
    }  
   
}
