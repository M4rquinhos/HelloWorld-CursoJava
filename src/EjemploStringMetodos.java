public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Marco";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Marco\") = " + nombre.equals("Marco"));
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("MArcO"));
        System.out.println("nombre.compareTo(\"Marco\") = " + nombre.compareTo("Marco"));
        System.out.println("nombre.compareTo(\"Manuel\") = " + nombre.compareTo("Manuel"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.substring() = " + nombre.substring(2));
        System.out.println("nombre.substring() = " + nombre.substring(1, 4));

        String trabalengua = "Trabalengua";
        System.out.println("trabalengua.replace(\"r\", \"l\") = " + trabalengua.replace("r", "l"));
        System.out.println("trabalengua.indexOf(\"len\") = " + trabalengua.indexOf("len"));
        System.out.println("trabalengua.lastIndexOf(\"u\") = " + trabalengua.lastIndexOf("u"));
        System.out.println("trabalengua.contains(\"b\") = " + trabalengua.contains("b"));
        System.out.println("trabalengua.startsWith(\"g\") = " + trabalengua.startsWith("g"));
        System.out.println("trabalengua.endsWith(\"gua\") = " + trabalengua.endsWith("gua"));
        System.out.println("trabalengua.trim() = " + trabalengua.trim());
    }
}
