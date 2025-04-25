package com.example.lab3.Entity;
import jakarta.persistence.;
@Entity
@Table(name = "employees")
public class Employee{

    @Column(name = "employee_id")
    private String id;

    @Column(name = "first_name")
    private String nombre;

    @Column(name = "last_name")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "job_id")

    private Job job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Deparment deparment;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @Column(name = "salary")
    private Double salario;

    // Getters y setters
    public class EmpleadoDTO {

        private Long id;
        private String nombre;
        private String apellido;
        private String puesto;
        private String departamento;
        private String ciudad;
        private String codigoPostal;
        private Double salario;

        public EmpleadoDTO(Long id, String nombre, String apellido, String puesto, String departamento,
                           String ciudad, String codigoPostal, Double salario) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.puesto = puesto;
            this.departamento = departamento;
            this.ciudad = ciudad;
            this.codigoPostal = codigoPostal;
            this.salario = salario;
        }

        // Getters y setters

    }

    // Constructor vacío
    public Employee(String id) {
        this.id = id;
    }
}

