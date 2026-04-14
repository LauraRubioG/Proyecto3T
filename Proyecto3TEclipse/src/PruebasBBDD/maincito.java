package PruebasBBDD;

import java.sql.SQLException;
import java.util.Scanner;

public class maincito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos el objeto de la clase para usarlo
		ConexionMySQL x = new ConexionMySQL("root","","dam");
		
		Scanner sr = new Scanner(System.in);
		
		//usamos el metodo conectar para conectar la base de datos
		//hay que meterlo siempre (ademas te lo pide) en un try y catch
		try {
			x.conectar();
			
			//variables para no tener que ir uno a uno
			String nombre;
			int edad;
			
			//pedimos por teclado los datos
			System.out.println("Dime un nombre");
			nombre = sr.next();
			System.out.println("Dime su edad");
			edad = sr.nextInt();
			
			
			//dentro de los parentesis le damos la sentencia para insertarla
			String sentencia = "INSERT INTO EMPLEADOS (NOMBRE, EDAD) VALUES ('"+nombre+"', "+edad+")";
			x.ejecutarInsertDeleteUpdate(sentencia);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//primero comprobar la conexion antes de seguir con el codigo

	}

}
