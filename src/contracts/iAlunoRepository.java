package contracts;
import java.util.List;

import models.Aluno;

public interface iAlunoRepository {
    void adicionar(Aluno aluno); // Adicionar um aluno
    void remover(Aluno aluno); // Remove um aluno
    Aluno buscar(String nome); // Busca o aluno pelo nome e retorna o Aluno
    List<Aluno> listar(); // Lista os alunos adicionado
}
