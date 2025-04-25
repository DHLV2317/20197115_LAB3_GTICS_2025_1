package com.example.lab3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@GetMapping("/emppleados")
public String listarEmpleados(@RequestParam(required = false) String filtro, Model model) {
        List<Employee> empleados;

        if (filtro != null && !filtro.isEmpty()) {
        empleados = empleadoRepository.findByNombreContainingIgnoreCaseOrDepartamentoNombreContainingIgnoreCase(filtro, filtro);
        } else {
        empleados = EmployeeRepository.findAll();
        }

        model.addAttribute("empleados", empleados);
        return "employeeList";
        }

