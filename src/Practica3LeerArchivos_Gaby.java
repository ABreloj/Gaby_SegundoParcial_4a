import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import file.files;

public class Practica3LeerArchivos_Gaby {





        public static void main(String[] args) throws IOException {
            files files=new files();
            BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
            String fileName;
            String[]  videogames;
            int[] numeros;
            boolean[] booleanos;
            double[] doubles;
            int[] numerosX3;

            System.out.println("Lextura de un archivo de texto");
            System.out.println("Escribe el nombre del archivo");
            fileName=bufer.readLine();
            videogames=files.fileToStringArray(fileName);
            System.out.println("Contenido del arreglo: ");
            for(String unVideojuego:videogames){
                System.out.println(unVideojuego);
            }
            System.out.println("Lectura de datos numericos: ");
            System.out.println("Escribe el nombre del nuevo archivo: ");
            fileName=bufer.readLine();
            numeros=files.fileToIntArray(fileName);
            System.out.println("Conteido del arreglo de numeros: ");
            for (int unNumero:numeros){
                System.out.println(unNumero);
            }

            //Crear y llenar el areglo numerosX3
            numerosX3=new int[numeros.length];
            for (int i=0;i<numeros.length;i++){
                numerosX3[i]=numeros[i]*3;
                System.out.println("Numeros por 3 ["+i+"]: "+numerosX3[i]);
            }
            System.out.println("Escribe el nombre del archivo de numerosX3: ");
            fileName= bufer.readLine();
            files.writeArrayToFile(fileName,numerosX3);

            //System.out.println("Crear un archivo de texto");
            //System.out.println("Escribe el nombre del archivo: ");
            //fileName= bufer.readLine();
            //writeFile(fileName);

            //System.out.println("Lee un boolean");
            //System.out.println("Escribe el nombre del archivo: ");
            //fileName=bufer.readLine();
            //booleanos=fileToBooleanArray(fileName);
            //for (boolean unBoolean:booleanos){
               //System.out.println(unBoolean);
            //}

            //System.out.println("Lee un double");
            //System.out.println("Escribe el nombre del archivo: ");
            //fileName=bufer.readLine();
            //doubles=fileToDoubleArray(fileName);
            //for (double unDouble:doubles){
                //System.out.println(unDouble);
            //}

        }




}
