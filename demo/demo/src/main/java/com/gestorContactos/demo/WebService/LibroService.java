package com.gestorContactos.demo.WebService;
import com.gestorContactos.demo.Model.Libro;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


//interfaz del web service
@WebService
public interface LibroService {
    
    @WebMethod
    public List<Libro> obtenerLibros();

    @WebMethod 
    public String agregarLibro(Libro libro);
}
