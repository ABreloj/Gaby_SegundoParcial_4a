import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Practica3LeerArchivos_Gaby {

        public static void leerArchivos(String name){
            File archivo;
            FileReader reader;
            BufferedReader bufer;
            String linea;

            try{
                archivo=new File("C:\\Users\\Estudiante\\Documents\\Dinosaurio\\"+name+".txt");
                //Abrir el archivo
                reader=new FileReader(archivo);
                //ajustar el bufer
                bufer=new BufferedReader(reader);
                //Lectura del contenido del archivo
                while((linea=bufer.readLine())!=null){
                    System.out.println("Línea leída: "+linea);
                }
                reader.close();
            }catch(Exception e){
                System.out.println("Error al leerl el achivo/documento :( "+e.toString());
            }
        }


        public static void main(String[] args) throws IOException {
            BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
            String fileName;

            System.out.println("Lextura de un archivo de texto");
            System.out.println("Escribe el nombre del archivo");
            fileName=bufer.readLine();
            leerArchivos(fileName);
        }




}
