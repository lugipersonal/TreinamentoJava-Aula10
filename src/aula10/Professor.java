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
public class Professor extends Pessoa{
    
    //**Atributos
    private String especialidade;
    private float salario;
    
    //**Métodos Especiais
    /*
    private Professor(String especialidade, float salario){
        this.especialidade = especialidade;
        this.salario = salario;
    }
    */
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    //**Métodos Públicos
    public void receberAumento(float aumento){
        this.setSalario(getSalario() + aumento);
    }
    
    
    
}
