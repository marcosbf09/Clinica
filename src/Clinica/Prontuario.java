/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author marcos
 */

@Entity
@Table(name="PRONTUARIO")
public class Prontuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProntuario;
    
    @Column(name="SINTOMAS", length=200, nullable=false)
    private String sintomas;
    @Column(name="DIAGNOSTICO", length=200, nullable=false)
    private String diagnostico;
    @Column(name="PRESCRICAO", length=200, nullable=false)
    private String prescriçao;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="CLIENTE_PRONTUARIO", nullable=false)
    private Cliente cliente;

    public Prontuario() {
    }

    public int getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescriçao() {
        return prescriçao;
    }

    public void setPrescriçao(String prescriçao) {
        this.prescriçao = prescriçao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
