public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {

        String file = "alguna_bendita_imagen.jpg";
        String ext;

        ext = file.substring(file.lastIndexOf("."));
        System.out.println("ext = " + ext);

    }
}
