package app;

import java.util.Scanner;

public class MultiplicacaoLinhas {

  public static boolean Lines() {

    Scanner input = new Scanner (System.in);
    System.out.println ("Digite um número inteiro: ");
    Integer n = input.nextInt ();

    if (n <= 0) {
      System.out.println ("O número precisa ser maior que zero!");
      return false;
    }
    for (int i = n; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print (j * j + " ");
      }
      System.out.println ();
    }
    return false;
  }
}
