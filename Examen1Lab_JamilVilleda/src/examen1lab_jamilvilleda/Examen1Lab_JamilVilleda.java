/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_jamilvilleda;

/**
 *
 * @author Jamil
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Examen1Lab_JamilVilleda {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String comando = "";
        String nombrecarpeta = "";
        String sizecarpeta = "";
        ArrayList<Object> lista = new ArrayList();
        Date fecha = new Date();
        System.out.println("Ingrese un nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese el size: ");
        int size = sc.nextInt();
        lista.add(new SistemaArchivos(nombre, usuario, size));

        while (true) {

            System.out.print(usuario + "/" + "root" + "/");
            sc.nextLine();
            comando = sc.nextLine();
            String[] comando2 = comando.split(" ");

            for (int i = 0; i < comando2.length; i++) {
                if (comando2[i].equalsIgnoreCase("exit")) {
                    System.exit(0);
                }
            }

            if ("mkdir".equalsIgnoreCase(comando2[0])) {
                String[] palabra = comando.split(" ");
                for (String direccion : palabra) {
                    nombrecarpeta = palabra[1];
                    sizecarpeta = palabra[2];
                }
                lista.add(new Archivo(nombrecarpeta, Integer.parseInt(sizecarpeta)));
                System.out.println("Se ha creado exitosamente una carpeta de nombre: " + nombrecarpeta + "\n"
                        + "Fecha creacion: " + fecha);
            }

            if ("del".equalsIgnoreCase(comando2[0])) {
                String[] palabra = comando.split("  ");

            }

            if ("cat".equalsIgnoreCase(comando2[0])) {
                String palabra = comando.substring(comando.length() - 4, comando.length());
                String palabra2 = comando.substring(comando.length() - 5, comando.length());
                if (palabra.equalsIgnoreCase(".txt")) {

                    System.out.println("Ingrese lo que desea agregar al archivo de texto: ");
                    String mensaje = sc.nextLine();
                    lista.add(new ArchivoTexto(mensaje));
                    System.out.println("Se ha agregado el archivo de texto correctamente.");

                } else if (palabra2.equalsIgnoreCase(".exec")) {

                    System.out.println("Ingrese todos lo comandos a realizar: ");
                    String cm = sc.nextLine();
                    String[] comandos = cm.split("0");
                    for (String comando1 : comandos) {
                        System.out.println(comando1);

                    }
                }
            }

            if ("cd".equalsIgnoreCase(comando2[0])) {
                String[] palabra = comando.split(" ");
                for (String string : palabra) {
//                    if (palabra[1] instanceof Archivo) {
//                        
//                    }                    
                }
            }

            if ("ls".equalsIgnoreCase(comando2[0])) {
                for (Object t : lista) {
                    System.out.println(t);
                }
            }

            if ("mod".equalsIgnoreCase(comando2[0])) {
                String[] palabra = comando.split(" ");
                for (String string : palabra) {

                    String txt = palabra[1];
      
                    
                }

            }
        }
    }
}
