
package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Turma implements Serializable {
        private ArrayList<Aluno> alunos = new ArrayList();
        private ArrayList <Horario> horarios = new ArrayList();
        private String nome;
        
        public Turma(String nome){
            this.nome = nome;
        }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
    
    
    
        
        
}
