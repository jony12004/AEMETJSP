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
        for (int i = 0; i < 1/*JSPAemet.CIUDAD*/; i++) {
            System.out.println("\n" + ciudad[i]);
            System.out.print("Valor maximo: ");
            int Vmax = consola.nextInt();
            System.out.print("Valor minimo: ");
            int Vmin = consola.nextInt();
            for (int j = 0; j < JSPRegCiudad.NTEMP; j++) {
                numero = (Math.random() * Vmax + Vmin);
                JSPRegCiudad.ntemp[j] = (int) numero;
            }
        }

    }

    public static void JSPListarRegistroTemp() {

        for (int i = 0; i < JSPAemet.CIUDAD; i++) {
            System.out.println(JSPAemet.ciudad[i] + "       ");
            for (int j = 0; j < JSPRegCiudad.NTEMP; j++) {
                System.out.print(JSPRegCiudad.ntemp[j] + ", ");
                System.out.println(JSPRegCiudad.temperatura[i][j]);
            }
        }
    }
}
