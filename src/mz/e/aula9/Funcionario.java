
package mz.e.aula9;

/**
 *
 * @author joseseie
 */
public class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;
    private String posicao;
    
    public Funcionario (String nome, int idade, double salario, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.posicao = posicao;
    }
    
    public String getNome () {
        return this.nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public int getIdade () {
        return this.idade;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public double getSalario () {
        return this.salario;
    }
    public void setSalario (double salario) {
        this.salario = salario;
    }
    
}
