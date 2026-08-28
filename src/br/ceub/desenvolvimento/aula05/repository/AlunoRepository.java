package br.ceub.desenvolvimento.aula05.repository;

import java.util.ArrayList;
import java.util.List;

import br.ceub.desenvolvimento.aula05.model.Aluno;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        // TODO integrante A: guardar o aluno na lista.
        alunos.add(aluno);
    }

    public List<Aluno> listarTodos() {
        // TODO integrante A: devolver a lista de alunos.
        return alunos;
    }

    public Aluno buscarPorNome(String nome) {
        // TODO integrante A: percorrer a lista e comparar nomes com equalsIgnoreCase.
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public int quantidade() {
        // TODO integrante A: retornar a quantidade de alunos cadastrados.
        return alunos.size();
    }
}
