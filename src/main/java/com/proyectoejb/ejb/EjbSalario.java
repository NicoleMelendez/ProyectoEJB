/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.ejb;

import com.proyectoejb.entidades.Salario;
import com.proyectoejb.servicio.SalarioFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author nicol
 */
@Named("salariobean")
@RequestScoped 

public class EjbSalario implements Serializable {

    @EJB
    private SalarioFacadeLocal salarioFacade;
    private Salario newsalario;

    public Salario getNewsalario() {
        
        
        if (newsalario==null) {
            
            newsalario = new Salario();
        }
        return newsalario;
    }

    public void setNewsalario(Salario newsalario) {
        this.newsalario = newsalario;
    }
   
    
    public EjbSalario () {
   
    }
    
    public List<Salario>getSalario() {
            
        return this.salarioFacade.findAll();
    }
    
    public void crear(){
    
        this.salarioFacade.create(newsalario);
    
    }
    
    public void Eliminar(Salario salario){
    
        this.salarioFacade.remove(salario);
    }
    
    
    public void Actualizar(Salario salario){
    
        this.salarioFacade.edit(salario);
    
    }
}
