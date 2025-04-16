package prueba;

import persona.Persona;

public class pruebaPersona {

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos persona.Persona ***");
        var objeto1 = new Persona("Nuria", "Rivas");
        //objeto1.setNombre("Jose");
        //objeto1.setApellido("Perez");

        objeto1.mostrarPersona();

        //Segundo objeto
        var objeto2 = new Persona("Carlos", "Hernandez");
        //objeto2.setNombre("Juan");
        //objeto2.setApellido("Vasquez");
        objeto2.mostrarPersona();
    }
}
