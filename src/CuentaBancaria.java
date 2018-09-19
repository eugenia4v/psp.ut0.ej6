 

/**
 * Una cuenta bancaria tiene un importe y
 * se pueden hacer reintegros e ingresos
 Los objetos de esta clase son serializables
*/
public class CuentaBancaria  
{  
   private int numero;
   private double importe;

   /**
      Constructor  
      @param elNumero el nº de cuenta
   */
   public CuentaBancaria(int elNumero)
   {   
      numero = elNumero;
      importe = 0;
   }

   /**
      Constructor
      @param elNumero nº de cuenta
      @param importeInicial  importe inciial de la cuenta
   */
   public CuentaBancaria(int elNumero, double importeInicial)
   {   
      numero = elNumero;
      importe = importeInicial;
   }

   /*el nº de cuentahe account number
   */
   public int getNumeroCuenta()
   {   
      return numero;
   }

   /**
     Ingreasr dinero en la cuenta
      @param cantidad  cantidad a ingresar
   */
   public void ingresar(double cantidad)
   {  
      double nuevoImporte = importe + cantidad;
      importe = nuevoImporte;
   }

   /**
      Sacar dinero de la cuenta
      @param cantidad the amount to withdraw
   */
   public void reintegrar(double cantidad)
   {   
      double nuevoImporte = importe - cantidad;
      importe = nuevoImporte;
   }

   /**
     accesor para el importe actual de la cuenta
      @return el importe
   */
   public double getBalance()
   {   
      return importe;
   }
   
    /**
    * representación textual de la cuenta
   */
   public String  toString()
   {   
      return "Num. Cuenta: " + getNumeroCuenta() + "\nImporte: " + getBalance();
   }
   
   
}