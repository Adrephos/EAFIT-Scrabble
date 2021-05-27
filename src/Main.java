/**
* Juego de mesa Scrabble adaptado a la consola
*
* @author   Julian Peña Ochoa
* @author   Juan Esteban Avendaño Castaño
* @version  2.0
* @since    2021-05-09 
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        Tablero tablero = new Tablero();
        ScrabblePuntos puntosA = null;
        ScrabblePuntos puntosB = null;

        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        System.out.println("* Jugador 1, inserte su nombre: ");
        j1.setNombre(in.next());
        System.out.println("* " + j1.getNombre() + ", inserte las letras de su mano (solo 7): ");
        j1.setMano((in.next().toLowerCase() + " ").substring(0,7));
        System.out.println("* " + j1.getNombre()+ " su mano es: " + j1.getMano()); 
        System.out.println("Procesando...");
        j1.combinarPalabras();
        j1.imprimirPalabras();
        System.out.println("\n");

        System.out.println("* Jugador 2, inserte su nombre: ");
        j2.setNombre(in.next());
        System.out.println("* " + j2.getNombre() + ", inserte las letras de su mano (solo 7): ");
        j2.setMano((in.next().toLowerCase() + " ").substring(0,7));
        System.out.println("* " + j2.getNombre()+ " su mano es: " + j2.getMano());
        System.out.println("Procesando...");
        j2.combinarPalabras();
        j2.imprimirPalabras();
        System.out.println("\n");

        System.out.println("Este será el tablero de juego\n");
        tablero.mostrarTablero();


        do{

            puntosA = new ScrabblePuntos(tablero.elegirPalabraDireccion(j1.getNombre()));
            j1.setPuntos(puntosA.getPuntos());


            puntosB = new ScrabblePuntos(tablero.elegirPalabraDireccion(j2.getNombre()));
            j2.setPuntos(puntosB.getPuntos());

        }while(j1.getPuntos() < 15 || j2.getPuntos() < 15);

        if(j1.getPuntos() >= 15){
            System.out.println(j1.getNombre() + " ,eres el ganador!! puntos: " + j1.getPuntos());
        }else if(j2.getPuntos() >= 15){
            System.out.println(j2.getNombre() + " ,eres el ganador!! puntos: " + j2.getPuntos());
        }

        in.close();

    }
}