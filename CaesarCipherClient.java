// run this client code with your Cipher.java
// 1. compile Cipher.java
// 2. run CaesarCipherClient.java 

import java.util.*; // for Scanner

public class CaesarCipherClient {
   
   public static void main (String [] args) {
      Scanner console = new Scanner (System.in);
      
      System.out.print ("Your Message? ");
      String message = console.nextLine();
      System.out.print ("Encoding Key? ");
      int key = console.nextInt();
      
      Cipher.cipher(message, key); //Calls cipher.java
   }
}


