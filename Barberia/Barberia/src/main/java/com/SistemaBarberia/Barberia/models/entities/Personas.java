
package com.SistemaBarberia.Barberia.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="personas")
@Access(AccessType.FIELD)
public class Personas  {
 
    @Id
    private String dui;
    @Column(name ="DUI",nullable=false ,length =20)
    @NotEmpty() 
    private String nombre;
    @Column(name ="nombre",nullable=false ,length =50)
    @NotEmpty() 
    private String apellido;
     @Column(name ="apellido",nullable=false ,length =50)
     @NotEmpty() 
    private String telefono;
     @Column(name ="telefono",nullable=true ,length =20)
    private String celular;
     @Column(name ="celular",nullable=true ,length =20)
     private String direccion;
     @Column(name ="direccion",nullable=false ,length =250)
     @NotEmpty() 
     private String rol;
     @Column(name ="rol",nullable=false ,length =20)
     @NotEmpty() 
     private String correo;
     @Column(name ="correo",nullable=false ,length =50)
     @NotEmpty() 
     private String estado;
     @Column(name ="estado",nullable=false ,length =10)
     @NotEmpty() 

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
