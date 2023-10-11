import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
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

    public static void writeKeyboardToFile(String name){
            //Un apuntado a un espacio fisico del dd
        FileWriter archivo;
            //La llave de acceso para escribir el archivo
        PrintWriter writer;
        //Para escribir del teclado al dd
        BufferedReader bufer=new BufferedReader(new InputStreamReader((System.in)));
        String entrda;
        char respuesta;

        try {
            //Apuntador al archivo que se va a crear
            archivo=new FileWriter("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");
            //Abrir el archivo en modo para escribir
            writer=new PrintWriter(archivo);
            do{
                System.out.println("Escribe lo que quieras: ");
                entrda=bufer.readLine();
                //Guardar lo recuperado desde el teclado
                writer.println(entrda);
                System.out.println("Escribe - para parar, cualquier otra letra para continnuar");
                entrda= bufer.readLine();
                respuesta=entrda.charAt(0);

            }while(respuesta!='-');
            archivo.close();
        }catch (Exception e){
            System.out.println("Error al escribir el archivo "+e.toString());
        }
    }

    public static boolean[] fileToBooleanArray(String name){
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        String linea;
        boolean[] array=null;
        int t;
        int i=0;

        try{

            t=countLines(name);

            array=new boolean[t];
            archivo=new File("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");
            reader=new FileReader(archivo);
            bufer=new BufferedReader(reader);
            while((linea=bufer.readLine())!=null){
                array[i]=Boolean.parseBoolean(linea);
                i++;
            }
            reader.close();
        }catch(Exception e){
            System.out.println("Error al leerl el achivo/documento :( "+e.toString());
        }
        return array;
    }

    public static double[] fileToDoubleArray(String name){
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        String linea;
        double[] array=null;
        int t;
        int i=0;

        try{

            t=countLines(name);

            array=new double[t];
            archivo=new File("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");
            reader=new FileReader(archivo);
            bufer=new BufferedReader(reader);
            while((linea=bufer.readLine())!=null){
                array[i]=Double.parseDouble(linea);
                i++;
            }
            reader.close();
        }catch(Exception e){
            System.out.println("Error al leerl el achivo/documento :( "+e.toString());
        }
        return array;
    }

    public static void writeArrayToFile(String name,int[] array){
        FileWriter archivo;
        PrintWriter writer;
        try {
            archivo=new FileWriter("C:\\Users\\Abraham\\Documents\\Games\\"+name+".txt");
            writer=new PrintWriter(archivo);
            //Guardar el arreglo a un archivo
            for(int unDato:array){
                writer.println(unDato);
            }
            archivo.close();
        }catch (Exception e){
            System.out.println("Error al escribir el archivo "+e.toString());
        }
    }



        public static void main(String[] args) throws IOException {
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

            //Crear y llenar el areglo numerosX3
            numerosX3=new int[numeros.length];
            for (int i=0;i<numeros.length;i++){
                numerosX3[i]=numeros[i]*3;
                System.out.println("Numeros por 3 ["+i+"]: "+numerosX3[i]);
            }
            System.out.println("Escribe el nombre del archivo de numerosX3: ");
            fileName= bufer.readLine();
            writeArrayToFile(fileName,numerosX3);

            //System.out.println("Crear un archivo de texto");
            //System.out.println("Escribe el nombre del archivo: ");
            //fileName= bufer.readLine();
            //writeFile(fileName);

            System.out.println("Lee un boolean");
            System.out.println("Escribe el nombre del archivo: ");
            fileName=bufer.readLine();
            booleanos=fileToBooleanArray(fileName);
            for (boolean unBoolean:booleanos){
                System.out.println(unBoolean);
            }

            System.out.println("Lee un double");
            System.out.println("Escribe el nombre del archivo: ");
            fileName=bufer.readLine();
            doubles=fileToDoubleArray(fileName);
            for (double unDouble:doubles){
                System.out.println(unDouble);
            }

        }




}
