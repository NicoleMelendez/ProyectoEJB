/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.servicio;

import com.proyectoejb.entidades.Salario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicol
 */
@Stateless
public class SalarioFacade extends AbstractFacade<Salario> implements SalarioFacadeLocal {

    @PersistenceContext(unitName = "ProyectoEJB")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalarioFacade() {
        super(Salario.class);
    }
    
}
