import java.sql.SQLOutput;
import java.util.Scanner;

public class Main Main {
    public static void main(String[] args) {

        Scanner entradaTeclad=new Scanner(System.in);


        String nombreUsuario;
        double costoUnitarioProducto;
        int numerPizzas;
        double totalVentas;
        try (Scanner entradaTeclado = new Scanner(System.in)) {

            System.out.println("*** pizzeria jp ***");
            System.out.println("---------");
            System.out.println("pizza1: napolitana");
            System.out.println("pizza2: hawaiina");
            System.out.println("pizza3: carnes");

            //DECLARANDO NUESTRAS VARIABLES
            //CONSTRUYENDO EN MEMORIA UNA VARIABLE
            String direccionUsuario;
            String telefonoMovil;
            int pizzaSeleccionada;
            //PROCESO
            //1.CARGAMOS LAS VARIABLES(LLAMAR LA VARIABLE)
       /* nombreUsuario="camilo prasca";
        direccionUsuario="carrera 72d #74-225";
        telefonoMovil="3017259417";
        pizzaSeleccionada=2;
        costoUnitarioProducto=35000;
        numerPizzas= 2;*/
            System.out.println("digite su nombre");
            nombreUsuario = entradaTeclado.next();
            System.out.println("digite el numero de pizzas");
            numerPizzas = entradaTeclado.nextInt();
            System.out.println("digita el costo de una pizza");
            costoUnitarioProducto = entradaTeclado.nextDouble();
        }


        //2.CALCULAMOS LAS OPERACIONES ARITMETICAS QUE SEAN NECESARIAS
        totalVentas=numerPizzas*costoUnitarioProducto;

        //3.MOSTRANDO EL RESULTADO (SALIDA POR CONSOLA)
        System.out.println("señor usuario:"+nombreUsuario);
        System.out.println("usted compro:"+numerPizzas);
        System.out.println("EL COSTO TOTAL DE SU COMPRA FUE:"+totalVentas);

    }
}