package com.crud_khoa.controller;

import com.crud_khoa.entity.Department;
import com.crud_khoa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Value("${welcome}")
    private String welcome;
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDeparment(@RequestBody Department derpartment) {
        return departmentService.saveDepartment(derpartment);
    }

    @GetMapping("/{id}")
    public Department findDeparmentById(@PathVariable("id") int departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping
    public String helloWorld() {
        return welcome;
    }
}
