public class CombinarLetras {

    String[] posiblesPalabras = new String[10];
    /**
    * Combina las letras dadas para generar palabras 
    * y las busca en el diccionario para saber si son válidas,
    * si es válida la gguarda en un array.
    *
    * @param    instr   cadena que se quiere combinarLetras
    * @param    outstr  objeto de tipo StringBuffer para modificarlo
    * @param    index   Indice de la palbra inicial
    * @param    arr     Indice del array
    * @return           El array de las palabras válidas
    */
    public String[] combine(String instr, StringBuffer outstr, int index, int arr)
    {
        LeerDiccionario leer = new LeerDiccionario();
        for (int i = index; i < instr.length(); i++)
        {
            outstr.append(instr.charAt(i));
            String buscar = outstr.toString();
            if (leer.buscarPalabra(buscar) == true && arr < 10) {
                posiblesPalabras[arr] = outstr.toString();
            }
            combine(instr, outstr, i + 1, arr + 1);
            outstr.deleteCharAt(outstr.length() - 1);
        }
        return posiblesPalabras;
    } 
}
