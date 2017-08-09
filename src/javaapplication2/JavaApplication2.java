/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

 
    public static void main(String[] args) {
      
      int ganancias = 0;
      int horas_extras = 0;
      int horas_extras1 = 0;
      int horas_extras2 = 0;
      int salario_base = 0;
      int salario = 0;
      
      
      System.out.println("cuantas horas trabajo?");
         
      Scanner horas = new Scanner(System.in);
      int h = horas.nextInt();
      
      System.out.println("cuantas cuesta una hora trabajo?");
      Scanner horas6 = new Scanner(System.in);
      int valor_hora = horas6.nextInt();
      
      if (h>40) {horas_extras = (h-40);
            
        } else { horas_extras = 0;
        }
        
        
         if (horas_extras>8) {horas_extras1 = 8;
            
        } else { horas_extras1 = horas_extras;
        }
         
         
         
        
        if (horas_extras>8) {horas_extras2 = (horas_extras-8);
            
        } else { horas_extras2 = 0;
        }
        
            System.out.println("Las horas extra 1 son");
            System.out.println(horas_extras1);
            
            
            System.out.println("Las horas extra 2 son");
            System.out.println(horas_extras2);
        
        if (h<40) { salario_base = (valor_hora * h );
                } else { salario_base = 40000 ;
            
        }
    
           
        if (h>40) { salario = (salario_base + horas_extras1*2*valor_hora + horas_extras2*3*valor_hora);
            
        } else { salario = salario_base;
        }
     
        
        System.out.println(salario); 
    }
    
}
