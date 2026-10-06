import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    
    public static void ejercicio1(){
    //Ejercicio 1
        int ID = 2;
        int stock = 200;
        char letra = 'a';
        float precio = 21.3f;
        boolean rebajado = false;
        System.out.println("Producto: " + ID + letra + precio);
        if (rebajado) {
            System.out.print(" Rebajado");
        }
        else{
            System.out.print("Sin rebaja");
        }
    }

    public static void ejercicio2(){
    //Ejercicio 2
        final float IVA = 0.21f;
        final int rebaja = 5;      
        float precio_1 = 120.0f;
        precio_1 = precio_1 + (precio_1*IVA) - rebaja;
        System.out.println("Precio del producto rebajado mas el IVA: " + precio_1); 

    }

    public static void ejercicio3(){
    //Ejercicio 3
        int first_Num = 10;
        double precio_Final = 99.9f;
        boolean mayor_Edad = true;
        final float pi_Valor = 3.1416f;
        System.out.println(first_Num);
        System.out.println(precio_Final);
        System.out.println(mayor_Edad);
        System.out.println( pi_Valor);

    }

    public static void ejercicio4(){
        double precioExacto = 49.99f;
        int precioEntero = (int) precioExacto;
        char letra = 'p';
        System.out.println("En código Astrcii: " + (int)letra)
    }

    public static void ejercicio5(){
        int segundos = 3722;
        int minutos = segundos/60;
        int segundos_restantes = segundos%60;
        int horas = minutos/60;
        int minutos_restantes = minutos%60;
        System.out.println("")
        System.out.print( segundos + " son: " + horas + " horas, " + minutos_restantes + " minutos, " + segundos_restantes + " segundos" )

    }

    public static void ejercicio6(){
        boolean bist_year = (year%400 == 0);
        int year = 1465;
        //Solo se usa en booleanos
        System.out.print(bist_year ? "Opcion1" : "Opcion2")
        
        if (year%4 == 0 && year%100 != 0 || year%400 == 0)
        {
            System.out.print("El anio es bisiesto");
        }
        else
        {
            System.out.print("El anio NO bisiesto");
        }
        
    }

    public static void ejercicio7(){
    //El formato se edita básicamente con:
        /*
        %-> empieza el formato
        con - o sin -; el guión solo marca que es a la izquierda
        el número son los espacios que quieres dejar
        la letra es el tipo de contenido que va a tener
        para los decimales, en el número de espacio tienes que poner un ".X" con el
        número de decimales que quieras
         */
        System.out.printf("%-15s %5s %8s%n", "Nombre", "Unidades", "Precio");
        System.out.printf("%-15s %5d %8.2f%n","Pollo",400,35.87);
    }
    

    public static void ejercicio8(){
     System.out.println("MENÚ DE OPCIONES:\n1.\tArchivo \"Nuevo\"\n2.\tRuta: C:\\Archivos\\Java\n3.\tSalir");
    }

    public static void ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        System.out.println("Introduzca su edad por favor: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre + " tienes " + edad + " años, enhorabuena");
        scanner.close();
    }
    }

    public static void ejercicio10(){
        
    }
}
