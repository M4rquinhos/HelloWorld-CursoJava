import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERROR. Ingrese un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = Integer.parseInt(Integer.toBinaryString(numeroDecimal));
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = Integer.parseInt(Integer.toOctalString(numeroDecimal));
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        int numeroHexadecimal = Integer.parseInt(Integer.toHexString(numeroDecimal));
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
