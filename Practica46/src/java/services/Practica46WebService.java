/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import beans.Categoria;
import beans.Producto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author FO-Mañana
 */
@WebService(serviceName = "Practica46WebService")
public class Practica46WebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sumar")
    public Integer Sumar(@WebParam(name = "parameter1") int parameter1, @WebParam(name = "parameter2") int parameter2) {
        //TODO write your implementation code here:
        return parameter1+parameter2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearCategoria")
    public Categoria crearCategoria(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        Categoria categoria=null;
        if(id==1){
           categoria=new Categoria(id,"categoria creada con servicio web","Categoria Web");
           Producto producto1=new Producto(1,"producto1",2.99);
            Producto producto2=new Producto(2,"producto2",4.99);
            categoria.getListaProductos().add(producto1);
            categoria.getListaProductos().add(producto2);
           
        }
        
        return categoria;
    }
    
    
    
    
}
