package com.pragma.academic.domain.model;

public class Professor extends User {
    private String professorId;

    public Professor(String id, String name, String email, String professorId) {
        super(id, name, email);
        this.professorId = professorId;
    }

    public String getProfessorId() {
        return professorId;
    }

    @Override
    public void performRoleSpecificAction() {
        System.out.println("Profesor realizando acción específica");
    }
}