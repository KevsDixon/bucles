package estructuras_interactivas;

import java.util.Scanner;

/**
 *
 * @Kevin Mauricio 
 */
public class Estructuras_Interactivas {
   //Programa que muestra los primero 10 numeros reales con un menu switch
   // 1 bucle while 
   // 2 bucle do while 
   // bucle for 
    public static void main(String[] args) {
       
    Scanner Teclado = new Scanner(System.in);    
        
      int opt;
     int contador1 = 0;
     int contador2 =0;
      do{
          System.out.println("Bienvenido al menu de opciones \n"
                  + "1° bucle while\n"
                  + "2° bucle do while\n"
                  + "3° bucle for\n"
                  + "4° salir");
          
          switch(opt = Teclado.nextInt())
          {
              case 1:
                  
                  System.out.println("has seleccionado la opcion 1\n el bucle while");
                  
                    while(contador1<=10)
                    {
                        System.out.println(contador1);
                        contador1++;
                    }
                  
                  break;
              
              case 2: 
                  
                  System.out.println("Has seleccionado  la opcion 2\n El bucle do while");
                  
                  do{
                      
                      System.out.println(contador2);
                     contador2 = contador2 + 2; // es lo mismo que poner contador++;
                    ;
                  }while(contador2<=10);
                  
                  break;
              
              case 3:
                  
                  System.out.println("Has selccionado la opcion 3\n el bucle for");
                  
                   for (int i =0; i<=10; i=i+3)
                   {
                       System.out.println(i);    
                   }
                  
                  break;
              
              case 4:
                  
                  System.out.println("El programa a finalizado gracias por usar el programa de kevin");
                  
                  break;
              
              
          }
          
          
          
          
      }while(4!=opt);
        
        
    }
    
}
