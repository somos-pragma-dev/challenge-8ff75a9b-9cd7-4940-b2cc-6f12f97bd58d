package com.pragma.academic.domain.model;

public class Admin extends User {
    private String adminId;

    public Admin(String id, String name, String email, String adminId) {
        super(id, name, email);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    @Override
    public void performRoleSpecificAction() {
        System.out.println("Administrador realizando acción específica");
    }
}