package prueba;

import Arimetica.Aritmetica;

public class pruebaAritmerica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Arimetica.Aritmetica ***");

        var aritmetica1 = new Aritmetica(5,7);
        System.out.println("Atributo operando 1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();

        //System.out.println("Dir. Mem obj1: " + aritmetica1);

        var aritmetica2 = new Aritmetica(12,16);
        aritmetica1.sumar();
        //System.out.println("Dir. Mem obj1: " + aritmetica2);

    }
}
