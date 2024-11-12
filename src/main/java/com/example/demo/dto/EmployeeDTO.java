package com.example.demo.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;

    public EmployeeDTO() {
    }

    public EmployeeDTO(long id, String name, LocalDate dateOfJoining, boolean isActive) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", isActive=" + isActive +
                '}';
    }
}
