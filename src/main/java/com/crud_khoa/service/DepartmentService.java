package com.crud_khoa.service;

import com.crud_khoa.entity.Department;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public Department findDepartmentById(int departmentId);
}
