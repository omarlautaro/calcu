
import java.util.Scanner;

public class Calculadora {
  
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
      
      
      while(true)
          System.out.println("Ingrese operacion [h (ayuda) e (salir)]: ");
          String input = scanner.nextLine();
          switch(input) {
              case"h":
                  System.out.println("ayuda");
                  break;
              case"e" :
                  return;
              case"+" :
                  int[] operandos = obtenerOperandos();
                  System.out.println("Resultado:" + operandos[0] + operandos[1]);
                  break;
              case"-" :
                 operandos = obtenerOperandos();
                  System.out.println("Resultado:" + operandos[0] - operandos[1]);
                 break;
              case"*" :
                operandos = obtenerOperandos();
                System.out.println("Resultado:" + operandos[0] * operandos[1]);
                 break;
              case"/" :
                operandos = obtenerOperandos();
                 System.out.println("Resultado:" + operandos[0] / operandos[1]);
                break;
              
              default System.out.println("ayuda"):
          }
          
          
  } 
    public static int[] obtenerOperandos(){
      System.out.println("A: ");
      int a = scanner.nextInt();
      System.out.println("B: ");
      int b = scanner.nextInt();
      
      }
  public static void printAyuda
          
}
