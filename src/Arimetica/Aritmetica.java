package Arimetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    //Contructor vacio
    public Aritmetica() {

    }

    public Aritmetica(int operando1, int operando2) {
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1 ;
        this.operando2 = operando2;
    }

     public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de la suma es: " + resultado);
    }
    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado de la resta es: " + resultado);
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
