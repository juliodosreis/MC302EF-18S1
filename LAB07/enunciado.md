

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
# LABORATÓRIO 07

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
 * Praticar o conceito de Polimorfismo em POO considerando sobrecarga e sobreposição de métodos. 

## 2. Descrição


### 2.1 Sobrecarga

Constantemente é necessário buscar uma entidade, seja aluno, funcionario, disciplina etc, por um atributo ou uma combinação deles. Por exemplo, na situação em que se sabe o nome de um aluno e uma disciplina que ele cursa, ou apenas seu CPF. 

Portanto a primeira parte deste laboratório consiste em tratar da busca das entidades `Aluno`, `Curso` e `Disciplina` como descrito abaixo.

Crie uma classe chamada `ControladorAluno` e métodos com o mesmo nome que permitam buscar por:
  1. Matrícula;
  2. CPF;
  3. CPF e `Curso`; e
  4. Nome e `Disciplina`.

Faça o mesmo para a classe `RepositorioDeCursos`, defina métodos com o mesmo nome para buscar por:
  1. Nome; e
  2. Id.
> *Implemente o atributo `id` na classe `Curso` se não o fez no lab passado. 

Em uma nova classe chamada `RepositorioDeDisciplinas`,  defina métodos com o mesmo nome que permitam a busca por:
  1. Nome; e
  2. Id.
  
Nas classes listadas acima, implemente métodos para adicionar e remover elementos se a classe já não possui tais métodos.

### 2.2 Sobrecarga de Construtor

Alunos de pós graduação têm orientador. Suponha que no momento que um aluno é cadastrado no sistema, esse orientador pode ainda não estar definido, mas se já estiver definido, esse orientador deve ser informado na inicialização do objeto que representa esse aluno.

Professores podem ter orientandos. Suponha que no momento que um professor é cadastrado no sistema ele pode ter alguns orientandos, mas também pode não ter. Se ele já tiver algum orientando, esse orientando deve ser informado na inicialização do objeto que representa esse professor.

### 2.3 Sobreposição

No Laboratório 4 demandou a impressão de informações de todos os objetos armazenado em uma instânica de `MeuArray`. Seu programa deve ter usado o operador `instanceof` para determinar o tipo de cada objeto e fazer o casting desse objeto para chamar o método específico desse tipo para imprimir as informações. Refaça essa tarefa sem utilizar `instanceof`.

Alunos têm um coeficiênte de redentimento que busca medir o desempenho acadêmico. Suponha que esse coeficiênte acadêmico é dado pela média aritmética das notas de todas as disciplinas que o aluno está matriculado. Altere a classe Aluno para que possa armazenar as notas das disciplinas e também retornar a média. Por enquanto, não é necessário armazenar de qual disciplina é a nota. Alunos de pós-graduação tem notas como D, C, B, A, sendo que A é a nota máxima. As disciplinas geram nota no intervalo [0, 10] para os alunos, e seu programa deve converter a nota no intervalo [0, 10] para a escala D, C, B, A para os alunos de pós. Seja _n_ uma nota, use a seguinte regra para fazer a conversão: 

* se _n_ >= 8.5, converta para A;
* se 7 <= _n_ < 8.5, converta para B;
* se 5 <= _n_ < 7, converta para C;
* se _n_ < 5, converta para D.

O cálculo do coeficiênte de redimento para alunos de pós graduação usa as notas no intervalo [A, D], representando respectivamente os valores inteiros do intervalo [4, 1]. Então seu programa deve primeiro converter as notas para essa escala e depois calcular a média. Para calcular a média de um aluno de pós graduação, use os valores inteiros (D=1, C=2, B=3 e A=4).
Por exemplo:
```
n1 = 8,5 
n2 = 8 
Convertendo: 
n1 = A 
n2 = B 
Calculando a média: 
(n1+n2)/2 = 
(4 + 3)/2 = 3,5
```

## 3. Tarefas

1. Implementação de `ControladorAluno`;
2. Alteração de `RepositorioDeCursos`;
3. Implementação de `RepositorioDeDisciplinas`;
4. Refatoração do Laboratório 4;
5. Construtores de `Aluno` e `Professor`;
6. Cálculo do coeficiênte de rendimento de alunos de graduação e pós graduação;

## 4. Submissão
Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)).
Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.
Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB7-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na seção correspondente para
esse laboratório na disciplina MC302.

**Data de entrega:** Dia 25/05/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (30/05 às 23:59h), valendo 60% da nota.


## 5. Critérios de avaliação
**Peso do lab:** 3

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:
* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e identação do código.

Critérios específicos:
* Implementação de `ControladorAluno`: 1,5pts;
* Alteração de `RepositorioDeCursos`: 1,5pts;
* Implementação de `RepositorioDeDisciplinas` : 1,5pts;
* Refatoração do Laboratório 4: 1,5pts;
* Construtores de `Aluno`e `Professor`: 1,5;
* Calculo do coeficiênte de rendimento: 2,5pts;

**Nota final:** Soma das notas dos critérios específicos.
