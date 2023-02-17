import java.util.Scanner;

public class OperadoresLogicosLogIn {
    public static void main(String[] args) {

        String nombreUsuario = "Marco";
        String pass = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String u = sc.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String p = sc.nextLine();

        boolean isAuth = nombreUsuario.equals(u) && pass.equals(p);

        if (isAuth){
            System.out.println("Bienvenido al sistema");
        }
        else {
            System.out.println("Nombre de usuario y/o contraseña incorrectos. Vuelve a intentarlo");
        }

    }
}
