

<!-- Início de workaround com HTML -->
<p align="center">
    <b>
        INSTITUTO DE COMPUTAÇÃO - UNICAMP </br>
        MC302 - PROGRAMAÇÃO ORIENTADA A OBJETOS </br>
        1º Semestre de 2018 </br>
    </b>
</p>
<!-- Fim de workaround com HTML -->

**Professor:** Julio Cesar dos Reis

**Monitores:**
  - Alexandre Rodrigues Gomes (PED);
  - Italos Estilon da Silva de Souza (PED);
  - Guilherme Mendeleh Perrotta (PAD).
___
# LABORATÓRIO 06

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
* Praticar os conceitos de agregação e composição;
* Praticar o conceito de classe interna.


## 2. Descrição

No domínio da aplicação que estamos desenvolvendo, disciplinas têm uma carga horária. Normalmente essa informação é dada em termos de créditos, sendo que 1 crédito corresponde a 16 horas. Altere a classe `Disciplina` para acomodar essa informação.

O sistema ainda não tem um conceito de curso. Vamos considerar as seguintes características em relação ao curso: 
* um curso tem um nome;
* um curso tem um conjunto de disciplinas;
* um curso tem um conjunto de alunos matriculados;
* um aluno pode ser matriculado em um curso e também pode ter sua matrícula cancelada;
* um aluno está matriculado em apenas um curso;

Modele e implemente o conceito de curso na aplicação que estamos desenvolvendo. Defina também uma classe `RepositorioDeCursos` para armazenar os cursos. Essa classe possui uma lista de todos os cursos da universidade instanciados no nosso sistema. A classe `RepositorioDeCursos` possui métodos para adicionar e remover cursos.

Note que, além de estar matriculado em um curso, um aluno também está matriculado em disciplinas. No mundo real, existe um limite máximo no número de créditos que um aluno pode fazer em um semestre. Vamos supor que esse limite é definido pelo curso no qual o aluno é matriculado. Modelo esse aspecto no sistema de modo que ao fazer a matrícula de um aluno em uma disciplina, verifique se essa matrícula respeita a restrição do número máximo de créditos dentro do semestre.

Vamos retirar a responsibilidade de verificar a restrição do número de créditos da classe `Disciplina`. Para isso, defina uma classe `ControladorDeMatricula`. Essa classe deve possuir um método como segue:

```java
public void solicitarMatricula(Disciplina disciplina, Aluno aluno){
...
}
```
Esse método deve criar uma solicitação de matrícula. As solicitações de matrícula devem ser armazenadas de modo que sejam todas processadas em um único momento. Defina uma classe para representar uma solicitação de matrícula. Considere essa classe como interna à classe `ControladorDeMatricula`. Defina um método na classe `ControladorDeMatricula` que ao ser chamado processa todas as solicitações de matrículas. Se não há vagas suficientes em uma disciplina, os alunos que solicitaram matrícula primeiro devem ter prioridade.

Na classe `Principal`, crie um curso com limite de 6 créditos por semestre. Matricule um aluno nesse curso, e tente matricular esse aluno em disciplinas que somem mais de 6 créditos. Crie uma disciplina com 25 vagas e tente matricular 26 aluno nessa disciplina, verifique se os primeiros 25 alunos que solicitaram matrícula foram de fato matriculados.

## 3. Tarefas

* Alteração da classe `Disciplina`;
* Modelagem do conceito de curso;
* Implementação da classe `RepositorioDeCursos`;
* Implementação da classe `ControladorDeMatricula`;
* Modelagem do conceito de solicitação de matrícula.

## 4. Submissão

Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)). Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.

Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB5-000000.tar.gz`, trocando "000000" pelo seu número de RA. **Por favor, use essa nomenclatura e formato**. Submeta o arquivo na tarefa correspondente para esse laboratório na disciplina MC302. **Após submeter, verifique se a submissão está correta**. 

**Data de entrega:** Dia 09/05/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (14/05 às 23:59h), valendo 60% da nota.

## 5. Critérios de Avaliação

**Peso do lab:** 2

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:

* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e identação do código.

Critérios específicos:
* Nota 1:
	* Alteração da classe `Disciplina` (0.5 pts);
	* Modelagem e implementação do conceito de curso (3.5 pts);
	* Modelagem do conceito de solicitação de matrícula (1 pts);
	* Implementação da classe `RepositorioDeCursos` (0.5 pts);
	* Implementação da classe `ControladorDeMatricula` (4.5 pts).
* Nota 2:
	* Indentação, clareza do código: 1pts;
	* Testes na classe `Principal`: 3pts;
	* Uso adequado dos conceitos de POO: 6pts.

**Nota final:** (2*Nota 1 + Nota 2) / 3.
