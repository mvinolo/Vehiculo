
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMVF2223 miVehiculo;
        
        
        miVehiculo = new VehiculoMVF2223("Seat",18000,100);
        operativaVehiculosMVF2223(miVehiculo); 
        
    }

    public static void operativaVehiculosMVF2223(VehiculoMVF2223 miVehiculo) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
