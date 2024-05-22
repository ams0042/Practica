/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocpractica;

/**
 * Clase que representa un producto
 * @author carlos
 * @version 1
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto() {
    }

/**
 * constructor con 3 parámetros
 * @param nombre NOmbre del producto
 * @param precio precio de el producto
 * @param cantidad cantidad de este producto en stock
 */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    /**
     * aplica un descuento sobre el precio
     * @param numero numero a introducir por el usuario
     */
    //El descuento que se pasa como parámetro, es un valor entre 0 y 1.
    public void aplicarDescuento (int numero){
        if(numero<=1 && numero>0){
        this.precio=this.precio*numero;
        System.out.println("el descuento ha sido aplicado con exito");
    }
    
    else{
            System.out.println("no se puede aplicar un descuento negativo o mayor que 1");
            
}
    }
    /**metodo que modifica la cantidad de un producto 
     * 
     * @param aumento cantidad a modificar 
     */
    /*En este método, se le pasa un valor numérico como parámetro y un booleano. Si el booleano es true
    /se aumenta la cantidad del producto, en caso contrario, se reduce*/
    public void modificarCantidad(int aumento){
        if(aumento>0){
            this.cantidad=cantidad+aumento;
            System.out.println("la cantidad ha sido aumentada");
        }
        else{
            this.cantidad=cantidad+(aumento);
            System.out.println("la cantidad se ha reducido");
        }
    }
    /**
     * metodo que nos da la descripccion y caracteristicas de un objeto de la clase
     * @return  cadena con el valor de las propiedades del objeto
     */

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
}
