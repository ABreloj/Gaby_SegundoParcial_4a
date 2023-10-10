import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Practica3LeerArchivos_Gaby {

        public static int countLines(String name){
            File archivo;
            FileReader reader;
            BufferedReader bufer;
            int numeroLineas=0;
            try{
                archivo=new File("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");

                reader=new FileReader(archivo);

                bufer=new BufferedReader(reader);
                //contar las lineas del archivo
                while((bufer.readLine())!=null){
                    numeroLineas++;
                }
                reader.close();
            }catch(Exception e){
                System.out.println("Error al leerl el achivo/documento :( "+e.toString());
                }
            return numeroLineas;
            }



        public static String[] fileToStringArray(String name){
            File archivo;
            FileReader reader;
            BufferedReader bufer;
            String linea;
            String[] array=null;
            int t;
            int i=0;

            try{
                //Obtenemos el tama~o del archivo.
                t=countLines(name);
                //con el tama~o del archivo, construimos el arreglo
                array=new String[t];
                archivo=new File("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");
                //Abrir el archivo
                reader=new FileReader(archivo);
                //ajustar el bufer
                bufer=new BufferedReader(reader);
                //Lectura del contenido del archivo
                while((linea=bufer.readLine())!=null){
                    //System.out.println("Línea leída: "+linea);
                    array[i]=linea;
                    i++;
                }
                reader.close();
            }catch(Exception e){
                System.out.println("Error al leerl el achivo/documento :( "+e.toString());
            }
            return array;
        }


        public static int[] fileToIntArray(String name){
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        String linea;
        int[] array=null;
        int t;
        int i=0;

        try{

            t=countLines(name);

            array=new int[t];
            archivo=new File("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");
            reader=new FileReader(archivo);
            bufer=new BufferedReader(reader);
            while((linea=bufer.readLine())!=null){
                array[i]=Integer.parseInt(linea);
                i++;
            }
            reader.close();
        }catch(Exception e){
            System.out.println("Error al leerl el achivo/documento :( "+e.toString());
        }
        return array;
    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
            String fileName;
            String[]  videogames;
            int[] numeros;

            System.out.println("Lextura de un archivo de texto");
            System.out.println("Escribe el nombre del archivo");
            fileName=bufer.readLine();
            videogames=fileToStringArray(fileName);
            System.out.println("Contenido del arreglo: ");
            for(String unVideojuego:videogames){
                System.out.println(unVideojuego);
            }
            System.out.println("Lectura de datos numericos: ");
            System.out.println("Escribe el nombre del nuevo archivo: ");
            fileName=bufer.readLine();
            numeros=fileToIntArray(fileName);
            System.out.println("Conteido del arreglo de numeros: ");
            for (int unNumero:numeros){
                System.out.println(unNumero);
            }
        }




}
