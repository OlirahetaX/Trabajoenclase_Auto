package trabajoenclase;

import java.util.Scanner;

public class TrabajoEnClase {
    public static Scanner vini = new Scanner(System.in);
    public static Scanner rm = new Scanner(System.in);
    public static void main(String[] args) {
  
        try {
            System.out.println("Ingrese 1)marca, 2)modelo, 3)tipo, 4)color, 5)nombre del dueño, 6)patron de acceso y 7)año del vehiculo en ese orden(Presionar ENTER despues de cada dato)");
            String[] datos = new String[5];
            int[] dato = new int[2];
            for (int i = 0; i < 7; i++) {
                System.out.print((i + 1) + ")");
                if (i < 5) {
                    datos[i] = rm.nextLine();
                } else {
                    dato[i - 5] = vini.nextInt();
                }
            }
            
            Auto carrito = new Auto(datos[0], datos[1], datos[2], datos[3], datos[4], dato[0], dato[1]);
            carrito.ingresar(dato[0]);
            carrito.arrancar();
            boolean x = carrito.policia();
            if(x==true){
                System.out.println(carrito);
                System.out.println("Policia: Tenga buen dia");
            }else{
                System.out.println(datos[4]+": NO QUIERO");
                System.out.println("Policia: Bueno hoy va a dormir en prision");
            }
            
        } catch (Exception e) {
            System.out.println("Usted ingreso un dato no valido");
        }
    }

}
