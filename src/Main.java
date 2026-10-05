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

    }

    public static void ejercicio5(){

    }

    public static void ejercicio6(){

    }

    public static void ejercicio7(){

    }

    public static void ejercicio8(){

    }

    public static void ejercicio9(){

    }

    public static void ejercicio10(){
        
    }
}
