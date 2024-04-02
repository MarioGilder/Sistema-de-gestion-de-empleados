package org.examen;

import java.util.ArrayList;

import static org.examen.NivelDesempeno.*;


public class Desarrollador extends Empleado implements EvaluacionDesempeno{

    ArrayList<String>lenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario, Enum desempeno, ArrayList<String> lenguajes) {
        super(id, nombre, departamento, salario, desempeno);
        this.lenguajes = lenguajes;
    }

    /*Evaluacion desempeño*/
    @Override
    public void evaluacionDesempeno() {
        System.out.println(getDesempeno());
    }

    @Override
    public double calcularBono() {
        double totalBono=0;
        if(getDesempeno()!=MALO&&lenguajes.size()>=1){
            if (getDesempeno().equals(REGULAR)) {
                totalBono = getSalario() * 0.5 * lenguajes.size();
            } else if (getDesempeno().equals(BUENO)) {
                totalBono = getSalario() * 1 * lenguajes.size();
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
        if(lenguajes.size()>=1){
        System.out.println("Lenguajes: ");
                for (String lenguaje : lenguajes) {
            System.out.println("***"+lenguaje);

        }}else {
            System.out.println("No domina ningun lenguaje");
        }
        System.out.println("*************************************************");

    }

}











