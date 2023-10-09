import java.util.Scanner;

public class Practica2ValoresMin_Gaby {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] arreglo1(int x) {
        int[] cantidad = new int[x];
        for (int i=0; i<x; i++) {
            System.out.print("Ingrese el valor para el puesto " + i + ": ");
            cantidad[i] = scanner.nextInt();
        }
        return cantidad;
    }

    public static int arreglo2(int[] arreglo) {
        int mayor=arreglo[0];
        for (int i=0; i<arreglo.length; i++) {
            if (arreglo[i]>mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public static int arreglo3(int[] arreglo) {
        int menor=arreglo[0];
        for (int i=0; i<arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public static int arreglo4(int[] arreglo){
        int impar=arreglo[1];

        for(int i=0;i<impar; i++){
            if(arreglo[i]%2==0){
                int x=0;
                x++;
            }
        }
        return impar;
    }

    public static int arreglo5(int[] arreglo) {
        int par = arreglo[2];

        for (int i = 0; i < par; i++) {
            if (arreglo[i] % 2 == 0) {
                return par;
            } else {
                int x = 0;
                x++;
            }
            return par;
        }
        return par;
    }


    public static void main(String[] args) {
        int a, c = 0;
        int[] cantidad;
        System.out.println("Dime el tamaño del arreglo");
        a = scanner.nextInt();

        cantidad = arreglo1(a);
        int numMayor=arreglo2(cantidad);
        int numMenor=arreglo3(cantidad);
        int numImpar=arreglo4(cantidad);
        int numPar=arreglo5(cantidad);

        for (int b = 0; b < cantidad.length; b++) {
            System.out.println("Puesto " + b + ": " + cantidad[b]);
            c++;
        }

        System.out.println("El arreglo tiene : " + c + " puestos");
        System.out.println("El número mayor del arreglo es: " + numMayor);
        System.out.println("El número menor del arreglo es: " + numMenor);
        System.out.println("hAY: "+numImpar+" Numeros impares en el arreglo");
        System.out.println("hAY: "+numPar+" Numeros impares en el arreglo");
    }
}
