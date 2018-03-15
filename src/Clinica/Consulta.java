/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcos
 */

@Entity
@Table(name="CONSULTA")

public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdConsulta;
    
    @Column(name="DATA_CONSULTA", length=100, nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dataConsulta;
    
    @Column(name="HORA_CONSULTA", length=100, nullable=false)
    @Temporal(TemporalType.TIME)
    private Date horaConsulta;
    
    @ManyToOne
    @JoinColumn(name="MEDICO_CONSULTA", nullable=false)
    private Medico medico;
    
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="PACIENTE_CONSULTA", nullable=false)
    private Cliente paciente;
    
    @Column(name="TIPO", length=100, nullable=false)
    private String tipo;

    public Consulta() {
    }

    public int getIdConsulta() {
        return IdConsulta;
    }

    public void setIdConsulta(int IdConsulta) {
        this.IdConsulta = IdConsulta;
    }

    public String getDataConsulta() {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(dataConsulta);
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        DateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(horaConsulta);
    }

    public void setHoraConsulta(Date horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Cliente getPaciente() {
        return paciente;
    }

    public void setPaciente(Cliente paciente) {
        this.paciente = paciente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Date getData(){
        return dataConsulta;
    }
    
    public Date getHora(){
        return horaConsulta;
    }
    
    public void setId(int id){
        this.IdConsulta = id;
    }

    
    
}
