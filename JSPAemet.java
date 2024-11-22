import java.util.Scanner;

public class JSPAemet {
    static Scanner consola = new Scanner(System.in);
    public static int CIUDAD = 8;
    static String [] ciudad = {"Almeria","Granada","Cadiz","Malaga","Jaen", "Cordoba", "Huelva", "Sevilla"};
    static int [] registroTemp = new int [8];

    public static void main(String[] args) {
        JSPAemet.JSPGenerarRegistroTemp();
        JSPAemet.JSPListarRegistroTemp();

    }

    public static void JSPGenerarRegistroTemp() {
        registroTemp =

        for (int i = 0; i < JSPAemet.CIUDAD;i++){
            for (int j = 0; j < JSPRegCiudad.NTEMP; j++) {
                System.out.print("Valor maximo: ");
                Vmax = consola.nextInt();
                System.out.print("Valor minimo: ");
                Vmin = consola.nextInt();
            }
        }
    }
    public static void JSPListarRegistroTemp(){
        System.out.println("------ LISTADO DE NOTAS --------------");
        for (int j=0; j<JSPAemet.CIUDAD; j++){
            System.out.print("             " + ciudad[j] + "  ");
        }
        for (int j=0; j<CIUDAD; j++){
            for (int i=0; i<JSPRegCiudad.DIASEMANA; i++){
                System.out.print("               " + JSPRegCiudad.temperatura[i][j]+ "        ");
            }
            System.out.println();
        }    }
}
