package app;

import java.util.HashMap;
import java.util.Scanner;

public class Inventario {

  public static void coletarInformacoes() {
    Scanner scanner = new Scanner (System.in);
    int numero;
    int quantidade = 0;
    int soma = 0;
    int maior = Integer.MIN_VALUE;
    int menorImpar = Integer.MAX_VALUE;
    HashMap<Integer, Integer> ocorrencias = new HashMap<> ();

    do {
      System.out.print ("Digite um número (ou 0 para encerrar): ");
      numero = scanner.nextInt ();

      if (numero == 0) {
        break;
      }

      quantidade++;
      soma += numero;

      if (numero > maior) {
        maior = numero;
      }

      if (numero % 2 != 0 && numero < menorImpar) {
        menorImpar = numero;
      }

      if (ocorrencias.containsKey (numero)) {
        ocorrencias.put (numero, ocorrencias.get (numero) + 1);
      } else {
        ocorrencias.put (numero, 1);
      }
    } while (true);
    if (quantidade == 0) {
      System.out.println ("Nenhum número foi digitado.");
    } else {
      double media = (double) soma / quantidade;

      System.out.println ("Quantidade de números lidos: " + quantidade);
      System.out.println ("Maior número lido: " + maior);
      System.out.printf ("Média dos números lidos: %.2f%n", media);

      if (menorImpar != Integer.MAX_VALUE) {
        System.out.println ("Menor número ímpar lido: " + menorImpar);
      }

      for (int chave : ocorrencias.keySet ()) {
        int ocorrencia = ocorrencias.get (chave);
        System.out.println ("O número " + chave + " ocorreu " + ocorrencia + " vezes.");
      }
    }
  }
}