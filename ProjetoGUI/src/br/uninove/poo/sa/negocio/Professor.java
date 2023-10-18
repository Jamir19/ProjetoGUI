
package br.uninove.poo.sa.negocio;


public class Professor extends Pessoa{
    
    private double salario;
    private String dtContratacao;
    private long matricula;

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the dtContratacao
     */
    public String getDtContratacao() {
        return dtContratacao;
    }

    /**
     * @param dtContratacao the dtContratacao to set
     */
    public void setDtContratacao(String dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    /**
     * @return the matricula
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    
}
