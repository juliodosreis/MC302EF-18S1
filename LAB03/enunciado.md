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
# LABORATÓRIO 03

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
 * Entender as classes `Array` e `ArrayList` e suas diferenças;
 * Praticar o manuseio de dados utilizando essas classes.

## 2. Descrição

O software da universidade que você está desenvolvendo receberá informações de um sistema legado. Listas de: **disciplinas** (IDs e nomes) e **alunos** (números de matrículas) devem ser recebidas desse sistema. Adicionalmente, uma relação de matrículas de alunos (identificador de cada aluno), que estão presentes no sistema legado mas já foram desmatriculados na universidade, será fornecida e seu software precisa remover suas inscrições (desvinculá-los das disciplinas).

Nesse sistema legado, há uma classe **GerenciadorFuncionarios** para o cadastro de funcionários. Essa classe permite importar nomes e CPFs de funcionários e seu software deve instanciar objetos `Funcionario`a partir dessas informações. A cada execução do programa, o `GerenciadorFuncionarios` do sistema legado gera uma quantidade diferente de funcionários (retornados via o método `getNextFuncionario()`). Seu sofware precisa tratar essa dinamicidade do problema minimizando o custo de memória, isto é, não é adequado alocar um vetor com uma grande quantidade de posições, já que não se sabe o tamanho necessário para a estrutura que armazenará as instâncias de funcionários (veja subitem 2.4).

### 2.2 Classe Disciplina
Uma classe chamada **Disciplina** deverá ser modelada, de forma a armazenar pelo menos o id e nome da disciplina, o número maximo de alunos (valor único igual a **25**, válido para todas as disciplinas) e a lista de matrículas dos alunos inscritos na disciplina. 

**IMPORTANTE**: A lista retornada pelo sistema legado **não é uma lista de objetos `Aluno`**, e sim uma lista das matrículas (`int`) dos alunos inscritos nas disciplinas. Sempre que este enunciado se referir a "lista de alunos" estará se referindo a lista de matrículas desses alunos.

As instruções de como importar os alunos de cada disciplina encontram-se no subitem (2.4). Ou seja, **não se deve instanciar objetos `Aluno`** dentro de `Disciplina` (ou em qualquer outro ponto deste laboratório).

É necessário definir métodos para adição e remoção de matrículas de alunos (inscrições na disciplina), impressão dos dados da disciplina, além de `getter/setter` para o nome da disciplina.

O id da `Disciplina` deve ser imutável e **recebido como parâmetro na criação do objeto `Disciplina`**. Durante essa criação, a lista de matrículas de alunos na disciplina deve ser inicializada com tamanho igual ao "número máximo de alunos" fixado para todas as disciplinas. Note que inicialmente essa lista deve estar "vazia" (ou seja, as matrículas **não** devem ser passadas durante a criação de objetos `Disciplina`). Posteriormente, para inscrever os alunos em uma disciplina, utilize o **método de adição de matrículas** que deve ser definido no seu software.

A lista de matrículas de alunos de cada disciplina deve ser mantida constantemente ordenada de forma crescente. Seu software deve garantir que esta propriedade seja mantida após qualquer alteração na lista (operações de adição ou remoção). 

Além disso, o método de impressão de dados da disciplina deve exibir nome e id da disciplina seguido dos números de matrícula dos alunos. Implemente o seguinte formato de saída:

```
NomeDaDisciplina(IdDaDisciplina)
[matricula1, matricula2, matricula3, ..., matriculaN]
```
Por exemplo (fictício):
```
DisciplinaIV(109)
[180001, 180002, 180003]
```

Considere os seguintes elementos na implementação:

  1. Classe disciplina;
  2. Atributos mínimos: id, nome da disciplina, matrículas de alunos inscritos, número máximo de alunos por disciplina;
  3. Métodos mínimos: getNome, setNome, addAluno, removeAluno, imprimeDados;
  4. Funcionalidades: Manter matrículas de alunos ordenados (ordem crescente) para cada disciplina instanciada.
  
**Dica**: Explore o uso de métodos da classe [`Arrays` (Arrays API](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html)) que manipulam objetos `Array`, como `binarySearch()`, `copyOfRange()`, `sort()`, `toString()` etc . Lembrando que a declaraço para [objetos `Array` em Java](https://www.caelum.com.br/apostila-java-orientacao-objetos/um-pouco-de-arrays/#o-problema) pode ser feita como nos exemplos seguintes:
```java
// Para tipos primitivos, por exemplo int:
int[] arrayInt = new int[10];
// Para referenciar objetos, como String:
String[] arrayString = new String[10];
```

### 2.3 Uso do Pacote `mc302ef`
Os procedimentos referentes à importação das disciplinas e matrícula de alunos podem ser acessados pelo pacote [`mc302ef`](src/mc302ef.jar), disponível em um arquivo `.jar`, que deve ser importado ao seu projeto para utilização.

Instruções para importação no Eclipse:
1. Clique com botão direito no projeto (aba `Package Explorer`) e selecione `Propriedades`;
2. Na listagem à esquerda clique em `Java Build Path`;
3. À direita clique na aba `Libraries`;
4. Clique no botão `Add External JARs...` e selecione o arquivo `mc302ef.jar`.

Há também este [vídeo](https://www.youtube.com/watch?v=UtzAf8tyuAM) demonstrando o processo.

### 2.4. Tratamento dos dados fornecidos
A Classe `GerenciadorDisciplinas` do pacote `mc302ef` fornece as disciplinas existentes no sistema legado através dos método `getDisciplinas()`.

O método retorna um objeto do tipo `String[][]` (Array multidimensional).
Os alunos em cada disciplina podem ser obtidos via o método `getAlunosPorDisciplina(int disciplinaID)`. 
As matrículas dos alunos que devem ser removidos para cada disciplina são fornecidas pelo méodo `getAlunosARemover()`.

> Há alunos a serem removidos em todas as disciplinas.

O código abaixo apresenta o uso dos métodos estáticos da classe `GerenciadorDisciplinas` e como os dados retornados por eles podem ser tratados (explicitando seus tipos e significados). 

Considere que as disciplinas instânciadas precisam ser armazenadas em memória em uma lista dinâmica.

```java
import mc302ef.GerenciadorDisciplinas
//...
    String[][] disciplinas = GerenciadorDisciplinas.getDisciplinas();

    // Estrutura da lista de disciplinas retornada:
    String[] primeiraDisciplina = disciplinas[0];

    int discId = Integer.parseInt(primeiraDisciplina[0]);
    String discNome = primeiraDisciplina[1];

    // Exemplo de criação de objeto Disciplina (Classe a ser implementada)
    Disciplina disc = new Disciplina(discId, discNome);

    // Recebimento de lista de alunos por disciplina
    int[] matriculasAlunos = GerenciadorDisciplinas.getAlunosPorDisciplina(discId);

    // Remoção de alunos
    int[] alunosARemover = GerenciadorDisciplinas.getAlunosARemover();

```

No caso dos funcionários, deve-se usar a classe `GerenciadorFuncionarios` do pacote `mc302ef`. O método `getNextFuncionario()` deve ser utilizado para ler as tuplas `(nome, CPF)` (em forma de `String[]`), até que o método retorne `null`. Como segue o seguinte exemplo e o [código de referência](src/quote-Principal.java):

```java
import mc302ef.GerenciadorFuncionarios;
//...
    GerenciadorFuncionarios sim = new GerenciadorFuncionarios();
	String[] funcionario_info;
	String nome, cpf;

	while ( (funcionario_info = sim.getNextFuncionario()) != null) {
		nome = funcionario_info[GerenciadorFuncionarios.NOME];
		cpf = funcionario_info[GerenciadorFuncionarios.CPF];

```

Deve-se instanciar os funcionários importados do sistema legado e criar uma estrutura de dados para armazená-los (Lembrando que em cada execução o simulador retornará quantidades diferentes de funcionários a serem cadastrados, a quantidade só pode ser determinada em tempo de execução).

A estrutura de dados que armazena os funcionários pode ficar dentro do próprio método `main` da classe `Principal`, como indicado no [trecho de código de apoio](src/quote-Principal.java#L47). 

## 3. Tarefas
1. Modelar e implementar classe `Disciplina`;
2. Criar as disciplinas fornecidas pelo pacote `mc302ef` (Classe `GerenciadorDisciplinas`) e adicionar seus respectivos alunos;
3. Remover das listas de matrículas das disciplinas aqueles alunos listados por `GerenciadorDisciplinas.AlunosARemover()`;
4. Armazenar em memória as disciplinas instânciadas em uma estrutura de dados coerente com o contexto do problema.
5. Armazenar em memória funcionários fornecidos pela Classe `GerenciadorFuncionarios` em uma estrutura de dados coerente com o contexto do problema.

## 4. Submissão
Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)).
Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.
Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB3-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na seção correspondente para
esse laboratório na disciplina MC302.

**Data de entrega:** Dia 04/04/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (09/04 às 23:59h), valendo 60% da nota.


## 5. Critérios de avaliação
**Peso do lab:** 1

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:
* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e indentação do código.

Critérios específicos:
- Modelagem e implementação da classe `Disciplina` (1pts);
- Tratamento das listas de cursos e disciplinas e seus alunos (3pts);
- Remoção de alunos indicados e exibição em tela de matrículas por disciplina (3pts);
- Armazenamento eficiente da lista de funcionários fornecidos (2pt);
- Uso coerente dos conceitos de POO, indentação e organização do código (1pts).


**Nota final:** Soma dos critérios específicos.

[lista_exclusao]:src/lista_exclusao.csv
