/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author lucio.rodrigues
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa      p1 = new Pessoa();
        Aluno       p2 = new Aluno();
        Professor   p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo('M');
        p2.setNome("Maria");
        p2.setIdade(18);
        p3.setNome("Professor");
        p4.setNome("Fabiana");
        p4.setSexo('F');

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(550.20f);
        p4.mudarTrabalho();
        p2.cancelarMatricula();
        
        p1.detalharPessoa();
        p2.detalharPessoa();
        p3.detalharPessoa();
        p4.detalharPessoa();
        
        
    }
    
    
}
