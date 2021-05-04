package presentacion;

import java.util.Scanner;

import negocio.servicios.UserService;
import negocio.servicios.impl.UserServiceImpl;

public class Main {

	private static UserService  servicio= new UserServiceImpl(); 
	public static void main(String[] args)  {

		signIn();
		
	}


	private static void signIn() {
		Scanner sc = new Scanner(System.in);
		boolean correcto = true;
		int cont=0;
		do {
			cont++;
			System.out.println("<<Sign in>>");
			System.out.println("Introduce tu username: ");
			String username = sc.next();
			System.out.println("Introduce tu password: ");
			String password = sc.next();
			
			if (servicio.login(username, password)) {
				System.out.println("Bienvenido " + username);
				correcto=true;
			} else {
				System.out.println("La contraseña y el usuario no coinciden");
				correcto = false;
			}
		} while (correcto == false && cont<2);
	}

}
