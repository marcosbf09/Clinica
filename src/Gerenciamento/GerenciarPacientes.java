/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciamento;


import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import Clinica.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


/**
 *
 * @author marcos
 */
public class GerenciarPacientes{

    /**
     * Algumas funções desta classe estão sendo usadas, ex: cadastrar
     */
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaPU");
    EntityManager em = emf.createEntityManager();

    public GerenciarPacientes() {
        
    }

    public void cadastrar(EntityManager em, String nome, int idade, String endereco, String rg, int cpf, int dia, int mes, int ano, 
            String telefone, String celular, String email, int conv) {
        

            Cliente cliente = new Cliente();
            Calendar datanasc = Calendar.getInstance();
            
            cliente.setNome(nome);

            cliente.setIdade(idade);

            cliente.setEndereço(endereco);

            cliente.setRg(rg);

            cliente.setCpf(cpf);

            datanasc.set(Calendar.DAY_OF_MONTH, dia);

            switch (mes) {
                case 1:
                    datanasc.set(Calendar.MONTH, Calendar.JANUARY);
                    break;
                case 2:
                    datanasc.set(Calendar.MONTH, Calendar.FEBRUARY);
                    break;
                case 3:
                    datanasc.set(Calendar.MONTH, Calendar.MARCH);
                    break;
                case 4:
                    datanasc.set(Calendar.MONTH, Calendar.APRIL);
                    break;
                case 5:
                    datanasc.set(Calendar.MONTH, Calendar.MAY);
                    break;
                case 6:
                    datanasc.set(Calendar.MONTH, Calendar.JUNE);
                    break;
                case 7:
                    datanasc.set(Calendar.MONTH, Calendar.JULY);
                    break;
                case 8:
                    datanasc.set(Calendar.MONTH, Calendar.AUGUST);
                    break;
                case 9:
                    datanasc.set(Calendar.MONTH, Calendar.SEPTEMBER);
                    break;
                case 10:
                    datanasc.set(Calendar.MONTH, Calendar.OCTOBER);
                    break;
                case 11:
                    datanasc.set(Calendar.MONTH, Calendar.NOVEMBER);
                    break;
                case 12:
                    datanasc.set(Calendar.MONTH, Calendar.DECEMBER);
                    break;

            }


            datanasc.set(Calendar.YEAR, ano);

            cliente.setDatanasc(datanasc.getTime());

            cliente.setTelefone(telefone);

            cliente.setCelular(celular);

            cliente.setEmail(email);

            switch(conv){
                case 1: cliente.setPlano("Particular"); break;
                case 2: cliente.setPlano("Plano de Saúde"); break;
                default: System.out.println("Opção Incorreta!"); break;
            }
  
           em.persist(cliente);


    }
    

    public void consultar(EntityManager em, int cpf) {

  
            em.getTransaction().begin();
            
            Cliente c = em.find(Cliente.class, cpf);
           
            c.getNome();
            c.getRg();
            c.getCpf();
            c.getIdade();
            c.getDataNascimento();
            c.getEndereço();
            c.getTelefone();
            c.getCelular();
            c.getEmail();
            c.getPlano();
            
            
            em.getTransaction().commit();
        
        
    }

    public void alterar(EntityManager em, String nome, String idadestring, String endereco, String rg, int cpf, String dia, String mes, String ano, 
            String telefone, String celular, String email, int conv) {

            Calendar datanasc = Calendar.getInstance();

                
                Cliente c = new Cliente();
               
                
                c.setCpf(cpf);
                c = em.merge(c);
                
                c.setNome(nome);

                int idade = Integer.parseInt(idadestring);
                c.setIdade(idade);

                c.setEndereço(endereco);

                c.setRg(rg);

                int diaint = Integer.parseInt(dia);
                datanasc.set(Calendar.DAY_OF_MONTH, diaint);

                int mesint = Integer.parseInt(mes);
                switch (mesint) {
                            case 1:
                                datanasc.set(Calendar.MONTH, Calendar.JANUARY);
                                break;
                            case 2:
                                datanasc.set(Calendar.MONTH, Calendar.FEBRUARY);
                                break;
                            case 3:
                                datanasc.set(Calendar.MONTH, Calendar.MARCH);
                                break;
                            case 4:
                                datanasc.set(Calendar.MONTH, Calendar.APRIL);
                                break;
                            case 5:
                                datanasc.set(Calendar.MONTH, Calendar.MAY);
                                break;
                            case 6:
                                datanasc.set(Calendar.MONTH, Calendar.JUNE);
                                break;
                            case 7:
                                datanasc.set(Calendar.MONTH, Calendar.JULY);
                                break;
                            case 8:
                                datanasc.set(Calendar.MONTH, Calendar.AUGUST);
                                break;
                            case 9:
                                datanasc.set(Calendar.MONTH, Calendar.SEPTEMBER);
                                break;
                            case 10:
                                datanasc.set(Calendar.MONTH, Calendar.OCTOBER);
                                break;
                            case 11:
                                datanasc.set(Calendar.MONTH, Calendar.NOVEMBER);
                                break;
                            case 12:
                                datanasc.set(Calendar.MONTH, Calendar.DECEMBER);
                                break;

                        }

                int anoint = Integer.parseInt(ano);
                datanasc.set(Calendar.YEAR, anoint);

                c.setDatanasc(datanasc.getTime());
 
                c.setTelefone(telefone);

                c.setCelular(celular);

                c.setEmail(email);

            switch (conv) {
               case 1:
                      c.setPlano("Particular");
                      break;
                case 2:
                      c.setPlano("Plano de Saúde");
                      break;
            }
    
    }

    public void remover(EntityManager em) {
       

    }
    
    public void cadastrarDadosAdicionais(EntityManager em, int cpf, int fuma, int bebe, int colesterol, int diabete,
            String cirurgia, String alergia, String doencasCardio){ //acessado apenas pelo médico

                
        Cliente c = em.find(Cliente.class, cpf);

        if (fuma == 1) {
            c.setFuma(true);
        } else {
            c.setFuma(false);
        }

        if (bebe == 1) {
            c.setBebe(true);
        } else {
            c.setBebe(false);
        }

        c.setColesterol(colesterol);

        if (diabete == 1) {
            c.setDiabete(true);
        } else {
            c.setDiabete(false);
        }

        c.setCirurgia(cirurgia);
        c.setAlergia(alergia);
        c.setDoençaCardio(doencasCardio);
        
        em.persist(c);

                    
    }


    
    public void alterarDadosAdicionais(EntityManager em) {

    
    }
    
    public void consultaDadosAdicionais(EntityManager em) {
     

    }

    public void removerDadosAdicionais(EntityManager em) {


    }
    
    
    
    
}
