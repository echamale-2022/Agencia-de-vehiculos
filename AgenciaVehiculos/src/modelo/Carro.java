package modelo;
/**
 * 
 * @author Edwar
 */
public class Carro extends Vehiculo implements InterfazAgencia{
    int cantidad;
    String ejes;
    String cilindraje;
    String marca;
    String modelo;
    String placa;
    double precio;

    public Carro(String marca, String modelo, String placa, int cantidad, String ejes, String cilindraje, double precio) {
        this.cantidad = cantidad;
        this.ejes = ejes;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String marca(String marca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String modelo(String modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String placa(String placac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double precio(double precio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int CantidadLllantas(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String cantidadEjes(String ejes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String cilindraje(String cilindraje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

 



    

