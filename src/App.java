import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import models.Aluno;
import repositories.ArrayListAlunoRepository;

public class App {
    public static void main(String[] args) {
        iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

        // Adicionar 5 alunos a lista
        alunoRepository.adicionar(new Aluno("João", "0000000001")); 
        alunoRepository.adicionar(new Aluno("Toin", "0000000002"));
        alunoRepository.adicionar(new Aluno("Fabio", "0000000003"));
        alunoRepository.adicionar(new Aluno("Manoel", "0000000004")); 
        alunoRepository.adicionar(new Aluno("Alan", "0000000005"));
        
        // Listar os alunos
        for (Aluno aluno : alunoRepository.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        // Buscar e retornar um aluno que está na lista
        try {
            Aluno alunoBuscado = alunoRepository.buscar("Fabio");
            System.out.println("Aluno buscado: " + alunoBuscado.getNome());

            // Remover um aluno
            alunoRepository.remover(alunoBuscado);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Listar os alunos restantes
        for (Aluno aluno : alunoRepository.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
