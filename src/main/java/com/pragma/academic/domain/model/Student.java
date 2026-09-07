package com.pragma.academic.domain.model;

public class Student extends User {
    private String studentId;

    public Student(String id, String name, String email, String studentId) {
        super(id, name, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void performRoleSpecificAction() {
        System.out.println("Estudiante realizando acción específica");
    }
}