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
# LABORATÓRIO 09

## 1. Objetivos

Este laboratório tem o seguinte objetivo de aprendizagem:
 * Praticar os conceitos de Interfaces em POO.

## 2. Descrição
Interfaces em POO estabelecem "contratos" em que as obrigações **do que deve ser feito** são descritas nas interfaces, e **como serão feitas** é estabelecido pelas classes que "assinarem" (implementam) tal contrato.

Este elemento do paradigma de POO viabiliza pelo menos duas grandes vantagens:  
1. O compartilhamento de uma mesma forma de comunicação (lembre-se que os métodos declarados em Interfaces são sempre públicos e abstratos) para um determinado fim conhecido, entre classes sem a necessidade de uma relação semântica clara.
2. Herança múltipla de tipos. Um objeto pode ser tratado não apenas como uma das entidades da cadeia de herança, mas como uma classe que assinou um contrato, garantindo determinado comportamento.

Utilizaremos o conceito de Interface em POO para explorar melhores modelagens correlacionadas com o sistema de gestão universitária.

## 2.1 Interface Imprimivel
No sistema em desenvolvimento há classes que foram modeladas com o método `imprimeDados()`. Faça com que esse método seja um contrato de comportamento de uma nova Interface, chamada `Imprimivel`. Encontre uma forma efetiva de garantir a implementação dessa capacidade, de acordo com o paradigma de POO. Analise as classes já desenvolvidas que precisam ser refatoradas e devam implementar a interface `Imprimivel`. Adicionalmente, implemente na classe `Curso` a impressão de:  
- Nome;
- Carga horária máxima
- Quantidade atual de alunos; e
- Quantidade atual de disciplinas.

## 2.2 Interface Enumerável

A classe `RepositorioDeCursos` (desenvolvida  no [Laboratório 06](../LAB06/enunciado.md)) contém a listagem dos cursos disponíveis na instituição. Até então definimos métodos para inserção, busca e remoção de cursos do repositório. Caso tenhamos que iterar por todos os cursos do repositório seria natural implementar um método `getCursos()` que retorna a lista de cursos, e então utilizar algo como:

```java
ArrayList<Curso> cursos = RepositorioDeCursos.getCursos();
for (Curso curso : cursos) {
	// ...
}
```
O requisito é que seja possível enumerar os objetos da classe `Curso` obtendo seu conteúdo principal (instâncias de `Curso`), utilizando uma estrutura padrão do Java chamada enumeração.

Faça com que a classe `RepositorioDeCursos` implemente as propriedades de enumeração, da interface disponível no [pacote `java.util`](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html). A interface declara dois métodos: (i) um que entrega o próximo elemento; e (ii) outro que testa se ainda há elementos.

Similarmente, a classe `Disciplina` (ou suas especificações, na prática)  armazena objetos da classe `Aluno`. Modifique a classe `Disciplina` para que ela implemente as propriedades de enumeração dos objetos da classe `Aluno`. 


```java
// Rascunho de navegação por elementos principais de uma classe enumerável:

Elemento elemento;
while( ... ) {	// Enquanto houver mais elementos
	elemento = ...; // Obtém o próximo elemento
}
```

> **Nota:**  
> **Outra** interface muito utilizada é a `Iterable`. Você pode saber mais sobre ela na [documentação do pacote pacote `java.util`](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html) e ler sobre suas diferenças em [uma página](https://stackoverflow.com/questions/948194/difference-between-java-enumeration-and-iterator) de um dos fóruns mais visitados na nossa área.  
> Um bom exercício é utilizá-la após este laboratório, `Iterable`é mais indicado na prática e resolve um dos problemas de `Enumerable` que vamos exemplificar neste laboratório. 


## 2.3 Interface Comparable no MeuArray

Retome o contexto da classe `MeuArray` conforme o seguinte:
> Uma extensão de `ArrayList` com método de ordenação válido para Alunos e Funcionários [Lab04].  
> O método de ordenação é especificado pelas classes especializadas [Lab08].

Entenda a interface [`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html).
> Esta interface obriga a implementação de um método `int compareTo(...)`, utilizado por padrão por outras classes padrões Java.  
> Listas (ou arrays) de classes que implementam `Comparable` podem ser ordenadas pelo método padrão `Arrays.sort()`, que [já estudamos](../LAB03/enunciado.md).  
> `Arrays.sort(instanciaDeClasseComparavel)`

Aplique os conceitos de Interface, da forma que achar mais adequada segundo boas práticas em POO. Garanta que as classes `AlunoGraduação`, `AlunoMestrado`, `AlunoDoutorado`, `Professor` e `Funcionario` sejam comparáveis, ordenados por matrícula.
Diferentemente, `Disciplina` e `Curso` precisam ser comparáveis por ordem lexicográfica.

### 2.3.1 Descontinuando a classe `MeuArray` (Extra)


Uma vez que este processo esteja completo, você pode simplesmente utilizar estruturas como ArrayList para armazenar objetos das classes refatoradas com implementação de `Comparable`, e ordená-las através do método Arrays.sort(), por exemplo. Excluindo-se casos específicos, seu sistema pode abrir mão da hierarquia de classes de `MeuArray`.
Porém ao invés de deletá-la diretamente, você pode exercitar o uso da [anotação `@Deprecated`](https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html), que sinaliza para o desenvolvedor que aquele código, seja método ou classe, será descontinuado em breve, além de fornecer informações de como proceder para continuar garantindo a execução do código.  
Você pode marcar a classe MeuArray, por exemplo, da seguinte forma:
```Java
/**
 * @deprecated
 * Essa classe será removida, utilize ArrayList.
 */
@Deprecated
public abstract class MeuArray<T> extends ArrayList<T> {
...
```

Faça isso e adicione comentários (no padrão javadoc, como exemplificado no link de referência) para que possíveis utilizadores do seu código possam atualizar a forma de usar seu sistema.

## 2.4 Classe principal

Na classe `Principal` utilize a nova propriedade das classes `RepositorioDeCursos` e `DisciplinaGraduacao`, da seguinte forma:  
1. Popular `RepositorioDeCursos` com um conjunto de objetos da classe `Curso` (no caso dos cursos insira de forma lexicamente desordenada, para salientar a diferença) e popular uma instância de `DisciplinaGraduacao` com objetos de `Aluno`;
2. Definir uma variável do tipo `Imprimivel` para explicitar o polimorfismo de tipo;
3. Percorrer os elementos principais de cada um (ou seja, `Curso` e `Aluno`, respectivamente), usando os métodos implementados sobre a enumeração (Note que será preciso instanciar um objeto RepositorioDeCursos para utilizar o método que não é estático), armazenando-os temporariamente na variável de tipo `Imprimivel`;
4. Imprimir os dados através do método garantido pela interface `Imprimivel`.


Exemplo:
```
...
Imprimivel imprimivel;
Para todo imprimivel (curso) do repositorioDeCurso {
	imprimivel.imprimeDados();
}
para todo imprimivel (aluno) da disciplina {
	imprimivel.imprimeDados();
}
...
```

Ordene os objetos da classe `Curso` em `RepositorioDeCursos` usando `Arrays.sort()` (crie um método público em `RepositorioDeCursos` que permita esta funcionalidade) e imprima novamente os objetos, cuja ordenação deve obedecer a ordem lexicográfica.  
> Solucione o problema de como iterar **novamente** um objeto que implementa `Enumerable`.

## 3. Tarefas

* Interface `Imprimivel`
* Interface de enumeração
* Interface `Comparable`
* Testes na classe principal


## 4. Submissão
Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)).
Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.
Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB9-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na seção correspondente para
esse laboratório na disciplina MC302.

**Data de entrega:** Dia 25/06/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (30/06 às 23:59h), valendo 60% da nota.


## 5. Critérios de avaliação
**Peso do lab:** 3

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:
* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e identação do código.

Critérios específicos:
- Interfaces:
  + `Imprimivel` (1pts);
  + Enumerável (3pts);
  + `Comparable` (4pts);
  + Testes (1pts).
- Aplicação de conceitos POO, organização e clareza (1pts).

**Nota final:** Soma das notas dos critérios específicos.
