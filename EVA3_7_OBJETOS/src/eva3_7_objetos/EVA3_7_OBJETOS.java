
package eva3_7_objetos;

public class EVA3_7_OBJETOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.edad = 10;
        
        Persona persona2 = new Persona();
        persona2.nombre = "Pedro";
        persona2.apellido = "Páramo";
        persona2.edad = 70;

        System.out.println(persona1);                
        
        imprimirPersonas(persona1);
        
        System.out.println(persona2);

        imprimirPersonas(persona2);
        
    }
    public static void imprimirPersonas(Persona perso){
        System.out.println("Dirección: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
    
}

class Persona{
    String nombre;
    String apellido;
    int edad;
}