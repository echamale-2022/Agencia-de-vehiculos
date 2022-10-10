package vista;
import controlador.ControladorLoginErrores;
import controlador.ExcepcionesPersonalizada;
import java.util.Scanner;
/**
 * 
 * @author Edwar
 */
public class RegistroUsuario {
    Scanner sc = new Scanner(System.in);
    public void verificador(){
    ControladorLoginErrores cErrores = new ControladorLoginErrores();
    MenuPrincipal mPrincipal = new MenuPrincipal();
        System.out.println("****************");
        System.out.println("*Iniciar Sesión*");
        System.out.println("****************");
        System.out.println("Correo: admin@gmail.com");
        System.out.println("Clave: 123");
        String usuario = "admin@gmail.com";
        String clave = "123";
        System.out.println("Ingrese su usuario");
        String user = sc.next();
        System.out.println("Ingrese su clave");
        String contra = sc.next();
            try{
                cErrores.verificarCredenciales(usuario, user, clave, contra);
            }catch(ExcepcionesPersonalizada ep){
                System.out.println(ep.getMessage());
                System.exit(0);
            }
        mPrincipal.menuPrincipal();
    }
}