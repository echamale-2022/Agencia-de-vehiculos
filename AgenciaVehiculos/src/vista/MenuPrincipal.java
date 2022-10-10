package vista;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class MenuPrincipal {
    Scanner sc = new Scanner(System.in);
    public void menuPrincipal(){
        MenuAdmin mAdmin = new MenuAdmin();
        RegistroUsuario rUsuario = new RegistroUsuario(); 
        System.out.println("*************************************");
        System.out.println("-- Agencia el informatico mecanico --");
        System.out.println("*************************************");
        System.out.println("    -.Administrador.-                 ");
        System.out.println("1.- Ingreso vehiculos");
        System.out.println("2.- Modificar vehiculos");
        System.out.println("3.- Eliminar vehiculos");
        System.out.println("4.- Reporte general de vehiculos");
        System.out.println("5.- Reporte individual de vehiculos");
        System.out.println("6.- Cerrar Sesion");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1://ingreso de vehiculos
                    mAdmin.ingresoVehiculos();
                    break;    
                case 2://modificacion de vehiculos
                    mAdmin.modificarVehiculos();
                    break;
                case 3://eliminar vehiculos
                    mAdmin.eliminarVehiculos();
                    break;
                case 4://reporte general de vehiculos
                    mAdmin.reporteGeneralVehiculos();
                    break;
                case 5://reporte individual de vehiculos
                    mAdmin.reporteIndividualVehiculos();
                    break;
                case 6://regresar al registro usuario
                    System.out.println("Cerrando sesión....");
                    System.out.println("Sesión cerrada con exito");
                    rUsuario.verificador();
                default://opcion no validad
                    System.out.println("Opcion no validad");
            }
    }
}
