public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Mi padrino el diablo";

        String detalle = curso + " impartido por: " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB); //concatena, pero no hace la suma
        System.out.println(detalle + " " + (numeroA + numeroB)); //resuelve la suma, y la concatena al final de la oración
        System.out.println(numeroA + numeroB + detalle);//resuelve la suma y después agrega la oración

        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
