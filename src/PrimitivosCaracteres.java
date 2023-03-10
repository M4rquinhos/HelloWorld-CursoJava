public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("¿ caracter = decimal ?: " + (caracter == decimal));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("¿ caracter = simbolo ?: " + (caracter == simbolo));

        char espacio = '\u0020';
        char retroceso = '\b'; //borrar
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; //enter/ nueva linea xd
        /*
        System.getProperty("Line.separator");
        System.lineSeparator();
         */

        System.out.println("Tipo char corresponde en byte a:" +  espacio + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
    }
}
