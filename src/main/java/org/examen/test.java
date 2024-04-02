package org.examen;

import java.util.ArrayList;

import static org.examen.NivelDesempeno.BUENO;
import static org.examen.NivelDesempeno.MALO;


public class test {
    public static void main(String[] args) {


    /*Creando un arreglo para los lenguajes que maneja el programador*/
        ArrayList<String>lg1=new ArrayList<>();
        lg1.add("JavaScript");
        lg1.add("Python");
        lg1.add("SQL");
        lg1.add("Java");
        /*Creando un arreglo vacio*/
        ArrayList<String>lg2=new ArrayList<>();

        /*Creando un objeto tipo Desarrollador */
        Desarrollador d1=new Desarrollador(1,"Juan Perez","Sistemas",2500.00,BUENO,lg1);
        d1.mostrarDetalle();
        Desarrollador d2=new Desarrollador(2,"Mario Puma","Sistemas",1025,MALO,lg2);
        d2.mostrarDetalle();

        /*-------------------------------------------------------------------------*/
        /*Creando un arreglo de los miembros del equipo*/
        ArrayList<String>e1=new ArrayList<>();
        e1.add("Juan Quispe");
        e1.add("Ruben Acosta");
        e1.add("Carlos Rivas");
        e1.add("David Huarcaya");

        /*Creando un arreglo vacio*/
        ArrayList<String>e2=new ArrayList<>();

        /*Creando un objeto tipo Gerente */
        Gerente g1=new Gerente(1,"Saul Huamani","Gerencia",2000.00,BUENO,e1);
        g1.mostrarDetalle();
        Gerente g2=new Gerente(2,"Mario Puma","Gerencia",2025,MALO,e2);
        g2.mostrarDetalle();
    }
}
