package app;

public class Principal {

  public static void main(String[] args) {
    CompactarCaracter compactar = new CompactarCaracter ();
    compactar.compactar ("jjjjooaoo");

    Inventario inventario = new Inventario ();
    inventario.coletarInformacoes ();

    MultiplicacaoLinhas multiplicacao = new MultiplicacaoLinhas ();
    System.out.println (multiplicacao.Lines ());
  }

}