package models;
import exceptions.MatriculaInvalidaException;

public class Aluno {

    private String nome;
    private String matricula;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        if (matricula.length() != 10) {
            throw new MatriculaInvalidaException("A matrícula deve ter 10 números");
        }
        this.matricula = matricula;
    }

    // Getters e Setters
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
        if (matricula.length() != 10) {
            throw new MatriculaInvalidaException("A matrícula deve ter 10 números");
        }
        this.matricula = matricula;
    }
}


