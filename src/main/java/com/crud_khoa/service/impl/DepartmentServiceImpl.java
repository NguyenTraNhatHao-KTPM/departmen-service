package com.crud_khoa.service.impl;

import com.crud_khoa.entity.Department;
import com.crud_khoa.repository.DepartmentRepository;
import com.crud_khoa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(int departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
