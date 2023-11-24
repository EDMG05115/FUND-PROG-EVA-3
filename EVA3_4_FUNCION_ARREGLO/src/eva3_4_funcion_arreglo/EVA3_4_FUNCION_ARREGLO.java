package eva3_4_funcion_arreglo;

public class EVA3_4_FUNCION_ARREGLO {

    public static void main(String[] args) {
        int[] arreglo;
        //En este momento a la variable arreglo se le asignan los valores de crearArreglo, incluido el tamaño 10 en este caso.
        arreglo = crearArreglo(10);

        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }

    }

    //Cuando declaramos una variable, esa variable solo va a existir dentro del bloque de codigo donde la creamos
    public static int[] crearArreglo(int tama) {
        int[] arreglo = new int[tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        return arreglo;
    }
}
