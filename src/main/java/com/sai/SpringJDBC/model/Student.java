package com.sai.SpringJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int roolno;
    private String  name;
    private int marks;

    public int getRoolno() {
        return roolno;
    }

    public void setRoolno(int roolno) {
        this.roolno = roolno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
