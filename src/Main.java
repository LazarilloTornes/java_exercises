import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
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
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
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

    public static void ejercicio6(Scanner scanner){
        boolean bist_year = (year%400 == 0);
        int year = 1465;
        //Solo se usa en booleanos
           
        System.out.print("Introduce un mes de forma numérica: ");
        int mes = scanner.nextInt();
        scanner.nextLine();
            switch (mes) {
                case 1,3,5,7,8,10,12:
                     System.out.println("31");
                    break;
                case 2:
                    System.out.print(bist_year ? "28" : "29");
                    break;
                case 4,6,9,11:
                    System.out.println("30");
                    break;
    
                default;
                     System.out.println("No valido");
                    
            scanner.close();

                    
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
     System.out.println("MENÚ DE OPCIONES:\n1.\tArchivo \"Nuevo\"\n2.\tRuta: C:\\\\Archivos\\\\Java\n3.\tSalir");
    }

    public static void ejercicio9(Scanner scanner){
        
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

    public static void ejercicio10(Scanner scanner){
        
        System.out.println("Introduzca su edad por favor: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca el ingreso mensual: ");
        float ingr_men = scanner.nextFloat();
        if ((edad < 18) || (edad < 25 && ingr_men < 900)){
            System.out.println("Tienes acceso a la beca");
        }
        else{
            System.out.println("No tienes acceso a la beca");
        }
        scanner.close();
    }
public static void ejercicio11(Scanner scanner);{
        System.out.println("Introduzca la nota: ");
        float nota = scanner.nextFloat();
        scanner.nextLine();
    if (nota > 10 && nota < 0) {
      System.out.println("Nota erronea");  
    }
    else{
        switch ((int)nota) {
            case 0,1,2,3,4:
                 System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default;
        }
        scanner.close();
    
}
public static void ejercicio12();{
    float temperatura;
    System.out.prinln(temperatura > 30 ? "Calor" : "Normal");
}
public static void ejercicio13(Scanner scanner);{
    System.out.print("Introduce un dia de forma numérica: ");
    int dia = scanner.nextInt();
    scanner.nextLine();
        switch (dia) {
            case 1:
                 System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default;
                 System.out.println("No valido");
                
        scanner.close();
    
}
 public static void ejercicio14(Scanner scanner);{
     System.out.print("Introduce un mes de forma numérica: ");
    int mes = scanner.nextInt();
    scanner.nextLine();
        switch (mes) {
            case 1,3,5,7,8,10,12:
                 System.out.println("31");
                break;
            case 2:
                System.out.println("28, si es bisiesto 29");
                break;
            case 4,6,9,11:
                System.out.println("30");
                break;

            default;
                 System.out.println("No valido");
                
        scanner.close();
    
 }
     public static void ejercicio15(Scanner scanner);{
        int num=100;
        int intentos = 0;
        int suma = 0;
        while (num>0){
            System.out.print("Introduce un número: ");
            num =  scanner.nextInt();
            if (num < 0){
                break;
            }
            suma = suma + num;
            intentos++;
        } System.out.print("Suma total: " +  suma + "\nIntentos: " + intentos);
     }
}
    

    
