package com.example.lab3.Repository;

import com.example.lab3.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT new com.tuapp.dto.EmpleadoDTO(e.id, e.nombre, e.apellido, j.titulo, d.nombre, "
            + "l.ciudad, l.codigoPostal, e.salario) "
            + "FROM Employee e "
            + "JOIN e.puesto j "
            + "JOIN e.departamento d "
            + "JOIN d.ubicacion l "
            + "WHERE LOWER(e.nombre) LIKE LOWER(CONCAT('%', :filtro, '%')) "
            + "OR LOWER(d.nombre) LIKE LOWER(CONCAT('%', :filtro, '%'))")
    List<Employee.EmpleadoDTO> buscarPorNombreODepartamento(@Param("filtro") String filtro);
}


