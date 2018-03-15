/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author marcos
 */

@Entity
@Table(name="CLIENTE")
public class Cliente {
    
    @Id
    private int cpf;
    
    @Column(name="NOME", length=100, nullable=false)
    private String nome;
    @Column(name="RG", length=100, nullable=false, unique=true)
    private String rg;
    @Column(name="IDADE", length=100, nullable=false)
    private int idade;
    @Column(name="DATA_NASC", length=100, nullable=false)
    private Date datanasc;
    @Column(name="ENDERECO", length=100, nullable=false)
    private String endereço;
    @Column(name="TELEFONE", length=100, nullable=false)
    private String telefone;
    @Column(name="CELULAR", length=100)
    private String celular;
    @Column(name="EMAIL", length=100)
    private String email;
    @Column(name="PLANO", length=100, nullable=false)
    private String plano;
    
    @Column(name="FUMA", length=100)
    private boolean fuma;
    @Column(name="BEBE", length=100)
    private boolean bebe;
    @Column(name="COLESTEROL", length=100)
    private int colesterol;
    @Column(name="DIABETE", length=100)
    private boolean diabete;
    @Column(name="DOENCA_CARDIO", length=100)
    private String doençaCardio;
    @Column(name="ALERGIAS", length=100)
    private String alergia;
    @Column(name="CIRURGIAS", length=100)
    private String cirurgia;
    
    //@OneToMany
    //private Collection<Consulta> listaConsultas1;
    //@OneToMany
    //private Collection<Prontuario> listaProntuarios;
  

    public Cliente() {
        
     
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public boolean isFuma() {
        return fuma;
    }

    public void setFuma(boolean fuma) {
        this.fuma = fuma;
    }

    public boolean isBebe() {
        return bebe;
    }

    public void setBebe(boolean bebe) {
        this.bebe = bebe;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }

    public boolean isDiabete() {
        return diabete;
    }

    public void setDiabete(boolean diabete) {
        this.diabete = diabete;
    }


    public String getDoençaCardio() {
        return doençaCardio;
    }

    public void setDoençaCardio(String doençaCardio) {
        this.doençaCardio = doençaCardio;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
    
    public String getDataNascimento() {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(datanasc);
    }
    
    
    
            
         
}
