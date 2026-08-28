package br.ceub.desenvolvimento.aula05.app;

import br.ceub.desenvolvimento.aula05.repository.AlunoRepository;
import br.ceub.desenvolvimento.aula05.service.AlunoService;
import br.ceub.desenvolvimento.aula05.view.MenuAlunos;

public class Principal {
    public static void main(String[] args) {
        AlunoRepository repository = new AlunoRepository();
        AlunoService service = new AlunoService(repository);
        MenuAlunos menu = new MenuAlunos(service);
        menu.iniciar();
    }
}
