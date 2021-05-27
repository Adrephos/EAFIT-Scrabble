public class Jugador {
    private String nombre;
    private String mano;
    private int puntosTotales = 0;
    private String[] palabras;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMano(String mano) {
        this.mano = mano;
    }

    public String getMano() {
        return mano;
    }

    public void setPuntos(int puntosTotales) {
        this.puntosTotales += puntosTotales;
    }
    
    public int getPuntos() {
        return puntosTotales;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public String[] getPalabras() {
        return palabras;
    }


    /** 
     * Llama a la clase CombinarLetras y le pasa las las letras
     * de la mano del jugador
     */
    public void combinarPalabras(){
        CombinarLetras combinar = new CombinarLetras();
        setPalabras(combinar.combine(getMano(), new StringBuffer(), 0, 0));
    }

    /**
     * Imprime las palabras que el Jugador puede usar
     * en el juago basado en las letras que tiene en su mano
     */
    public void imprimirPalabras(){
        ScrabblePuntos puntosPalabra = null;
        System.out.println("Las palabras que puede usar con su mano son: ");
        for (int i = 0; i < getPalabras().length; i++) {
            if (getPalabras()[i] != null){
                puntosPalabra = new ScrabblePuntos(getPalabras()[i]);
                System.out.println(getPalabras()[i] + " - " + puntosPalabra.getPuntos() + " puntos");
            }
        }
    }

}
