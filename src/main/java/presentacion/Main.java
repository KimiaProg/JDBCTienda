package presentacion;

import java.sql.SQLException;
import java.util.Scanner;
import negocio.vo.Usuario;

public class Main {

	public static void main(String[] args) throws SQLException {

		signIn();
		
	}

	private static void signUp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sign up");
		System.out.println("Introduce tu username: ");
		String username = sc.next();
		System.out.println("Introduce tu password: ");
		String password = sc.next();
		Usuario usu1 = new Usuario(username, password);
	}

	private static void signIn() {
		Scanner sc = new Scanner(System.in);
		boolean correcto = true;
		do {
			System.out.println("Sign in");
			System.out.println("Introduce tu username: ");
			String username = sc.next();
			System.out.println("Introduce tu password: ");
			String password = sc.next();
			if (username.equals("Kimia") && password.equals("123")) {
				System.out.println("Validados y Entrado");
			} else {
				System.out.println("Incorrecto");
				correcto = false;
			}
		} while (correcto == false);
	}

}
