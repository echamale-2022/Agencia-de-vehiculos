package vista;
import controlador.ObtenerDatos;
import controlador.ControladorCarro;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class RecopilarCarro {
    Scanner sc = new Scanner(System.in);
    ControladorCarro cCarro = new ControladorCarro();
    ObtenerDatos oDatos = new ObtenerDatos();
    String opcion;
    public void ingresoCarro(){
        do{
            System.out.println("*****************");
            System.out.println("* Ingreso Carro *");
            System.out.println("*****************");
            System.out.print("Ingrese la marca del carro: ");
            String marca = oDatos.marca();
            System.out.print("Ingrese el modelo del carro: ");
            String modelo = oDatos.modelo();
            System.out.print("Ingrese la placa del carro: ");
            String placa = oDatos.placas();
            System.out.print("Ingrese la cantidad de llantas del carro: ");
            int cantidad = sc.nextInt();
            System.out.print("Ingrese la cantidad de ejes del carro: ");
            String ejes = oDatos.cantidadEjes();
            System.out.print("Ingrese el cilindraje del carro: ");
            String cilindraje = oDatos.cilindraje();
            System.out.print("Ingrese el precio del carro: ");
            double precio = sc.nextDouble();
            cCarro.ingresoCarro(marca, modelo, placa, cantidad, ejes, cilindraje, precio);
            System.out.println("¿Desea agregar otro carro?   (si/no)");
            opcion = sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void modificarCarro(){
        cCarro.modificarCarro();
    }
    public void eliminarCarro(){
        System.out.println("******************");
        System.out.println("* Eliminar Carro *");
        System.out.println("******************");
        System.out.print("Ingrese la placa del carro que desea eliminar: ");
        String placa = oDatos.placas();
        cCarro.eliminarCarro(placa);
    }
    public void reporteCarro(){
        cCarro.reporteCarro();
    }
    public void reporteIndividual(){
        System.out.println("Ingrese la placa del carro que desea buscar: ");
        String placa = oDatos.placas();
        cCarro.reporteCarroIndividual(placa);
    }
}
