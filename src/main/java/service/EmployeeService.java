package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private static List<Employee> employees=new ArrayList<>();
    static {
        employees.add(new Employee(1,"toan1","0988888888"));
        employees.add(new Employee(2,"toan2","0988888887"));
        employees.add(new Employee(3,"toan3","0988888886"));
        employees.add(new Employee(4,"toan4","0988888885"));
        employees.add(new Employee(5,"toan5","0988888884"));
        employees.add(new Employee(6,"toan6","0988888883"));
    }
    public List<Employee> findAll(){
        return employees;
    }
    public void create(Employee employee){
        employees.add(employee);
    }
}
