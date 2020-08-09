
package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Aluno implements Serializable {
    private String nome;
    private String matricula;
    private int faltas;
    private int presenca;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.faltas = 0;
        this.presenca = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    public ArrayList<Horario> consultarHorario(Turma turma){
        return turma.getHorarios();
    }
    
    
    
    
    
    
}
