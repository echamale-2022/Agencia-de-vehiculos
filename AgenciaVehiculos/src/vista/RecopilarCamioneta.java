package vista;
import controlador.ObtenerDatos;
import controlador.ControladorCamioneta;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class RecopilarCamioneta {
    Scanner sc = new Scanner(System.in);
    ControladorCamioneta cCamioneta = new ControladorCamioneta();
    ObtenerDatos oDatos = new ObtenerDatos();
    String opcion;
    public void ingresoCamioneta(){
        do{
            System.out.println("*********************");
            System.out.println("* Ingreso Camioneta *");
            System.out.println("*********************");
            System.out.print("Ingrese la marca de la camioneta: ");
            String marca = oDatos.marca();
            System.out.print("Ingrese el modelo de la camioneta: ");
            String modelo = oDatos.modelo();
            System.out.print("Ingrese la placa de la camioneta: ");
            String placa = oDatos.placas();
            System.out.print("Ingrese la cantidad de llantas de la camioneta: ");
            int cantidad = sc.nextInt();
            System.out.print("Ingrese la cantidad de ejes de la camioneta: ");
            String ejes = oDatos.cantidadEjes();
            System.out.print("Ingrese el cilindraje de la camioneta: ");
            String cilindraje = oDatos.cilindraje();
            System.out.print("Ingrese el precio de la camioneta: ");
            double precio = sc.nextDouble();
            cCamioneta.ingresoCamioneta(marca, modelo, placa, cantidad, ejes, cilindraje, precio);
            System.out.println("¿Desea agregar otra camioneta?   (si/no)");
            opcion = sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void modificarCamioneta(){
        cCamioneta.modificarCamioneta();
    }
    public void eliminarCamioneta(){
        System.out.println("**********************");
        System.out.println("* Eliminar Camioneta *");
        System.out.println("**********************");
        System.out.print("Ingrese la placa de la camioneta que desea eliminar: ");
        String placa = oDatos.placas();
        cCamioneta.eliminarCamioneta(placa);
    }
    public void reporteCamioneta(){
        cCamioneta.reporteCamioneta();
    }
    public void reporteCamionetaIndividual(){
        System.out.print("Ingrese la placa de la camioneta que desea buscar: ");
        String placa = oDatos.placas();
        cCamioneta.reporteCamionetaIndividual(placa);
    }
}
