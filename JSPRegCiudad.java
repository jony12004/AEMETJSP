import java.util.Scanner;

public class JSPRegCiudad {

    public static int DIASEMANA = 7;
    public static int NTEMP = 3;
    String [] diasSemana = {"Lunes", "Martes","Miercoles", "Jueves", "Viernes", "Sabado", "Doming"};
    static int [][] temperatura = new int[JSPRegCiudad.DIASEMANA][JSPRegCiudad.NTEMP];

    public void JSPgetdatosdia(String dia){

    }



    public static void JSPGenerarRegistroTemp(){
        for (int i = 0; i < JSPRegCiudad.DIASEMANA){
            System.out.println(ciudad[i]);
            System.out.print("Valor maximo: " );
            int vmax = consola.nextInt();
        }
    }


    public static int[] JSPgenerarTemperaturas(int temp){
        int valor = 0;
        for (int i = 0; i < DIASEMANA; i++){
            System.out.println();
        }

        temp = (int)Math.random() * valor;
        return valor;

    }

}
