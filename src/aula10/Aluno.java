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
public class Aluno extends Pessoa{
    
    //**Atributos
    private int matricula;
    private String curso;
    
    //**Métodos Especiais
    /*
    public void Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }
    */
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    //**Métodos Públicos
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
        
    }
    
}
