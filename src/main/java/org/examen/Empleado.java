package org.examen;

public class Empleado {
    private int id;
    private String nombre;
    private  String departamento;
    private double salario;
    private Enum desempeno;

    public Empleado(int id, String nombre, String departamento, double salario, Enum desempeno) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.desempeno = desempeno;
    }

    public void mostrarDetalle(){
        System.out.println(
                "Id: "+id+
                        "\nNombre: "+nombre+
                        "\nDepartamento: "+departamento+
                        "\nSalario: "+salario
        );
    }

    public double calcularBono(){
        return 0;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Enum getDesempeno() {
        return desempeno;
    }

    public void setDesempeno(Enum desempeno) {
        this.desempeno = desempeno;
    }
}
