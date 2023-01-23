import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Detetive {
  public static void main(String[] args) throws Exception {
    List<String> suspeito = new ArrayList<String>();
    Scanner s = new Scanner(System.in);

    System.out.println("Responder as perguntas com S ou N");
    System.out.println("Telefonou para a vítima? ");
    suspeito.add(s.next());
    System.out.println(" Ja esteve no local do crime? ");
    suspeito.add(s.next());
    System.out.println("Mora perto da vitima? ");
    suspeito.add(s.next());
    System.out.println("Estava devendo dinheiro para a vítima? ");
    suspeito.add(s.next());
    System.out.println("Já trabalhou com a Vítima? ");
    suspeito.add(s.next());

    s.close();

    int soma= 0;
    for (int cont = 0; cont < 5; cont++) {
      if (suspeito.get(cont).equals("S")) {
        soma++;
      
      }
    }
      switch(soma){
        case 1:
        System.out.println("Elementar, meu Caro Watson");
        break;
        case 2:
          System.out.println("Meu Caro! Eu o declaro Suspeito!");
          break;
        case 3:
          System.out.println("Meu Caro! você é cumplice de um resgate!");
          break;
        case 4:
          System.out.println("Meu Caro! você é cumplice de um resgate!");
          break;
        case 5:
          System.out.println("Suspeito..Muito Suspeito!! -_-");
          break;
        default:
          System.out.println("Elementar, meu Caro Watson");
        
      }
      
  }
}
