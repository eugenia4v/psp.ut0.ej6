 
import java.util.ArrayList;

/**
   Contiene una colección de cuentas del banco
   Los objetos de esta clase serán serializables
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
     añadir una cuenta al banco
      @param c la cuenta a añadir
   */
   public void addCuenta(CuentaBancaria c)
   {
      cuentas.add(c);
   }
   
   /**
      Buscar una cuenta con un nº dado
      @param numeroCuenta el nº de cuenta a buscar
      @return la cuenta si está o null si no está
     
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
