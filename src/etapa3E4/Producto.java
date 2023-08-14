/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa3E4;

/**
 *
 * @author HP
 */
public class Producto implements Comparable<Producto> {

    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria rublo;

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rublo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rublo = rublo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRublo() {
        return rublo;
    }

    public void setRublo(Categoria rublo) {
        this.rublo = rublo;
    }

    @Override
    public int compareTo(Producto o) {
        if (codigo == o.codigo) {

            return 0;
        } else if (codigo > o.codigo) {

            return 1;
        } else {

            return -1;
        }
    }

}
