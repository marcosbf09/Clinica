/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author marcos
 */

@Entity
@Table(name="MEDICO")
public class Medico extends Secretaria{
    
    
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int idMedico;
    
    @Column(name="NOME", length=100, nullable=false)
    private String nome;

    @OneToMany
    private Collection<Consulta> listaConsultas1;

    
    public Medico(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public Collection<Consulta> getListaConsultas1() {
        return listaConsultas1;
    }

    public void setListaConsultas1(Collection<Consulta> listaConsultas1) {
        this.listaConsultas1 = listaConsultas1;
    }


}
