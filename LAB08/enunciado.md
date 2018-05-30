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
______

# LABORATÓRIO 08

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
 * Praticar o conceito de classes e métodos abstratos em POO.

## 2. Descrição

No sistema em desenvolvimento sobre gestão acadêmica, existe uma hierarquia de classes na qual para algumas classes dessa hierarquia não existe sentido semântico a instanciação de objetos concretos. Em uma hierarquia de classes, ao considerar uma classe mais genérica é preciso analisar se há necessidade de objetos dessa classe, para além dos objetos de uma das especificações dessa classe. 

## 2.1 Hierarquia de Alunos e Pessoas

Considere a hierarquia de alunos e de tipo de pessoas no sistema para refatorar o código visando que essas hierarquias considerem classes abstratas. Efetue as modificações necessárias, como efeito dessa alteração na hierarquia de pessoa e tipo de alunos presentes no sistema da universidade.

## 2.2 Classe MeuArray

No [Laboratório 4](https://github.com/juliodosreis/MC302EF-18S1/blob/master/LAB04/enunciado.md), foi elaborada uma extensão da classe `ArrayList`. Essa tarefa requisitou a implementação de um método para ordenar os objetos armazenados nessa classe. Refatore a implementação de `MeuArray` para torná-la mais genérica de modo que seja possível efetuar a ordenação dos elementos segundo um critério definido por uma subclasse de `MeuArray`. Por exemplo, uma instância de uma classe específica herdada de `MeuArray` usa um critério A de ordenação (e.g., ordem lexicográfica do nome), enquanto uma segunda classe específica usa um critério B de ordenação (e.g., ordem crescente do número de matrícula). O critério de ordenação deve ficar totalmente transparente na classe `MeuArray`. Analise como um método para esse fim poderia ser definido. Por exemplo, todo objeto instância específica de uma subclasse de `MeuArray` deve ter um método `compara` que recebe como parâmetro dois objetos e retorna o objeto que deve vir antes na ordenação.

## 2.3 Hierarquia de Disciplinas

No domínio do sistema em desenvolvimento existe uma divisão das disciplinas em disciplinas de graduação e disciplinas de pós-graduação. A principal diferença é que alunos de pós-graduação não podem ser matriculados em disciplinas de graduação, mas alunos de graduação podem ser matriculados em disciplinas de pós-graduação. Implemente esse comportamento no sistema de gestão acadêmica. 

Altere a implementação de `Disciplina` para que a classe armazene se os alunos matriculados foram aprovados ou reprovados. Note que alunos de graduação e alunos de pós-graduação são tratados de forma diferentes. Isso deve exigir alterar a classe `Aluno` para que essa classe tenha um método abstrato, tal que, dado um nota retorna se o aluno foi aprovado ou não. A graduação tem como critério de aprovação o aluno ter nota maior ou igual a 5; e a pós-graduação tem critério de aprovação o aluno ter nota maior ou igual a "C" (conforme estudado no [Laboratório 7](https://github.com/juliodosreis/MC302EF-18S1/blob/master/LAB07/enunciado.md)). Armazenene as notas na classe `Disciplina` e preencha as notas usando valores aleatórios. Você pode definir um método que dar a nota para todos os alunos matriculados na disciplina.

## 3. Tarefas

* Hierarquia de pessoa e tipo de alunos;
* Refatoração de `MeuArray`;
* Hierarquia de disciplina e aluno;

## 4. Submissão
Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)).
Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.
Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB8-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na seção correspondente para esse laboratório na disciplina MC302.

**Data de entrega:** Dia 7/06/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (12/06 às 23:59h), valendo 60% da nota.


## 5. Critérios de avaliação
**Peso do lab:** 3

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:
* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e identação do código.

Critérios específicos:
- Hierarquia de pessoa e tipo de alunos (3pts);
- Refatoração de `MeuArray` (3,5pts);
- Hierarquia de disciplina e aluno (3,5pts).


**Nota final:** Soma dos critérios específicos.
