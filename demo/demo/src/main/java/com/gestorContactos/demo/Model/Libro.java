package com.gestorContactos.demo.Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "libro")
@XmlAccessorType(XmlAccessType.FIELD)
public class Libro implements Serializable  {
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private int fechaPublicacion;

    //constructor vacio
    public Libro(){}
    //constructor del objeto libro
    public Libro( String titulo, String autor, String genero, int fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
        this.fechaPublicacion=fechaPublicacion;
    }

    //geters y setters
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }

    public int getFechaPublicacion(){
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion){
        this.fechaPublicacion=fechaPublicacion;
    }


}
