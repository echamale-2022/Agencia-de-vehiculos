package controlador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * 
 * @author Edwar
 */
public class ObtenerDatos {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public String marca(){
    String marca = null;
        try{
            marca = bf.readLine();
        }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
        }
        return marca;
    }
    public String modelo(){
    String modelo = null;
        try{
            modelo = bf.readLine();
        }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
        }
        return modelo;
    }
    public String placas(){
    String placas = null;
        try{
            placas = bf.readLine();
        }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
        }
        return placas;
    }
    public String cantidadEjes(){
    String cantidadEjes = null;
        try{
            cantidadEjes = bf.readLine();
        }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
        }
        return cantidadEjes;
    }
    public String cilindraje(){
    String cilindraje = null;
        try{
            cilindraje = bf.readLine();
        }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
        }
        return cilindraje;
    }
}
