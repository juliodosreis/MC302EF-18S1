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
# LABORATÓRIO 01

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
 * Criação de projeto no [Eclipse](https://www.eclipse.org/downloads/), um ambiente de desenvolvimento integrado (IDE - _Integrated Development Environment_);
 * Uso inicial de linguagem de programação Java e conceitos de POO;
 * Declaração de classes, método construtor e métodos acessores (_getters_ e _setters_).

## 2. Descrição

Utilizando os conceitos do contexto acadêmico para o aprendizado de
Programação Orientada a Objetos, o LAB01 propõe a criação de duas classes: Aluno
e Funcionário, além da classe Principal.

Após intalação do IDE Eclipe e do Java Development Kit (JDK) (que contém o Java Runtime Environment - JRE), uma forma de criação de projeto é a seguinte:
1. `File -> New -> Java Project` (ou `File -> New -> Project`, e selecione `Java Project`);
2. Digite o nome do projeto (Ex: LAB01);
3. Na aba JRE provavelmente estará selecionado a última versão, caso contrário
selecione-a (Ex: JavaSE-1.8);
4. Finalize a criação (`Finish`).

Para criação de classes, podem ser efetuados os seguintes passos:
1. Clique com o botão direito no projeto listado na aba do Package Manager (à esquerda)
e escolha `New -> Class`;
2. Digite o nome da classe e finalize (Posteriormente as opções de criação serão abordadas,
facilitando criação de classes com herança ou características especiais).


### 2.1. Classe Aluno

O exemplo abaixo apresenta a declaração da classe [Aluno](src/Aluno.java "Aluno.java")
e seus atributos. Note que todas as variáveis são declaradas como privadas (**private**).
Note também a implementação dos métodos de acesso get() e set(), esses métodos são
comumente utilizados na linguagem Java para acessar os atributos dos objetos, e garantir
regras de alterações destes.

```java
public class Aluno {
    private int matricula;
    private String nome;
    private String cpf;
    private int curso;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("Matrícula inválida.");
        }
    }
}
```
Além disso a classe necessita de um método construtor, que deve receber como
argumentos os quatro atributos da classe, como segue:
```java
    public Aluno (int matricula, String nome, String cpf, int curso) {
        this.matricula = matricula;
        ...
    }
```
> As regras aplicadas nos métodos _setters_ são para efeito de ilustração, note
que valores indesejados podem ser atribuídos durante o instanciamento da classe
através dos argumentos do método construtor. Em geral, há uma camada de negócios
acima que garante a validade dos dados. Por hora este comportamento não será
tido como problemático.

Por fim, temos um método para ajudar na exibição dos dados dos alunos, chamado
`imprimeDados()`, que imprime em tela as informações do Aluno.
```java
    public void imprimeDados(){
        String saida = "########## Aluno\n";
        saida = saida + "Matrícula: " + getMatricula() + "\n";
        ...

        System.out.println(saida);
    }
```
Os atributos da classe Aluno e suas restrições, são:
- matricula: número inteiro **maior que zero**;
- nome: cadeia de caracteres de **tamanho pelo menos três**;
- cpf: cadeia de caracteres de **tamanho onze**;
- curso: número inteiro **maior que zero**.


### 2.2. Classe Funcionário

Baseando-se na classe **Aluno**, implemente a classe [Funcionário](src/Funcionario.java "Funcionario.java") com
os métodos _getters_ e _setters_ e `imprimeDados()`, além do construtor. Os atributos da classe
Funcionario e suas restrições, são:
- matricula: número inteiro **maior que zero**;
- nome: cadeia de caracteres de **tamanho pelo menos três**;
- cpf: cadeia de caracteres de **tamanho onze**.

### 2.3. Classe Principal
Na linguagem Java toda aplicação precisa de um método `main`, com a assinatura
`public static void main (String[] args)`, este método é similar à função `main` em `C`,
e é o ponto de entrada para a aplicação, aceitando argumentos "de linha de comando"
através do parâmetro `String[] args`.

Ex: `java sort -modo crescente`, onde "-modo" e "crescente" serão armazenados em
`args`, acessados respectivamente por `args[0]` e `args[1]`).

Apesar de no momento não utilizarmos este parâmetro é recomendável a leitura
sobre o método e o uso do argumento.

Crie uma nova classe chamada `Principal`, desta vez marcando a opção de gerar
automaticamente o método `main`. Dentro do método instancie alunos e funcionários
e teste seus métodos, como exemplificado no [código de apoio da classe Principal](src/qt-Principal.java "qt-Principal.java").

```java
    Aluno aluno1 = new Aluno(...);
    Funcionario func1 = new Funcionario(...);

    aluno1.setMatricula(...);
    func1.setMatricula(...);

```


## 3. Tarefas

* Configuração do ambiente (Eclipse + JDK);
* Criação do projeto e classes;
* Implementação nas classes Aluno e Funcionario dos métodos:
  * construtores;
  * _getters_ e _setters_;
  * `imprimeDados()`.
* Implementação da classe Principal com método `main()` executando testes dos métodos das
classes Aluno e Funcionario.

## 4. Submissão
Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)).
Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.
Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB1-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na seção correspondente para
esse laboratório na disciplina MC302.

**Data de entrega:** Dia 19/03/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (24/03 às 23:59h), valendo 60% da nota.


## 5. Critérios de avaliação
**Peso do lab:** 1

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:
* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e identação do código.

Critérios específicos:
- Construtores: n1 = 0.5 * x;
  - Cada construtor correto (_x_) vale 5pts.
- _Getters_ e _Setters_: n2 = max(0, 10 - (x+y) * 0.1);
  - Cada `get` e `set` incorreto (_x_ e _y_, respectivamente) implica em menos 1pt (10pt iniciais), nota mínima 0.
- `imprimeDados()`: n3 = 0.5 * x;
  - Cada método de impressão correto (_x_) vale 5pts.
- Identação, clareza do código e uso adequado dos conceitos de POO: n4 = x.
  - Identação (tab ou espaços), coerência no uso de conceitos POO, nomes e tipos de variáveis e métodos (_x_).

Obs: Os valores de _x_ e _y_ pertencem ao intervalo real [0, 10].

**Nota final:** (n1 + n2 + n3 + n4 ) / 4
