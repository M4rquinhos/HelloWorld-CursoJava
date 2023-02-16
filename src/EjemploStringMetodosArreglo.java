public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.toCharArray = " + trabalenguas.toCharArray());

        char[] arr = trabalenguas.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
