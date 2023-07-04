package com.pro.csv.Model;

import jakarta.persistence.*;

@Entity
@Table(name ="student_marks")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String rollNo;
    private String name;
    private String branch;
    private String contact;
//    private String contact2;
    private int marks;

    public Student() {
    }

    public Student(String name, String branch, String contact, int marks) {
        this.name = name;
        this.branch = branch;
        this.contact = contact;
        this.marks = marks;
    }




    // Constructors, getters, and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", NAME='" + name + '\'' +
//                ", Branch='" + branch + '\'' +
//                ", CONTACT='" + contact + '\'' +
//                ", MARKS=" + marks +
//                '}';
//    }
}
