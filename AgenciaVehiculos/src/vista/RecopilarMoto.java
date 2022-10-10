package vista;
import controlador.ObtenerDatos;
import controlador.ControladorMoto;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class RecopilarMoto {
    Scanner sc = new Scanner(System.in);
    ControladorMoto cMoto = new ControladorMoto();
    ObtenerDatos oDatos = new ObtenerDatos();
    String opcion;
    public void ingresoMoto(){
        do{
            System.out.println("****************");
            System.out.println("* Ingreso Moto *");
            System.out.println("****************");
            System.out.print("Ingrese la marca de la moto: ");
            String marca = oDatos.marca();
            System.out.print("Ingrese el modelo de la moto: ");
            String modelo = oDatos.modelo();
            System.out.print("Ingrese la placa de la moto: ");
            String placa = oDatos.placas();
            System.out.print("Ingrese la cantidad de llantas de la moto: ");
            int cantidad = sc.nextInt();
            System.out.print("Ingrese la cantidad de ejes de la moto: ");
            String ejes = oDatos.cantidadEjes();
            System.out.print("Ingrese el cilindraje de la moto: ");
            String cilindraje = oDatos.cilindraje();
            System.out.print("Ingrese el precio de la moto");
            double precio = sc.nextDouble();
            cMoto.ingresoMoto(marca, modelo, placa, cantidad, ejes, cilindraje, precio);
            System.out.println("¿Desea agregar otra moto?   (si/no)");
            opcion = sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void modificarMoto(){
        cMoto.modificarMoto();
    }
    public void eliminarMoto(){
        System.out.println("*****************");
        System.out.println("* Eliminar Moto *");
        System.out.println("*****************");
        System.out.print("Ingrese la placa de la moto que desea eliminar: ");
        String placa=oDatos.placas();
        cMoto.eliminarMoto(placa);
    }
    public void reporteMoto(){
        cMoto.reporteMoto();
    }
    public void reporteMotoIndividual(){
        System.out.print("Ingrese la placa de la moto: ");
        String placa = oDatos.placas();
        cMoto.reporteIndividualMoto(placa);
    }
}
