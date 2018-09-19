import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.File;

public class DemoBanco
{

	public static void main(String[] args) throws IOException,	ClassNotFoundException
	{
		Banco unBanco;

		File f = new File("banco.dat");
		if (f.exists())
		{
			// si el fichero existe leer el flujo de datos serializado al objeto unBanco
			 
			
			
		} 
		else
		{
			// crear un objeto Banco y añadir un par de cuentas
			 
			
			
		}

		// ingresar dinero en las dos cuentas (primero buscas las cuentas por el id y luego añades 
		// el importe)
		// muestra los datos de las cuentas
		// serializa el banco
		
		
		
		
	}

}
