/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Clinica.Cliente;
import Clinica.Medico;
import Clinica.Secretaria;
import Clinica.View.CadastroPacientes;
import Clinica.View.Inicio;


import Gerenciamento.GerenciarPacientes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author marcos
 */
public class ClinicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /**
        * ALUNOS: Marcos Brunelli
        *         Tamires Ganzert
        * 
        * Algumas informações:
        * 
        * O codigo está rodando e a persistencia de dados está funcionando.
        * 
        * Não conseguimos fazer a emissão de relatório de consultas do dia seguinte,
        * pois a conexão com o banco gera um erro.
        * 
        * O banco de dados usado tem o nome bancoclinica, pois nao conseguimos fazer
        * a conexao com o banco 'sample' do javadb, dava um erro com as tabelas.
        * 
        * (nao sei se são necessárias essas informacoes de banco, porem estou colocando aqui)
        * 
        * As outras emissões de relatórios estão funcionando de forma simples.
        * 
        * Foram criados entitymanagers em cada funcao, pois nao conseguimos fazer
        * a ligacao do entitymanager do main com estas funcoes.
        * 
        *
        * 
        */
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaPU");
       EntityManager em = emf.createEntityManager();

        Medico medico = new Medico();
        Medico medico2 = new Medico();
        Medico medico3 = new Medico();

        medico.setIdMedico(1);
        medico2.setIdMedico(2);
        medico3.setIdMedico(3);
        
        
        medico.setNome("Dr. Joao Paulo");
        medico2.setNome("Dra. Javacreide Souza");
        medico3.setNome("Dr. Javanelson Pereira");
        
        em.getTransaction().begin();
        
        em.persist(medico);
        em.persist(medico2);
        em.persist(medico3);

        System.out.println("\n\t|||| 2º Trabalho de Programação Orientada à Objetos ||||");
        System.out.println("\nALUNOS: Marcos Brunelli");
        System.out.println("\tTamires Ganzert");
        System.out.println("\n\n\t|| BEM VINDO AO SISTEMA DA CLINICA 'SAUDE E CIA' ||");
        
      
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);

        
        em.getTransaction().commit();
       
        
        em.close();

        
        
    }
    
}
