package app;

public class CompactarCaracter {

  static String compactar(String letra) {

    //modificar uma cadeia de caracteres sem criar um novo objeto.
    StringBuilder compactada = new StringBuilder ();
    char caractereAtual = letra.charAt (0);
    int result = 1;

    for (int i = 1; i < letra.length (); i++) {
      if (letra.charAt (i) == caractereAtual) {
        result++;
      } else {
        compactada.append (caractereAtual).append (result);
        caractereAtual = letra.charAt (i);
        result = 1;
      }
    }
    compactada.append (caractereAtual).append (result);
    return compactada.toString ();
  }
}
