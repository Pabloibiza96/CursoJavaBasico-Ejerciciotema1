package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

//Crea un proyecto de Java desde 0
//Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
//Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
//Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
public class Main {
    public static void main(String[] args) {

       int dato1= 5;
       long dato2= 10000000;
       double dato3= 3.98;
       float dato4= 3.6F;
       boolean dato5= Boolean.TRUE;
       char dato6= 'a';
       String dato7= "Pablo";
       int[] dato8= new int[]{1, 2, 3, 4, 5};


        System.out.println("Un dato tipo int es: " + dato1);
        System.out.println("Un dato tipo long es: " + dato2);
        System.out.println("Un dato tipo double es: " + dato3);
        System.out.println("Un dato tipo float es: " + dato4);
        System.out.println("Un dato tipo boolean es: " + dato5);
        System.out.println("Un dato tipo char es: " + dato6);
        System.out.println("Un dato tipo String es: " + dato7);
        System.out.println("Un ejemplo de array es: " + Arrays.toString(dato8));

    }
}
