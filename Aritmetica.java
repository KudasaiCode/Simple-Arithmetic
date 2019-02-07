//Author: Jeremy Del Valle
//Date: 2/7/19
// Programa Aritmetica.java

import java.io.*;

public class Aritmetica {
   public static void main (String args[])
   throws IOException {
      BufferedReader in = new BufferedReader( new InputStreamReader( System.in));
      
      int entero1,
          entero2,
          variable, 
          suma;
       
      double real1, 
             real2, 
             cociente;
      
      // Get inputs from user
      // And prints from 
      System.out.print("Entre un numero entero: ");
      entero1 = Integer.valueOf(in.readLine()).intValue();
      System.out.print("Éntre un otro numero entero: ");
      entero2 = Integer.parseInt(in.readLine());
      suma = entero1 + entero2;
      System.out.print("Entero1 + Entero2 = " + suma);
      
      System.out.print("\n\nEntre un numero real: ");
      real1 = Double.valueOf(in.readLine()).doubleValue();
      System.out.print("Entre otro numero real: ");
      real2 = Double.valueOf(in.readLine()).doubleValue();
      cociente = real1 / real2;
      System.out.print("Real1 / Real2 = " + cociente);
      
    }
 }
      