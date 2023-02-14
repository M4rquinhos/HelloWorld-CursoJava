public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb =  new StringBuilder(a);

        long inicio =  System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            c = c.concat(a).concat(b).concat("\n"); // 500 => 4ms, 1000 => 7ms, 10000 => 137ms
            //c += a + b + "\n"; // 500 => 23 ms, 1000 => 27ms, 10000 => 96ms
            //sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 1ms, 10000 => 3ms

        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
