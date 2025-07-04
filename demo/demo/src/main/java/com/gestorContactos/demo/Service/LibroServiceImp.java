package com.gestorContactos.demo.Service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.gestorContactos.demo.Model.Libro;
import com.gestorContactos.demo.WebService.LibroService;

@WebService(endpointInterface = "com.gestorContactos.demo.WebService.LibroService")
public class LibroServiceImp implements LibroService {
    
    //lista de los libros que hay guardados
    private List<Libro> listaLibros=new ArrayList<>();

    @Override
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    @Override 
    public String agregarLibro(Libro libro){
        listaLibros.add(libro);
        return "Libro agregado con exito" + libro.getTitulo();
    }
}
