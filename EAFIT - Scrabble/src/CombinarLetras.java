public class CombinarLetras {

    String[] posiblesPalabras = new String[10];

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
