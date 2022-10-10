package controlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Camioneta;
import vista.MenuPrincipal;
/**
 * 
 * @author Edwar
 */
public class ControladorCamioneta {
    Scanner sc = new Scanner(System.in);
    ObtenerDatos oDatos = new ObtenerDatos();
    public static ArrayList<Camioneta> arregloCamioneta = new ArrayList<>();
    String opcion;
    int contador = 0;
    public void ingresoCamioneta(String marca, String modelo, String placa, int cantidad, String ejes, String cilindraje, double precio){
    arregloCamioneta.add(new Camioneta(marca,modelo,placa,cantidad,ejes,cilindraje,precio));
    }
    public void modificarCamioneta(){
        for(int i = 0; i < arregloCamioneta.size(); i++){
            System.out.println("***********************");
            System.out.println("* Modificar Camioneta *");
            System.out.println("***********************");
            System.out.println("¿Qué es lo que desea modificar?");
            System.out.println("(marca/modelo/placa/llantas/ejes/cilindraje/precio)");
            opcion = sc.next();
                if(opcion.equalsIgnoreCase("marca")){
                    System.out.println("Ingrese la nueva marca de la camioneta");
                    String marca = oDatos.marca();
                    arregloCamioneta.get(i).setMarca(marca);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("modelo")){
                    System.out.println("Ingrese el nuevo modelo de la camioneta");
                    String modelo = oDatos.modelo();
                    arregloCamioneta.get(i).setModelo(modelo);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("placa")){
                    System.out.println("Ingrese la nueva placa de la camioneta");
                    String placa = oDatos.placas();
                    arregloCamioneta.get(i).setPlaca(placa);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("llantas")){
                    System.out.println("Ingrese la nueva cantidad de llantas de la camioneta");
                    int cantidad = sc.nextInt();
                    arregloCamioneta.get(i).setCantidad(cantidad);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("ejes")){
                    System.out.println("Ingrese la nueva la nueva cantidad de ejes del carro");
                    String ejes = oDatos.cantidadEjes();
                    arregloCamioneta.get(i).setEjes(ejes);
                    System.out.println("Modificación exitosa!");
                    break;
                } else if(opcion.equalsIgnoreCase("cilindraje")){
                    System.out.println("Ingrese el nuevo cilindraje de la camioneta");
                    String cilindraje = oDatos.cilindraje();
                    arregloCamioneta.get(i).setCilindraje(cilindraje);
                    System.out.println("Modificación exitosa");
                    break;
                } else if(opcion.equalsIgnoreCase("precio")){
                    System.out.println("Ingrese el nuevo precio de la camioneta");
                    double precio = sc.nextDouble();
                    arregloCamioneta.get(i).setPrecio(precio);
                    System.out.println("Modificación exitosa!");
                    break;
                } else{
                    System.out.println("No se encuentra lo que desea modificar");
                    break;
                }
        }
    }
    public void eliminarCamioneta(String placa){
        MenuPrincipal mPrincipal=new MenuPrincipal();
        for(int i = 0; i < arregloCamioneta.size(); i++){
            if(placa.equalsIgnoreCase(arregloCamioneta.get(i).getPlaca())){
                System.out.println("Placa de la camioneta encontrada");
                System.out.println("¿Esta seguro de eliminar la camioneta?");
                opcion = sc.next();
                    if(opcion.equalsIgnoreCase("no")){
                        System.out.println("De acuerdo sera mandado al menu principal");
                        mPrincipal.menuPrincipal();
                        break;
                    } else{
                        arregloCamioneta.remove(i);
                        System.out.println("La camioneta se ha eliminado exitosamente!");
                        break;
                    }
            } else{
            contador ++;
            }
                if(contador == arregloCamioneta.size()){
                    System.out.println("No se encuentra la placa de la camioneta a eliminar");
                    break;
                }
        }
    }
    public void reporteCamioneta(){
        for(int i = 0; i < arregloCamioneta.size(); i++){
            System.out.println("*********************************");
            System.out.println("* Reporte de camionetas general *");
            System.out.println("*********************************");
            System.out.println("La marca de la camioneta es: " + arregloCamioneta.get(i).getMarca());
            System.out.println("El modelo de la camioneta es: " + arregloCamioneta.get(i).getModelo());
            System.out.println("La placa de la camioneta es: " + arregloCamioneta.get(i).getPlaca());
            System.out.println("La cantidad de llantas que posee es: " + arregloCamioneta.get(i).getCantidad());
            System.out.println("La cantidad de ejes de la camioneta es: " + arregloCamioneta.get(i).getEjes());
            System.out.println("El cilindraje de la camioneta es: " + arregloCamioneta.get(i).getCilindraje());
            System.out.println("El precio de la camioneta es: " + arregloCamioneta.get(i).getPrecio());
        }
    }
    public void reporteCamionetaIndividual(String placa){
        for(int i = 0; i < arregloCamioneta.size(); i++){
            if(placa.equalsIgnoreCase(arregloCamioneta.get(i).getPlaca())){
                System.out.println("***********************************");
                System.out.println("* Reporte de camioneta individual *");
                System.out.println("***********************************");
                System.out.println("La marca de la camioneta es: " + arregloCamioneta.get(i).getMarca());
                System.out.println("El modelo de la camioneta es: " + arregloCamioneta.get(i).getModelo());
                System.out.println("La placa de la camioneta es: " + arregloCamioneta.get(i).getPlaca());
                System.out.println("La cantidad de llantas que posee es: " + arregloCamioneta.get(i).getCantidad());
                System.out.println("La cantidad de ejes de la camioneta es: " + arregloCamioneta.get(i).getEjes());
                System.out.println("El cilindraje de la camioneta es: " + arregloCamioneta.get(i).getCilindraje());
                System.out.println("El precio de la camioneta es: " + arregloCamioneta.get(i).getPrecio());
                break;
            } else{
                contador ++;
            }
                if(contador == arregloCamioneta.size()){
                    System.out.println("No se encuentra la placa del carro");
                    break;
                }
        }
    }    
}
