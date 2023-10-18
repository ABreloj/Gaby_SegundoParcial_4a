package filesCalificaciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;

public class files {

    public int[] lecturaParciales(String name) {
        File archivo;
        FileReader reader = null;
        BufferedReader bufer = null;
        String linea;
        int[] array = null;
        int i = 0;

        try {
            archivo = new File("C:\\Users\\Abraham\\Documents\\Calificaciones\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);

            int lineCount = 0;
            while (bufer.readLine() != null) {
                lineCount++;
            }
            bufer.close();

            array = new int[lineCount];

            reader = new FileReader(archivo); // Reabrimos el archivo
            bufer = new BufferedReader(reader);

            while ((linea = bufer.readLine()) != null) {
                array[i] = Integer.parseInt(linea);
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo/documento :( " + e.toString());
        } finally {
            try {
                if (bufer != null) {
                    bufer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo :( " + e.toString());
            }
        }
        return array;
    }


    public double calcularPromedio(int[] calificaciones) {
        if (calificaciones == null || calificaciones.length == 0) {
            return 0.0;
        }

        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        return (double) suma / calificaciones.length;
    }

    public static void guardarPromedio(String parcial, double[] promedio) {
        try {
            String ruta = "C:\\Users\\Abraham\\Documents\\Calificaciones\\";
            String nombreArchivo = ruta + parcial + ".txt"; // Incluye la ruta completa
            FileWriter archivo = new FileWriter(nombreArchivo);
            PrintWriter writer = new PrintWriter(archivo);

            for (double p : promedio) {
                writer.println(p); // Escribe cada promedio en una nueva línea
            }

            // Cierra el archivo
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el promedio en el archivo: " + e.toString());
        }
    }


    public static double calcularPromedioGeneral(double[] promedios) {
        if (promedios == null || promedios.length == 0) {
            return 0.0;
        }

        double suma = 0;
        for (double promedio : promedios) {
            suma += promedio;
        }

        return suma / promedios.length;
    }

    public static void promedioFila(String parcial, double[] promedio) {
        try {
            String ruta = "C:\\Users\\Abraham\\Documents\\Calificaciones\\";
            String nombreArchivo = ruta + parcial + ".txt";
            FileWriter archivo = new FileWriter(nombreArchivo);
            PrintWriter writer = new PrintWriter(archivo);

            for (double p : promedio) {
                writer.println(p);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el promedio en el archivo: " + e.toString());
        }
    }


}
