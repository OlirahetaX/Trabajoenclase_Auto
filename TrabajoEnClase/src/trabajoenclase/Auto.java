package trabajoenclase;
import java.util.Scanner;

public class Auto {
    
    public static Scanner vini = new Scanner(System.in);
    public static Scanner rm = new Scanner(System.in);
    
        public String marca;
        public String modelo;
        public String tipo;
        public String color;
        public String nombre;
        private int patron;
        public int año;
        boolean viejo = true;

        public Auto(String marca, String modelo, String tipo, String color, String nombre, int patron, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.tipo = tipo;
            this.color = color;
            this.nombre = nombre;
            this.patron = patron;
            this.año = año;
            if (año > 2015) {
                viejo = false;
            }
        }

        public void ingresar(int patron) {
            boolean x = true;
            while (x == true) {
                System.out.println("Para abrir el vehiculo: Ingrese el patron de acceso");
                int a = vini.nextInt();
                if (patron == a) {
                    System.out.println("Acceso Aprobado");
                    x = false;
                } else {
                    System.out.println("Acceso Denegado");
                }
            }
        }
        public void arrancar(){
            System.out.println("Bien ya esta adentro del vehiculo"+'\n'+"Supongamos que usted ya encendio el vehiculo");
            for (int i = 0; i < 2; i++) {
                System.out.println("Ahora ingrese hacia donde quiere ir: w) Adelante    a) Izquierda    s) Reversa  d) Derecha");
                char mov = rm.next().charAt(0);
                switch(mov){
                case 'w','W': System.out.println(this.nombre+" tu "+this.modelo+" se esta moviendo hacia adelante!!");break;
                case 'a','A': System.out.println(this.nombre+ " cuidado pon las direccionales hacia la izquierda que viene moto!");break;
                case 's','S': System.out.println(this.nombre+" primero mira si no hay carro atras");break;
                case 'd','D': System.out.println(this.nombre+" revisa el retrovisor de la derecha");break;
                }
            }
        }
        public boolean policia(){
            boolean pol;
            System.out.println("OH NO LA POLICIA!");
            if(this.viejo==false){
                System.out.println("Policia: Hola que hace con este vehiculo tan nuevo"+'\n'+"Policia: Muestreme los papeles del carro");
            }else{
                System.out.println("Policia: Hola que hace con este vehiculo tan viejo deberia de cambiar YA"+'\n'+"Policia: Muestreme los papeles del carro");
            }
            System.out.println("Si quieres mostrar los papeles del vehiculo ingresa: Y");
            char papeles = rm.next().charAt(0);
            if(papeles=='Y'||papeles=='y'){
                pol = true;
                }else{
                    pol = false;
            }
            return pol;
        }

        @Override
        public String toString() {
            return "Papeles del vehiculo: " + '\n' + "Marca= " + marca + '\n' + "Modelo= " + modelo + '\n' + "Tipo= " + tipo + '\n' + "Color= " + color + '\n' + "Nombre= " + nombre + '\n' + "Año= " + año;
        }

}
