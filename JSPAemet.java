import java.util.Scanner;

public class JSPAemet {
    static Scanner consola = new Scanner(System.in);
    public static int CIUDAD = 8;
    static String[] ciudad = {"Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"};
    static int[] registroTemp = new int[8];

    public static void main(String[] args) {
        JSPAemet.JSPGenerarRegistroTemp();
        JSPAemet.JSPListarRegistroTemp();

    }

    public static void JSPGenerarRegistroTemp() {
        double numero = 0;
        for (int i = 0; i < JSPAemet.CIUDAD; i++) {
            System.out.println("\n" + ciudad[i]);
            System.out.print("Valor maximo: ");
            int Vmax = consola.nextInt();
            System.out.print("Valor minimo: ");
            int Vmin = consola.nextInt();
            for (int j = 0; j<JSPRegCiudad.NTEMP; j++){
                numero = (Math.random() * Vmax + Vmin);
                JSPRegCiudad.ntemp[j] = (int)numero;
            }
        }

    }

    public static void JSPListarRegistroTemp(){
        System.out.println("------ LISTADO DE NOTAS --------------");
        for (int i=0; i<JSPAemet.CIUDAD; i++){
            System.out.print("             " + ciudad[i] + "  ");
        }
        for (int i=0; i<CIUDAD; i++){
            for (int j=0; j<JSPRegCiudad.DIASEMANA; j++){
                System.out.print("               " + JSPRegCiudad.temperatura[i][j]+ "        ");
            }
            System.out.println();
        }    }
}
