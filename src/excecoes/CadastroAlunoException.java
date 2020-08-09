
package excecoes;

public class CadastroAlunoException extends Exception{

    public CadastroAlunoException(String aluno_já_cadastrado) {
            super(aluno_já_cadastrado);
        
    }
    
}
