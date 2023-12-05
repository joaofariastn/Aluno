package repositories;
import java.util.ArrayList;
import java.util.List;

import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import models.Aluno;

public class ArrayListAlunoRepository implements iAlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public void remover(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public Aluno buscar(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        throw new AlunoNaoEncontradoException("Aluno não encontrado");
    }

    @Override
    public List<Aluno> listar() {
        return alunos;
    }
}
