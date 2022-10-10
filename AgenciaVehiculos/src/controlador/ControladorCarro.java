package controlador;
import java.util.ArrayList;
import vista.MenuPrincipal;
import modelo.Carro;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class ControladorCarro{
    Scanner sc = new Scanner(System.in);
    ObtenerDatos oDatos = new ObtenerDatos();
    public static ArrayList<Carro> arregloCarro = new ArrayList<>();
    String opcion;
    int contador = 0;
    
    public void ingresoCarro(String marca, String modelo, String placa, int cantidad, String ejes, String cilindraje, double precio){
    arregloCarro.add(new Carro(marca,modelo,placa,cantidad,ejes,cilindraje,precio));
    }
    public void modificarCarro(){
        for(int i = 0; i < arregloCarro.size(); i++){
            System.out.println("*******************");
            System.out.println("* Modificar Carro *");
            System.out.println("*******************");
            System.out.println("¿Qué es lo que desea modificar?");
            System.out.println("(marca/modelo/placa/llantas/ejes/cilindraje/precio)");
            opcion = sc.next();
                if(opcion.equalsIgnoreCase("marca")){
                    System.out.println("Ingrese la nueva marca del carro");
                    String marca = oDatos.marca();
                    arregloCarro.get(i).setMarca(marca);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("modelo")){
                    System.out.println("Ingrese el nuevo modelo del carro");
                    String modelo = oDatos.modelo();
                    arregloCarro.get(i).setModelo(modelo);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("placa")){
                    System.out.println("Ingrese la nueva placa del carro");
                    String placa = oDatos.placas();
                    arregloCarro.get(i).setPlaca(placa);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("llantas")){
                    System.out.println("Ingrese la nueva cantidad de llantas del carro");
                    int cantidad = sc.nextInt();
                    arregloCarro.get(i).setCantidad(cantidad);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("ejes")){
                    System.out.println("Ingrese la nueva la nueva cantidad de ejes del carro");
                    String ejes = oDatos.cantidadEjes();
                    arregloCarro.get(i).setEjes(ejes);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("cilindraje")){
                    System.out.println("Ingrese el nuevo cilindraje del carro");
                    String cilindraje = oDatos.cilindraje();
                    arregloCarro.get(i).setCilindraje(cilindraje);
                    System.out.println("Modificación exitosa");
                    break;
                } else if(opcion.equalsIgnoreCase("precio")){
                    System.out.println("Ingrese el nuevo precio del carro");
                    double precio = sc.nextDouble();
                    arregloCarro.get(i).setPrecio(precio);
                    System.out.println("Modificación exitosa!");
                    break;
                } else{
                    System.out.println("No se encuentra lo que desea modificar");
                    break;
                }
        }
    }
    public void eliminarCarro(String placa){
        MenuPrincipal mPrincipal = new MenuPrincipal();
        for(int i = 0; i < arregloCarro.size(); i++){
            if(placa.equalsIgnoreCase(arregloCarro.get(i).getPlaca())){
                System.out.println("Placa del carro encontrada");
                System.out.println("¿Esta seguro de eliminar el carro?");
                opcion = sc.next();
                    if(opcion.equalsIgnoreCase("no")){
                        System.out.println("De acuerdo sera mandado al menu inicial");
                        mPrincipal.menuPrincipal();
                        break;
                    } else{
                        arregloCarro.remove(i);
                        System.out.println("El carro se ha eliminado exitosamente!");
                        break;
                    }
            } else{
                contador ++;
            }
                if(contador == arregloCarro.size()){
                    System.out.println("No se encuentra la placa del carro a eliminar");
                    break;
                }
        }
    }
    public void reporteCarro(){
        for(int i = 0; i < arregloCarro.size(); i++){
            System.out.println("*****************************");
            System.out.println("* Reporte de carros general *");
            System.out.println("*****************************");
            System.out.println("La marca del carro es: " + arregloCarro.get(i).getMarca());
            System.out.println("El modelo  del carro es: " + arregloCarro.get(i).getModelo());
            System.out.println("La placa del carro es: " + arregloCarro.get(i).getPlaca());
            System.out.println("La cantidad de llantas que posee es: " + arregloCarro.get(i).getCantidad());
            System.out.println("La cantidad de ejes del carro es: " + arregloCarro.get(i).getEjes());
            System.out.println("El cilindraje del carro es: " + arregloCarro.get(i).getCilindraje());
            System.out.println("El precio del carro es: " + arregloCarro.get(i).getPrecio());
        }
    }
    public void reporteCarroIndividual(String placa){
        for(int i = 0; i < arregloCarro.size(); i++){
            if(placa.equalsIgnoreCase(arregloCarro.get(i).getPlaca())){
                System.out.println("*******************************");
                System.out.println("* Reporte individual de carro *");
                System.out.println("*******************************");
                System.out.println("La marca del carro es: " + arregloCarro.get(i).getMarca());
                System.out.println("El modelo  del carro es: " + arregloCarro.get(i).getModelo());
                System.out.println("La placa del carro es: " + arregloCarro.get(i).getPlaca());
                System.out.println("La cantidad de llantas que posee es: " + arregloCarro.get(i).getCantidad());
                System.out.println("La cantidad de ejes del carro es: " + arregloCarro.get(i).getEjes());
                System.out.println("El cilindraje del carro es: " + arregloCarro.get(i).getCilindraje());
                System.out.println("El precio del carro es: " + arregloCarro.get(i).getPrecio());
                break;
            } else{
                contador++;
            }
                if(contador==arregloCarro.size()){
                    System.out.println("No se encuentra la placa del carro");
                }
        }
    }
}
