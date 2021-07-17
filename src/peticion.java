import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.io.*;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSplitPaneUI;


public class peticion {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese un dato: ");
        String dato=in.nextLine();
        System.out.println("El dato ingresado es: "+dato);

        String mensaje="ingrese un dato",str;
        str=JOptionPane.showInputDialog(null,mensaje);
        System.out.println("El dato ingresado es: "+str);}
        

        public static void leer()throws Exception{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter String");
            String s=br.readLine();
            System.out.println("Ek dato ingresado es: "+s);

        }
        

    }
    

