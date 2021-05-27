import java.util.Scanner;

public class Tablero {
    
    private String[][] tablero = {
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "," "," "}
    };

    /**
     * Recibe una palabra y la pone el tablero de forma horizontal 
     * comenzando en la coordenada recibida
     * 
     * @param x         Columna en la cual se va a poner la palabra 
     * @param y         Fila en la cual se va a poner la palabra
     * @param palabra   Palabra la cual se va a poner en el Tablero
     * @exception       ArrayIndexOutOfBoundsException
     */
    public void palabraHorizontal(int x, int y, String palabra) {

        try {
            for (int i = 0; i < palabra.length(); i++) {
                tablero[y-1][x-1+i] = Character.toString(palabra.charAt(i));
            }
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Palabra o coordenadas no válidas, su palabra se ha imprimido mal");;
        }
        

    }

    /**
     * Recibe una palabra y la pone el tablero de forma vertical 
     * comenzando en la coordenada recibida
     * 
     * @param x         Columna en la cual se va a poner la palabra 
     * @param y         Fila en la cual se va a poner la palabra
     * @param palabra   Palabra la cual se va a poner en el Tablero
     * @exception       ArrayIndexOutOfBoundsException
     */
    public void palabraVertical(int x, int y, String palabra){

        try {
            for (int i = 0; i < palabra.length(); i++) {
                tablero[y-1+i][x-1] = Character.toString(palabra.charAt(i));
            }
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Palabra o coordenadas no válidas, su palabra se ha imprimido mal");;
        }
        
    }

    /**
     * Imprime el tablero en la pantalla con un 
     * formato que muestra las coordenadas
     */
    public void mostrarTablero(){
        System.out.println(
        "\n     1   2   3   4   5   6   7   8   9  10 " +
        "\n                                           " +
        "\n1   ["+tablero[0][0]+"]|["+tablero[0][1]+"]|["+tablero[0][2]+"]|["+tablero[0][3]+"]|["+tablero[0][4]+"]|["+tablero[0][5]+"]|["+tablero[0][6]+"]|["+tablero[0][7]+"]|["+tablero[0][8]+"]|["+tablero[0][9]+"]" +
        "\n    ---------------------------------------" +
        "\n2   ["+tablero[1][0]+"]|["+tablero[1][1]+"]|["+tablero[1][2]+"]|["+tablero[1][3]+"]|["+tablero[1][4]+"]|["+tablero[1][5]+"]|["+tablero[1][6]+"]|["+tablero[1][7]+"]|["+tablero[1][8]+"]|["+tablero[1][9]+"]" +
        "\n    ---------------------------------------" +
        "\n3   ["+tablero[2][0]+"]|["+tablero[2][1]+"]|["+tablero[2][2]+"]|["+tablero[2][3]+"]|["+tablero[2][4]+"]|["+tablero[2][5]+"]|["+tablero[2][6]+"]|["+tablero[2][7]+"]|["+tablero[2][8]+"]|["+tablero[2][9]+"]" +
        "\n    ---------------------------------------" +
        "\n4   ["+tablero[3][0]+"]|["+tablero[3][1]+"]|["+tablero[3][2]+"]|["+tablero[3][3]+"]|["+tablero[3][4]+"]|["+tablero[3][5]+"]|["+tablero[3][6]+"]|["+tablero[3][7]+"]|["+tablero[3][8]+"]|["+tablero[3][9]+"]" +
        "\n    ---------------------------------------" +
        "\n5   ["+tablero[4][0]+"]|["+tablero[4][1]+"]|["+tablero[4][2]+"]|["+tablero[4][3]+"]|["+tablero[4][4]+"]|["+tablero[4][5]+"]|["+tablero[4][6]+"]|["+tablero[4][7]+"]|["+tablero[4][8]+"]|["+tablero[4][9]+"]" +
        "\n    ---------------------------------------" +
        "\n6   ["+tablero[5][0]+"]|["+tablero[5][1]+"]|["+tablero[5][2]+"]|["+tablero[5][3]+"]|["+tablero[5][4]+"]|["+tablero[5][5]+"]|["+tablero[5][6]+"]|["+tablero[5][7]+"]|["+tablero[5][8]+"]|["+tablero[5][9]+"]" +
        "\n    ---------------------------------------" +
        "\n7   ["+tablero[6][0]+"]|["+tablero[6][1]+"]|["+tablero[6][2]+"]|["+tablero[6][3]+"]|["+tablero[6][4]+"]|["+tablero[6][5]+"]|["+tablero[6][6]+"]|["+tablero[6][7]+"]|["+tablero[6][8]+"]|["+tablero[6][9]+"]" +
        "\n    ---------------------------------------" +
        "\n8   ["+tablero[7][0]+"]|["+tablero[7][1]+"]|["+tablero[7][2]+"]|["+tablero[7][3]+"]|["+tablero[7][4]+"]|["+tablero[7][5]+"]|["+tablero[7][6]+"]|["+tablero[7][7]+"]|["+tablero[7][8]+"]|["+tablero[7][9]+"]" +
        "\n    ---------------------------------------" +
        "\n9   ["+tablero[8][0]+"]|["+tablero[8][1]+"]|["+tablero[8][2]+"]|["+tablero[8][3]+"]|["+tablero[8][4]+"]|["+tablero[8][5]+"]|["+tablero[8][6]+"]|["+tablero[8][7]+"]|["+tablero[8][8]+"]|["+tablero[8][9]+"]" +
        "\n    ---------------------------------------" +
        "\n10  ["+tablero[9][0]+"]|["+tablero[9][1]+"]|["+tablero[9][2]+"]|["+tablero[9][3]+"]|["+tablero[9][4]+"]|["+tablero[9][5]+"]|["+tablero[9][6]+"]|["+tablero[9][7]+"]|["+tablero[9][8]+"]|["+tablero[9][9]+"]\n\n");
    }

    /**
     * Recibe el nombre del jugador actual para generar los textos que
     * le piden los datos que debe ingresar, y con estos datos se muestra
     * en el tablero la palabra deseada.
     * 
     * @param nombre    Nommbre del jugador del turno actual
     * @return          Palabra que el usuario puso en el tablero
     */
    public String elegirPalabraDireccion(String nombre){

        Scanner in = new Scanner(System.in);
        System.out.println("\n¿" + nombre + " su palabra será vertical u horizontal?");

        String posicion = in.next().toLowerCase();

        System.out.println("\n" + nombre + " escriba las coordenadas de la primera letra de su palabra");
        System.out.println("Columna: ");
        int x = in.nextInt();

        System.out.println("Fila: ");
        int y = in.nextInt();

        System.out.println("\nIngrese la palabra: ");
        String palabra = in.next();


        if (posicion.equals("vertical")){
            palabraVertical(x, y, palabra);
        }else if (posicion.equals("horizontal")){
            palabraHorizontal(x, y, palabra);
        }else{
            System.out.println("No es una posicion válida");
        }


        mostrarTablero();

        return palabra;

    }

}