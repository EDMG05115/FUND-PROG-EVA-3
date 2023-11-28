
package eva3_8_tuttifrutti;

import java.util.Scanner;

public class EVA3_8_TUTTIFRUTTI {

    final static String USUARIO = "TUTTI";
    final static String PASSWORD = "123456";

    public static void main(String[] args) {
        String usuario, pwd;

        Scanner input = new Scanner(System.in);

        do {
            
            usuario = capturarDatos("Ingresa tu usuario");

            
            pwd = capturarDatos("Ingresa tu contraseña");

        } while (!validarUsuario(usuario, pwd));

        System.out.println("Bienvenido al sistema");
    }

    public static boolean validarUsuario(String usuario, String pwd) {
        boolean verificado;
        if ((usuario.equals(USUARIO)) && (pwd.equals(PASSWORD))) {
            verificado = true;
        
        } else {
            verificado = false;
        
        }

        return verificado;

    }
    
    public static String capturarDatos(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    
    }

}
