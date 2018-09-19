 
import java.util.ArrayList;

/**
   Contiene una colecci�n de cuentas del banco
   Los objetos de esta clase ser�n serializables
*/
public class Banco  
{   
   private ArrayList<CuentaBancaria> cuentas;

   /**
      Constructor
   */
   public Banco()
   {
      cuentas = new ArrayList<CuentaBancaria>();
   }

   /**
     a�adir una cuenta al banco
      @param c la cuenta a a�adir
   */
   public void addCuenta(CuentaBancaria c)
   {
      cuentas.add(c);
   }
   
   /**
      Buscar una cuenta con un n� dado
      @param numeroCuenta el n� de cuenta a buscar
      @return la cuenta si est� o null si no est�
     
   */
   public CuentaBancaria buscar(int numeroCuenta)
   {
      for (CuentaBancaria c : cuentas)
      {
         if (c.getNumeroCuenta() == numeroCuenta) // encontrada
         {
            return c;
         }
      } 
      return null; // no se ha encontrado
   }
}
