import java.util.HashMap;
import java.util.List;

public class ScrabblePuntos {
  private static final HashMap<Character, Integer> SCORE_MAP = new HashMap<Character, Integer>() {{
    put('a', 1);
    put('b', 3);
    put('c', 3);
    put('d', 2);
    put('e', 1);
    put('f', 4);
    put('g', 2);
    put('h', 4);
    put('i', 1);
    put('j', 8);
    put('k', 5);
    put('l', 1);
    put('m', 3);
    put('n', 1);
    put('ñ', 8);
    put('o', 1);
    put('p', 3);
    put('q', 10);
    put('r', 1);
    put('s', 1);
    put('t', 1);
    put('u', 1);
    put('v', 4);
    put('w', 4);
    put('x', 8);
    put('y', 4);
    put('z', 10);
  }};
  /**
   * Usuario ingresa la palabra y si se forma una palabra que ocupa dos casillas de "doble tanto de palabraâ€?,
   * primero se duplica el valor de la palabra y luego se reduplica
   */
  public enum PalabraMultiplicador {
    UNO(1),
    DOBLE(2),
    TRIPLE(3);

    private final int multiplicador;

    PalabraMultiplicador(int multiplicador) {
      this.multiplicador = multiplicador;
    }
  }
  public enum MultiplicadorLetra {
    UNO(1),
    DOBLE(2),
    TRIPLE(3);

    private final int letraMultiplicador;

    MultiplicadorLetra(int letraMultiplicador) {
      this.letraMultiplicador = letraMultiplicador;
    }
  }
  /**
   * Al momento de tener una palabra este mira cuantos puntos tiene cada letra y luego
   * se suman 
   * @param palabra          cuantas letras tiene la palabra para sacar los puntos
   * @return                 true/false   
   */
  
  private String palabra;
  private PalabraMultiplicador multiplicador;
  private List<MultiplicadorLetra> letterMultipliers;

  public ScrabblePuntos(String palabra) {
    this(palabra, PalabraMultiplicador.UNO);
  }

  public ScrabblePuntos(String palabra, ScrabblePuntos.PalabraMultiplicador multiplicador) {
    this.palabra = palabra;
    this.multiplicador = multiplicador;
  }

  public ScrabblePuntos(String palabra, ScrabblePuntos.PalabraMultiplicador multiplicador, List<MultiplicadorLetra> letterMultipliers) {
    this.palabra = palabra;
    this.multiplicador = multiplicador;
    this.letterMultipliers = letterMultipliers;
  }

  public int getPuntos() {
    char[] wordChars = palabra.toLowerCase().toCharArray();
    int puntos = 0;
    int i = 0;

    for (char c : wordChars) {
      if (letterMultipliers != null) {
        puntos += SCORE_MAP.get(c) * letterMultipliers.get(i).letraMultiplicador;
      } else {
        puntos += SCORE_MAP.get(c);
      }
      i++;
    }
    return puntos * multiplicador.multiplicador;
  }
}