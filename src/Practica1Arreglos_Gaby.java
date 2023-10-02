import java.util.Scanner;

public class Practica1Arreglos_Gaby {
    private static Scanner scanner = new Scanner(System.in);

    public static void ingresarCalificaciones() {

        int numGrupos = scanner.nextInt();
        double[] promediosGrupo = new double[numGrupos];

        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Grupo " + (i + 1));
            System.out.println("Dime el tamaño del grupo:");
            int tamanoGrupo = scanner.nextInt();
            double[] calificacionesGrupo = new double[tamanoGrupo];


            for (int j = 0; j < tamanoGrupo; j++) {
                System.out.print("El promedio del alumno  " + j + ": ");
                calificacionesGrupo[j] = scanner.nextDouble();
            }


            promediosGrupo[i] = calcularPromedio(calificacionesGrupo);
        }


        double promedioGeneral = calcularPromedioGeneral(promediosGrupo);


        for (int i = 0; i < numGrupos; i++) {
            System.out.println("El promedio del Grupo " + (i + 1) + " es: " + promediosGrupo[i]);
        }


        System.out.println("El promedio general de todos los grupos es: " + promedioGeneral);
    }

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static double calcularPromedioGeneral(double[] promediosGrupo) {
        double suma = 0;
        for (double promedio : promediosGrupo) {
            suma += promedio;
        }
        return suma / promediosGrupo.length;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Sacar el promedio de todos los grupos");
        System.out.println("Dime la cantidad de grupos:");
        ingresarCalificaciones();
    }
}
