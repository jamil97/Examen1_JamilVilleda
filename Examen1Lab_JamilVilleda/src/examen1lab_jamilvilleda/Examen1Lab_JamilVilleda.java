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
        
        System.out.println("Ingrese un nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese el size: ");
        int size = sc.nextInt();
        lista.add(new SistemaArchivos(nombre, usuario, size));

        System.out.print(usuario + "/" + "root" + "/");
        comando = sc.next();
        String comando2 = comando.substring(0, 4);
        if ("mkdir".equals(comando2)) {
            StringTokenizer st = new StringTokenizer(comando, " ");
            while (st.hasMoreTokens()) {
                nombrecarpeta = st.nextToken();
                sizecarpeta = st.nextToken();
            }
           lista.add(new Carpeta());
           
           
            
        }

    }

}
