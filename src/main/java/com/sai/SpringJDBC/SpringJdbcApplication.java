package com.sai.SpringJDBC;

import com.sai.SpringJDBC.model.Student;
import com.sai.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student s = context.getBean(Student.class);
		s.setRoolno(101);
		s.setName("Navin");
		s.setMarks(78);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);


		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
