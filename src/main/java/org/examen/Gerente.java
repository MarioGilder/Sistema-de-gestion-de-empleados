package org.examen;

import java.util.ArrayList;

import static org.examen.NivelDesempeno.*;

public class Gerente extends Empleado implements EvaluacionDesempeno {

    ArrayList<String>equipo;

    public Gerente(int id, String nombre, String departamento, double salario, Enum desempeno, ArrayList<String> equipo) {
        super(id, nombre, departamento, salario, desempeno);
        this.equipo = equipo;
    }

    public ArrayList<String> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<String> equipo) {
        this.equipo = equipo;
    }

    @Override
    public void evaluacionDesempeno() {
        System.out.println(getDesempeno());

    }



    @Override
    public double calcularBono() {
        double totalBono=0;
        if(getDesempeno()!=MALO&&equipo.size()>=1){
            if (getDesempeno().equals(REGULAR)) {
                totalBono = getSalario() * 0.5 * equipo.size();
            } else if (getDesempeno().equals(BUENO)) {
                totalBono = getSalario() * 1 * equipo.size();
            }

        }
        return totalBono;
    }

    @Override
    public void mostrarDetalle() {
       super.mostrarDetalle();
        System.out.println("Desempeño: "+getDesempeno());
        System.out.println("Bono: "+calcularBono());
        System.out.println("Total remunerado: "+(calcularBono()+getSalario()));
        if(equipo.size()>=1){
        System.out.println("Integrantes del equipo de trabajo: ");
        for (String equipo : equipo) {
            System.out.println("***"+equipo);

        }}else {
            System.out.println("No cuenta con un equipo de trabajo");
        }


        System.out.println("*************************************************");
    }
}
