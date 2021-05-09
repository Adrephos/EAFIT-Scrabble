import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CombinarLetras combinar = new CombinarLetras();

        System.out.println("Ingrese las letras en su mano (todas juntas)");
        String Mano = input.next();
        String[] palabras = combinar.combine(Mano, new StringBuffer(), 0, 0);
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null){
                System.out.println(palabras[i]);
            }
        }
        input.close();
    }
}
