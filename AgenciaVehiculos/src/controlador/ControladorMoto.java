package controlador;
import modelo.Moto;
import vista.MenuPrincipal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class ControladorMoto {
    Scanner sc = new Scanner(System.in);
    ObtenerDatos oDatos = new ObtenerDatos();
    public static ArrayList<Moto> arregloMoto = new ArrayList<>();
    String opcion;
    int contador = 0;
    
    public void ingresoMoto(String marca, String modelo, String placa, int cantidad, String ejes, String cilindraje, double precio){
    arregloMoto.add(new Moto(marca,modelo,placa,cantidad,ejes,cilindraje,precio));
    }
    public void modificarMoto(){
    for(int i = 0; i < arregloMoto.size(); i++){
        System.out.println("******************");
        System.out.println("* Modificar Moto *");
        System.out.println("******************");
        System.out.println("¿Qué es lo que desea modificar?");
        System.out.println("(marca/modelo/placa/llantas/ejes/cilindraje/precio)");
        opcion = sc.next();
            if(opcion.equalsIgnoreCase("marca")){
                System.out.println("Ingrese la nueva marca de la moto");
                String marca = oDatos.marca();
                arregloMoto.get(i).setMarca(marca);
                System.out.println("Modificación exitosa!");
                break;
            } else if(opcion.equalsIgnoreCase("modelo")){
                System.out.println("Ingrese el nuevo modelo de la moto");
                String modelo = oDatos.modelo();
                arregloMoto.get(i).setModelo(modelo);
                System.out.println("Modificación exitosa!");
                break;
            } else if(opcion.equalsIgnoreCase("placa")){
                System.out.println("Ingrese la nueva placa de la moto");
                String placa = oDatos.placas();
                arregloMoto.get(i).setPlaca(placa);
                System.out.println("Modificación exitosa!");
                break;
            } else if(opcion.equalsIgnoreCase("llantas")){
                System.out.println("Ingrese la nueva cantidad de llantas de la moto");
                int cantidad = sc.nextInt();
                arregloMoto.get(i).setCantidad(cantidad);
                System.out.println("Modificación exitosa!");
                break;
            } else if(opcion.equalsIgnoreCase("ejes")){
                System.out.println("Ingrese la nueva cantidad de ejes de la moto");
                String ejes = oDatos.cantidadEjes();
                arregloMoto.get(i).setEjes(ejes);
                System.out.println("Modificación exitosa!");
                break;
            } else if(opcion.equalsIgnoreCase("cilindraje")){
                System.out.println("Ingrese el nuevo cilindraje de la moto");
                String cilindraje = oDatos.cilindraje();
                arregloMoto.get(i).setCilindraje(cilindraje);
                System.out.println("Modificación exitosa!");
                break;
            } else if(opcion.equalsIgnoreCase("precio")){
                System.out.println("Ingrese el nuevo precio de la moto");
                double precio = sc.nextDouble();
                arregloMoto.get(i).setPrecio(precio);
                System.out.println("Modificación exitosa!");
                break;
            } else{
                System.out.println("No se encuentra lo que quiere modificar");
                break;
            }    
        }
    }
    public void eliminarMoto(String placa){
        MenuPrincipal mPrincipal = new MenuPrincipal();
        for(int i = 0; i < arregloMoto.size(); i++){
            if(placa.equalsIgnoreCase(arregloMoto.get(i).getPlaca())){
                System.out.println("Placa de la moto encontrada");
                System.out.println("¿Esta seguro de eliminar la moto?");
                opcion = sc.next();
                if(opcion.equalsIgnoreCase("no")){
                    System.out.println("De acuerdo sera mandado al menu principal");
                    mPrincipal.menuPrincipal();
                    break;
                } else{
                    arregloMoto.remove(i);
                    System.out.println("La moto se ha eliminado exitosamente!");
                    break;
                }
            } else{
                contador++;
            }
                if(contador == arregloMoto.size()){
                    System.out.println("No se encuentra la placa de la camioneta a eliminar");
                    break;
                }
        }
    }
    public void reporteMoto(){
    for(int i = 0; i < arregloMoto.size(); i++){
        System.out.println("****************************");
        System.out.println("* Reporte de motos general *");
        System.out.println("****************************");
        System.out.println("La marca de la moto es: " + arregloMoto.get(i).getMarca());
        System.out.println("El modelo de la moto es: " + arregloMoto.get(i).getModelo());
        System.out.println("La placa de la moto es: " + arregloMoto.get(i).getPlaca());
        System.out.println("La cantidad de llantas de la moto es: " + arregloMoto.get(i).getCantidad());
        System.out.println("La cantidad de ejes de la moto es: " + arregloMoto.get(i).getEjes());
        System.out.println("El cilindraje de la moto es: " + arregloMoto.get(i).getCilindraje());
        System.out.println("El precio de la moto es: " + arregloMoto.get(i).getPrecio());
    }
    }
    public void reporteIndividualMoto(String placa){
        for(int i = 0; i < arregloMoto.size(); i++){
            if(placa.equalsIgnoreCase(arregloMoto.get(i).getPlaca())){
                System.out.println("******************************");
                System.out.println("* Reporte de moto individual *");
                System.out.println("******************************");
                System.out.println("La marca de la moto es: " + arregloMoto.get(i).getMarca());
                System.out.println("El modelo de la moto es: " + arregloMoto.get(i).getModelo());
                System.out.println("La placa de la moto es: " + arregloMoto.get(i).getPlaca());
                System.out.println("La cantidad de llantas de la moto es: " + arregloMoto.get(i).getCantidad());
                System.out.println("La cantidad de ejes de la moto es: " + arregloMoto.get(i).getEjes());
                System.out.println("El cilindraje de la moto es: " + arregloMoto.get(i).getCilindraje());
                System.out.println("El precio de la moto es: " + arregloMoto.get(i).getPrecio());
                break;
            } else{
                contador++;
            }
                if(contador==arregloMoto.size()){
                    System.out.println("No se encuentra la placa del carro");
                    break;
                }
        }
    }
}
