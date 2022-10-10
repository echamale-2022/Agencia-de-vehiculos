package controlador;
/**
 * 
 * @author Edwar
 */
public class ControladorLoginErrores {
    public void verificarCredenciales(String usuario,String user, String clave, String contra) throws ExcepcionesPersonalizada{
    for(int a = 0; a <user.length(); a++){
        if('#' == user.charAt(a)){
            throw new ExcepcionesPersonalizada("No se encuentra el @!!!!");
        }
    }
    if(!user.equals(usuario)){
        throw new ExcepcionesPersonalizada("Usuario incorrecto");
    }
    if(!contra.equals(clave)){
        throw new ExcepcionesPersonalizada("Clave incorrecta");
    }

}
}