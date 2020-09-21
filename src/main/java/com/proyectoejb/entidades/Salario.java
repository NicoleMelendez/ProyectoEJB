/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoejb.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicol
 */
@Entity
@Table(name = "SALARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salario.findAll", query = "SELECT s FROM Salario s"),
    @NamedQuery(name = "Salario.findById", query = "SELECT s FROM Salario s WHERE s.id = :id"),
    @NamedQuery(name = "Salario.findByNombres", query = "SELECT s FROM Salario s WHERE s.nombres = :nombres"),
    @NamedQuery(name = "Salario.findByApellidos", query = "SELECT s FROM Salario s WHERE s.apellidos = :apellidos"),
    @NamedQuery(name = "Salario.findByDepartamento", query = "SELECT s FROM Salario s WHERE s.departamento = :departamento"),
    @NamedQuery(name = "Salario.findByCargo", query = "SELECT s FROM Salario s WHERE s.cargo = :cargo"),
    @NamedQuery(name = "Salario.findBySalario", query = "SELECT s FROM Salario s WHERE s.salario = :salario"),
    @NamedQuery(name = "Salario.findByFecha", query = "SELECT s FROM Salario s WHERE s.fecha = :fecha")})
public class Salario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="salario_sec", sequenceName="sec_salario", allocationSize = 1 )
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="salario_sec")
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 100)
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 100)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 100)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Size(max = 100)
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "SALARIO")
    private BigDecimal salario;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Salario() {
    }

    public Salario(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salario)) {
            return false;
        }
        Salario other = (Salario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyectoejb.entidades.Salario[ id=" + id + " ]";
    }
    
}
