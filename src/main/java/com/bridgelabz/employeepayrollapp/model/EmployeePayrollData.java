package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;
    public String gender;
    public LocalDate startDate;
    public String note;
    public String profilePic;
    public List<String> department;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
        super();
        this.employeeId = employeeId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.startDate = employeePayrollDTO.startDate;
        this.note = employeePayrollDTO.note;
        this.profilePic = employeePayrollDTO.profilePic;
        this.department = employeePayrollDTO.department;
    }
}
