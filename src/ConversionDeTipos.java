public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("-------------------------------");

        String decimalStr = "98765.43";
        double realDouble = Double.parseDouble(decimalStr);
        System.out.println("realDouble = " + realDouble);

        System.out.println("-------------------------------");

        String logicoStr = "true";
        boolean realLogico = Boolean.parseBoolean(logicoStr);
        System.out.println("realLogico = " + realLogico);
    }
}
