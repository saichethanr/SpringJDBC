package com.sai.SpringJDBC.repo;

import com.sai.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "insert into student (rollno,name,marks) values (?,?,?)";
        int rows =jdbc.update(sql,s.getRoolno(),s.getName(),s.getMarks());
        System.out.println(rows + "affected");
    }

    public  List<Student> findAll(){
      String sql = "select * from student";
        RowMapper<Student>mapper = new RowMapper<Student>() {
            //one particular row at a time
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRoolno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }
        };

        return jdbc.query(sql,mapper);
    }
}
