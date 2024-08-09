package com.sai.SpringJDBC.repo;

import com.sai.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private JdbcTemplate jdbc;
    public void save(Student s){
        System.out.println("Added");
    }

    public  List<Student> findAll(){
        List<Student> students = new ArrayList<>();
        return students;
    }
}
