package vista;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class MenuAdmin {
    Scanner sc = new Scanner(System.in);
    RecopilarCarro rCarro = new RecopilarCarro();
    RecopilarCamioneta rCamioneta = new RecopilarCamioneta();
    MenuPrincipal mPrincipal = new MenuPrincipal();
    RecopilarMoto rMoto = new RecopilarMoto();
    
    public void ingresoVehiculos(){
        System.out.println("*********************");
        System.out.println("* Ingreso vehiculos *");
        System.out.println("*********************");
        System.out.println("1.- Ingreso Carro");
        System.out.println("2.- Ingreso Camioneta");
        System.out.println("3.- Ingreso Moto");
        System.out.println("4.- Regresar al menu Principal");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1://ingreso carro 
                    rCarro.ingresoCarro();
                    this.ingresoVehiculos();
                    break;
                case 2://ingreso camioneta
                    rCamioneta.ingresoCamioneta();
                    this.ingresoVehiculos();
                    break;
                case 3://ingreso moto
                    rMoto.ingresoMoto();
                    this.ingresoVehiculos();
                    break;
                case 4://regresar al menu principal
                    mPrincipal.menuPrincipal();
                default://opcion invalidad
                    System.out.println("Opción no validad");
            }//fin de switch ingreso
    }
    public void modificarVehiculos(){
        System.out.println("***********************");
        System.out.println("* Modificar Vehiculos *");
        System.out.println("***********************");
        System.out.println("1.- Modificar Carro");
        System.out.println("2.- Modificar Camioneta");
        System.out.println("3.- Modificar Moto");
        System.out.println("4.- Regresar al menu Principal");
        System.out.println("Elija la opción que desea");
        int opc=sc.nextInt();
            switch(opc){
                case 1://modificar carro
                    rCarro.modificarCarro();
                    this.modificarVehiculos();
                    break;
                case 2://modificar camioneta
                    rCamioneta.modificarCamioneta();
                    this.modificarVehiculos();
                    break;
                case 3://modificar moto
                    rMoto.modificarMoto();
                    this.modificarVehiculos();
                    break;
                case 4://regresar al menu principal
                    mPrincipal.menuPrincipal();
                default://opcion invalidad
                    System.out.println("Opcion invalidad");
            }
    }
    public void eliminarVehiculos(){
        System.out.println("**********************");
        System.out.println("* Eliminar Vehiculos *");
        System.out.println("**********************");
        System.out.println("1.- Eliminar Carro");
        System.out.println("2.- Eliminar Camioneta");
        System.out.println("3.- Eliminar Moto");
        System.out.println("4.- Regresar al menu Principal");
        System.out.println("Elija la opcion que desea");
        int opc=sc.nextInt();
            switch(opc){
                case 1://eliminar carro
                    rCarro.eliminarCarro();
                   this.eliminarVehiculos();
                    break;
                case 2://eliminar vehiculo
                    rCamioneta.eliminarCamioneta();
                    this.eliminarVehiculos();
                    break;
                case 3://eliminar moto
                    rMoto.eliminarMoto();
                    this.eliminarVehiculos();
                    break;
                case 4://regresar al menu principal
                    mPrincipal.menuPrincipal();
                default://opcion no validad
                    System.out.println("Opcion no validad");
            }
    }
    public void reporteGeneralVehiculos(){
        System.out.println("*********************");
        System.out.println("* Reporte Vehiculos *");
        System.out.println("*********************");
        System.out.println("1.- Reporte de Carros general");
        System.out.println("2.- Reporte de Camionetas general");
        System.out.println("3.- Reporte de Motos general");
        System.out.println("4.- Regresar al menu Principal");
        System.out.println("Elija la opcion que desea");
        int opc=sc.nextInt();
            switch(opc){
                case 1://reporte de carros general
                    rCarro.reporteCarro();
                    this.reporteGeneralVehiculos();
                    break;
                case 2://reporte de camionetas general
                    rCamioneta.reporteCamioneta();
                    this.reporteGeneralVehiculos();
                    break;
                case 3://reporte de motos general
                    rMoto.reporteMoto();
                    this.reporteGeneralVehiculos();
                    break;
                case 4://regresar al menu principal
                    mPrincipal.menuPrincipal();
                default://opcion no validad
                    System.out.println("Opcion invalidad");
            }
    }
    public void reporteIndividualVehiculos(){
        System.out.println("***********************************");
        System.out.println("* Reporte individual de Vehiculos *");
        System.out.println("***********************************");
        System.out.println("1.- Reporte individual de carro");
        System.out.println("2.- Reporte individual de camioneta");
        System.out.println("3.- Reporte individual de moto");
        System.out.println("4.- Regresar al menu Principal");
        System.out.println("Elija la opcion que desea");
        int opc=sc.nextInt();
            switch(opc){
                case  1://reporte individual de carro
                    rCarro.reporteIndividual();
                    this.reporteIndividualVehiculos();
                    break;
                case 2://reporte individual de camioneta
                    rCamioneta.reporteCamionetaIndividual();
                    this.reporteIndividualVehiculos();
                    break;
                case 3://reporte individual de moto
                    rMoto.reporteMotoIndividual();
                    this.reporteIndividualVehiculos();
                    break;
                case 4://regresar al menu principal
                    mPrincipal.menuPrincipal();
                default://opcion no validad
                    System.out.println("Opcion no validad");
            }
    }
}
