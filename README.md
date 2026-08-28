# Aula 5 - Cadastro de Alunos em Dupla

Classroom: Classroom 50
Assignment: aula05-cadastro-alunos-dupla
Turma: Turma Única - Matutino
Dupla: Lucas Nunes e Vinicius Aurelio
Integrante A: Lucas Nunes
Integrante B: Vinicius Aurelio
Data:28/08/2026

## Atenção sobre o repositório

* A dupla deve trabalhar em **um único repositório**.
* Somente o **Integrante A** deve aceitar inicialmente o assignment.
* Depois que o repositório for criado, o Integrante A deve adicionar o **Integrante B como colaborador no mesmo repositório**.
* O Integrante B **não deve aceitar novamente a atividade para criar outro repositório**.
* Cada integrante deve utilizar sua própria conta GitHub e realizar pelo menos um commit próprio.

## Antes de começar

Abra o **PowerShell** e verifique se o Git está instalado:

```powershell
git --version
```

Se aparecer a versão instalada, continue.

Se o comando `git` não for reconhecido, instale o **Git for Windows** antes de continuar.

## Como baixar o projeto

1. No GitHub, abra o repositório da atividade.
2. Clique em **Code**.
3. Selecione **HTTPS**.
4. Copie a URL do repositório.
5. Abra o PowerShell na pasta onde deseja armazenar o projeto.
6. Execute:

```powershell
git clone URL_DO_REPOSITORIO
```

Exemplo:

```powershell
git clone https://github.com/organizacao/nome-do-repositorio.git
```

7. Entre na pasta criada:

```powershell
cd nome-do-repositorio
```

8. Confira o estado do repositório:

```powershell
git status
```

O resultado esperado é:

```text
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
```

## Como abrir o projeto no Eclipse

1. Abra o Eclipse.
2. Acesse **File > Import**.
3. Escolha **General > Existing Projects into Workspace**.
4. Clique em **Next**.
5. Em **Select root directory**, selecione a pasta criada pelo `git clone`.
6. A pasta selecionada deve conter `.project`, `.classpath` e `src`.
7. Deixe **Copy projects into workspace** desmarcado.
8. Selecione `Aula05CadastroAlunosDupla`.
9. Clique em **Finish**.

## Testar o projeto inicial

Antes de alterar qualquer código:

1. Abra:

`src > br.ceub.desenvolvimento.aula05.app > Principal.java`

2. Clique com o botão direito em `Principal.java`.
3. Escolha **Run As > Java Application**.
4. Teste:

   * cadastrar aluno;
   * listar alunos;
   * buscar aluno;
   * sair.

Não continue se o projeto inicial não executar corretamente.

## Fluxo de trabalho da dupla

Antes de começar uma nova alteração:

```powershell
git pull
```

Depois:

1. Edite uma pequena parte do projeto.
2. Execute e teste.
3. Confira:

```powershell
git status
```

4. Adicione os arquivos alterados:

```powershell
git add .
```

5. Faça o commit:

```powershell
git commit -m "mensagem que descreve a alteracao"
```

6. Envie:

```powershell
git push
```

A regra da aula é:

**Pull → editar → testar → commit → push**

## Divisão de tarefas

### Integrante A

Arquivo principal: `AlunoRepository.java`

Verificar:

* `adicionar`;
* `listarTodos`;
* `buscarPorNome`;
* `quantidade`.

### Integrante B

Arquivo principal: `AlunoService.java`

Verificar:

* validação do nome;
* validação do curso;
* validação do semestre.

### Dupla

Arquivo principal: `MenuAlunos.java`

Testar:

* cadastro;
* listagem;
* busca;
* mensagens apresentadas ao usuário.

## Registro da divisão de tarefas

**Integrante A: Lucas Nunes

**Integrante B: Vinicius Aurelio

## Commits obrigatórios

* Integrante A realizou pelo menos um commit próprio?
* Integrante B realizou pelo menos um commit próprio? 
* Os commits foram enviados para o mesmo repositório?

## Testes realizados

* Cadastro de aluno: 
* Listagem:
* Busca por nome:
* Busca por aluno inexistente:
* Validação de semestre:
* Validação de campo obrigatório:

## Dificuldades encontradas

Descreva uma dificuldade técnica ou de colaboração encontrada durante a atividade.

## Resultado final

Explique o que a dupla conseguiu concluir nesta aula.

## Atenção

Se forem criados dois repositórios para a mesma dupla, **parem a atividade e chamem a professora** antes de continuar.

Não desenvolvam a mesma atividade paralelamente em dois repositórios diferentes.