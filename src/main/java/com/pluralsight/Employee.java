package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    String department;
    double payRate;
    int hoursWorked;
    int overTimeHours;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked, int overTimeHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.overTimeHours = overTimeHours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return payRate * hoursWorked + overTimeHours * 1.2;
    }
    public int getRegularHours(){
        return hoursWorked;
    }
    public void serOverTimeHours(int serOverTimeHours){
        this.overTimeHours = serOverTimeHours;
    }
    public int getOvertimeHours(){
        return overTimeHours;
    }
}
