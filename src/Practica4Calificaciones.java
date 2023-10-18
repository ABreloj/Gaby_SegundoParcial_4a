import filesCalificaciones.files;
import java.util.Scanner;

public class Practica4Calificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] promediosParciales = new double[4];
        int[][] calificaciones = new int[20][4];


        System.out.println("Elije el parcial 1:");
        String name1 = scanner.next();
        files file1 = new files();
        int[] array1 = file1.lecturaParciales(name1);
        calificaciones[0] = array1;
        double promedioParcial1 = file1.calcularPromedio(array1);
        promediosParciales[0] = promedioParcial1;
        System.out.println("Calificaciones del parcial 1:");
        for (int calificacion : array1) {
            System.out.println(calificacion);
        }


        System.out.println("Elije el parcial 2:");
        String name2 = scanner.next();
        files file2 = new files();
        int[] array2 = file2.lecturaParciales(name2);
        calificaciones[1] = array2;
        double promedioParcial2 = file2.calcularPromedio(array2);
        promediosParciales[1] = promedioParcial2;
        System.out.println("Calificaciones del parcial 2:");
        for (int calificacion : array2) {
            System.out.println(calificacion);
        }


        System.out.println("Elije el parcial 3:");
        String name3 = scanner.next();
        files file3 = new files();
        int[] array3 = file3.lecturaParciales(name3);
        calificaciones[2] = array3;
        double promedioParcial3 = file3.calcularPromedio(array3);
        promediosParciales[2] = promedioParcial3;
        System.out.println("Calificaciones del parcial 3:");
        for (int calificacion : array3) {
            System.out.println(calificacion);
        }


        System.out.println("Elije el parcial 4:");
        String name4 = scanner.next();
        files files = new files();
        int[] array4 = files.lecturaParciales(name4);
        calificaciones[3] = array4;
        double promedioParcial4 = files.calcularPromedio(array4);
        promediosParciales[3] = promedioParcial4;
        System.out.println("Calificaciones del parcial 4:");
        for (int calificacion : array4) {
            System.out.println(calificacion);
        }

        System.out.println("Ingresa el nombre del archivo para guardar los promedios de los parciales:");
        String nombreArchivo = scanner.next();
        files.guardarPromedio(nombreArchivo, promediosParciales);

        double[] filaProm=new double[20];


        for(int i=0;i<filaProm.length;){
            double prom=array1[i]+array2[i]+array3[i]+array4[i];
            double fila=prom/4;
            filaProm[i]=fila;
            i++;
        }

        System.out.println("Ahora vamos a con las filas :D ");

        System.out.println("Ingrese el nombre para el archivo de texto de filas");
        String name5=scanner.next();
        files.promedioFila(name5, filaProm);
    }
}
