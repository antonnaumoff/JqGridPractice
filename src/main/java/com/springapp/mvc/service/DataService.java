package com.springapp.mvc.service;

import com.springapp.mvc.models.Department;
import com.springapp.mvc.models.Employee;
import com.springapp.mvc.utils.exceptions.DataBaseException;

import java.util.List;

public interface DataService {

    List<Department> getDepartmentList() throws DataBaseException;

    void createDepartment(String title) throws DataBaseException;

    void deleteDepartment(int id) throws DataBaseException;

    Department getDepartmentById(int id) throws DataBaseException;

    void editDepartment(Department dep) throws DataBaseException;

    List<Employee> getEmloyeeListById(int id) throws DataBaseException;

    void deleteById(int id) throws DataBaseException;

    void createEmployee(Employee emp) throws DataBaseException;

    Employee getEmloyeeById(int id) throws DataBaseException;

    void editEmployee(Employee emp) throws DataBaseException;

    Integer getId_dById(Integer id) throws DataBaseException;

}
