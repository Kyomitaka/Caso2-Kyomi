/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg2;

/**
 *
 * @author Aulas Heredia
 */
public class Habitaciones {
//Aqui declaro las variables

    public String tipo;
    public int numero;
    public int precio_noche;
    public String estado;

//Aqui inserto los getter and setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(int precio_noche) {
        this.precio_noche = precio_noche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String reservacion() {
        return (tipo + numero + precio_noche + estado);
    }

}
