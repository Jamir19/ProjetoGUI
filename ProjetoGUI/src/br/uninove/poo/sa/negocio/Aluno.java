
package br.uninove.poo.sa.negocio;


public class Aluno extends Pessoa{
    private String curso;
    private float notaVestibular;
    private long registroAcademico;

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the notaVestibular
     */
    public float getNotaVestibular() {
        return notaVestibular;
    }

    /**
     * @param notaVestibular the notaVestibular to set
     */
    public void setNotaVestibular(float notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    /**
     * @return the registroAcademico
     */
    public long getRegistroAcademico() {
        return registroAcademico;
    }

    /**
     * @param registroAcademico the registroAcademico to set
     */
    public void setRegistroAcademico(long registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
}
