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
        System.out.print(usuario + "/" + "root" + "/");
        sc.nextLine();
        comando = sc.nextLine();
        String[] comando2 = comando.split(" ");

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
        System.out.print(usuario + "/" + "root" + "/");
        sc.nextLine();
    }
}
