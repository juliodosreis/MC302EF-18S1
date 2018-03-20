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
# LABORATÓRIO 02

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
* Uso de métodos e atributos estáticos;
* Uso de variáveis finais.

## 2. Descrição

### 2.1 Atributos e Métodos Estáticos

A classe é um modelo utilizado para criar objetos e descreve as características e ações que todo objeto desta classe possui. Para utilizar um método ou atributo de objeto, precisamos instanciar tal objeto de uma classe, mas existem atributos e métodos que não pertencem aos objetos. Métodos e atributos estáticos se diferenciam de outros tipos de métodos e atributos por pertencerem a classe e não ao objeto. Por exemplo, imagine que ao invés de o usuário da aplicação informar o número de matrícula do aluno, é preferível que quando um aluno for cadastrado a aplicação gere um número de matrícula automaticamente. O procedimento não é específico de cada objeto, mas pode ser definido com um comportamento geral da classe. 

Neste laboratório é necessário alterar a implementação das classes `Aluno` e `Funcionario`, do laboratório anterior, para que essas classes atribuam um número de matrícula para aluno e funcionário, respectivamente. Sua solução deve garantir que a mesma matrícula não seja atribuída para mais de um aluno e/ou funcionário. Note que ambos funcionários e aluno tem matrícula e não queremos que um funcionário e um aluno tenham a mesma matrícula. Considere criar uma classe com um método que retorna um número de matrícula único. Explore o uso de métodos e atributos estáticos para assegurar que o número de matrícula seja único. Como o atributo pertence a classe, todos os objetos desta classe terão acesso ao mesmo atributo.

### 2.2 Variáveis Finais

Uma variável final é uma variável que apenas pode-se ter um valor atribuído a ela uma única vez, ou seja, seu valor não pode ser redefinido. O seguinte trecho de código apresenta o uso correto de uma variável final pois podemos atribuir um valor para a variável final depois de termos a declarado:

```java
final int a = 45;
final int b;

b = sin(a)
```
O seguinte trecho de código apresenta um exemplo de uso incorreto de variáveis finais pois estamos reatribuindo `b` (a variável `b` recebe valores duas vezes):

```java
final int a = 45;
final int b;

b = sin(a)
b = cos(a)
```

Variáveis finais são uma boa ferramenta para evitar \"magic values\". Uma breve explicação sobre \"magic numbers\" pode ser encontrada [aqui](https://refactoring.guru/replace-magic-number-with-symbolic-constant). É uma boa prática escrever o nome de variáveis finais em caixa alta, isso facilita identificar essas variáveis no código. Por exemplo: 

```java
public class Aluno {
    //Todos os estados possíveis
    public static final int ATIVO = 1;
    ...
}
```


No exemplo acima, o atributo `ATIVO` está definido como estático e como público para que possamos utilizar seu valor na inicialização de um objeto da classe `Aluno`, ou em algum método de inicialização. Por exemplo:

```java
Aluno aluno = new Aluno(Aluno.ATIVO ...);

```
Altere a classe `Aluno` para representar o estado do aluno em relação a universidade: o aluno pode estar \"ativo\", \"inativo\", ou \"suspenso\". Modele cada um desses estados como uma variável final da classe `Aluno`. Apresente uma solução que permita armazenar o estado de um aluno na universidade cujo valor de tal atributo deve ser atribuído com o valor de uma variável final que você definiu. Você não precisa utilizar enumerações ou qualquer outro conceito que não foi aprendido em aula ainda. Na classe principal, instancie um objeto da classe aluno para cada estado e depois imprima os dados desses objetos.

## 3. Tarefas
* Alteração das classes `Aluno` e `Funcionario`, do laboratório anterior, para que essas classes usem um gerador de matrículas;
* Alteração da classe `Aluno` para representar o estado de um aluno em relação a universidade com o uso de variáveis finais;
* Implementação na classe `Principal` de testes para verificar se a implementação de `Aluno` e `Funcionario` estão corretas. Deverão ser instanciados três objetos da classe `Aluno`, um para cada estado, e três objetos da classe `Funcionario`. Verifique se todos esses objetos têm matrículas diferentes. 

Também faz parte da tarefa refletir sobre a melhor maneira de resolver o problema. Tente dar nomes significativos para as classes, atributos e métodos. Busque comentar no código mencionando o porquê de você estar fazendo algo ou o que aquilo faz, isto ajuda tanto outras pessoas lerem quanto você, caso tenha que voltar ao código no futuro.

## 4. Submissão

Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)). Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.

Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB2-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na tarefa correspondente para esse laboratório na disciplina MC302.

**Data de entrega:** Dia 26/03/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (31/03 às 23:59h), valendo 60% da nota.

## 5. Critérios de Avaliação

**Peso do lab:** 1

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:

* Consideração do enunciado e das tarefas definidas;

* Uso adequado de POO para a solução proposta;

* Organização e identação do código.

Critérios específicos:

* Nota 1 (implementação das tarefas):
    - Implementar corretamente o gerador de matrícula (não gera o mesmo número de matrícula duas vezes): 3pts;
    - Alterar a classe `Aluno` para usar o gerador de matrícula: 1pts;
    - Alterar a classe `Funcionario` para usar o gerador de matrícula: 1pts;
    - Alterar a classe 'Aluno' para representar os estados \"ativo\", \"inativo\", \"suspenso\": 3pts;
    - Instanciar objetos das classes `Aluno` e `Funcionario` e verificar se essas objetos tem matrículas diferentes: 2pts.

* Nota 2:
    - Indentação, clareza do código: 3pts;
    - Uso adequado dos conceitos de POO: 7pts.

**Nota final:** (Nota 1 + Nota 2) / 2.
