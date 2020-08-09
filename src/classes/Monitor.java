package classes;

import excecoes.CadastroAlunoException;
import excecoes.CampoEmBrancoException;
import excecoes.DiaInvalidoException;
import excecoes.HorarioInvalidoException;
import excecoes.MesmoAlunoTurmaException;
import excecoes.MonitorNaoCadastradoException;
import excecoes.TurmaCadastradaException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Monitor extends Aluno implements Serializable {

    private String login;
    private String senha;

    public Monitor(String nome, String matricula, String login, String senha) {
        super(nome, matricula);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void registrarFalta(Aluno aluno) {
        aluno.setFaltas(aluno.getFaltas() + 1);
    }

    public void registrarPresenca(Aluno aluno) {
        aluno.setPresenca(aluno.getPresenca() + 1);
    }

    public void cadastrarAluno(Aluno aluno, Turma turma, Monitoria monitoria) throws CadastroAlunoException, MesmoAlunoTurmaException {
        int i = monitoria.getTurmas().indexOf(turma);
        for (int j = 0; j < this.consultarAlunos(turma).size(); j++) {
            if (aluno.getNome().toLowerCase().equals(monitoria.getMonitor().consultarAlunos(turma).get(j).getNome().toLowerCase()) && aluno.getMatricula().equals(monitoria.getMonitor().consultarAlunos(turma).get(j).getMatricula())) {
                 throw new CadastroAlunoException("Aluno já cadastrado.");
            }
        }

        for (int j = 0; j < monitoria.getTurmas().size(); j++) {
            for (int k = 0; k < monitoria.getTurmas().get(j).getAlunos().size(); k++) {
                if (aluno.getNome().toLowerCase().equals(monitoria.getTurmas().get(j).getAlunos().get(k).getNome().toLowerCase()) && aluno.getMatricula().equals(monitoria.getTurmas().get(j).getAlunos().get(k).getMatricula())) {
                     throw new MesmoAlunoTurmaException();
                }
            }
        }
            monitoria.getTurmas().get(i).getAlunos().add(aluno);
        

    }

    public void cadastrarTurma(Turma turma, Monitoria monitoria) throws TurmaCadastradaException {
        for (int i = 0; i < monitoria.getTurmas().size(); i++) {
            if (turma.getNome().toLowerCase().replaceAll(",", "").replaceAll(" ", "").replaceAll("º", "").replaceAll("á", "a").equals(monitoria.getTurmas().get(i).getNome().toLowerCase().replaceAll(",", "").replaceAll(" ", "").replaceAll("º", "").replaceAll("á", "a"))) {
                throw new TurmaCadastradaException();
            }
        }
        
       monitoria.getTurmas().add(turma);
        

    }

    public void cadastrarHorario(Horario horario, Turma turma, Monitoria monitoria) throws HorarioInvalidoException, DiaInvalidoException {
        int i = monitoria.getTurmas().indexOf(turma);
        for (int j = 0; j < monitoria.getTurmas().size(); j++) {
            for (int k = 0; k < monitoria.getTurmas().get(j).getHorarios().size(); k++) {
                if (horario.getDia().toLowerCase().equals(monitoria.getTurmas().get(j).getHorarios().get(k).getDia().toLowerCase()) && horario.getHora().toLowerCase().equals(monitoria.getTurmas().get(j).getHorarios().get(k).getHora().toLowerCase())) {
                     throw new HorarioInvalidoException();
                }
            }
        }
        
        if (horario.getDia().equals("Domingo") || horario.getDia().equals("Sábado")) {
            throw new DiaInvalidoException();
        }
        
        monitoria.getTurmas().get(i).getHorarios().add(horario);

    }

    public boolean realizarLogin(String login, String senha) throws MonitorNaoCadastradoException, CampoEmBrancoException {
        if (this.login == null && this.senha == null && this.getNome() == null && this.getMatricula() == null) {
            throw new MonitorNaoCadastradoException();
        } else if (login == null && senha == null) {
            throw new CampoEmBrancoException();
        } else {
            if (this.login.equals(login) && this.senha.equals(senha)) {
                return true;
            } else {
                return false;
            }
        }

    }

    public ArrayList<Aluno> consultarAlunos(Turma turma) {
        return turma.getAlunos();
    }

    @Override
    public String toString() {
        return "Monitor{" + "login=" + login + ", senha=" + senha + '}' + super.toString();
    }

}
