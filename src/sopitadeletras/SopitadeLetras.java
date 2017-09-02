/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopitadeletras;
import java.util.Scanner;
/**
 *
 * @author Soledad Moraga
 */
public class SopitadeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String cant1=sc.nextLine();
        int cant=Integer.parseInt(cant1);
        String [] palabras = new String[cant];
        int contador=0;
        for(int i=0;i<palabras.length;i++)
        {
            palabras[i]=sc.nextLine();
        }
        String oracion=sc.nextLine();
        String [] cadOracion=oracion.split(" ");
       
        for(int i=0;i<palabras.length;i++)
        {
             int Repite=0; 
             String palabra="";
            for(int x=0;x<cadOracion.length;x++)
            {          
                if(palabras[i].equalsIgnoreCase(cadOracion[x]) == true)
                {
                    if(palabra.equals(""))
                    {
                       palabra=cadOracion[x];
                       contador++;
                    }
                    else
                    {
                         if(palabras[i].equalsIgnoreCase(palabra))
                        {
                            Repite=1;
                        }
                        if(Repite==1)
                        {
                             contador+=0;
                        }
                        else
                        {
                            contador++;
                        }
                    }      
                }       
            }
        }
        System.out.println(contador);
    }
}
