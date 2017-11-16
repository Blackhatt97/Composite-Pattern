package EmployeeEx;

import java.util.ArrayList;

public class Employee implements Responsability{

    private String name;
    private int age;
    private ArrayList<Employee> subordinates;
    private double salary;
    private String department;


    public Employee(String name, int age, double salary, String department){

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.subordinates = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee emp) {

        this.subordinates.add(emp);

    }

    @Override
    public void removeEmployee(Employee emp) {

        this.subordinates.remove(emp);

    }

    @Override
    public String print() {

        String to_print = "Employee: " + this.name +
                " from department " + this.department +
                " that wins " + this.salary +
                " and is " + this.age + " age old has as subordinates: ";
        if(subordinates.size() != 0){
        for(Employee emp: subordinates){

            to_print += "\n" + emp.print();


        }
        }
        else
            to_print += "none";
        return to_print;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(ArrayList<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
