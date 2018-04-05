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
# LABORATÓRIO 04

## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
* Praticar o conceito de herança;


## 2. Descrição

Iremos organizar nossas classes do domínio de universidade para obtermos um desenvolvimento ordenado ao longo do semestre. Primeiramente, adicione um atributo salário à classe `Funcionario` do laboratório anterior. Em seguida, adicione uma classe `Professor` que contenha todos os mesmo atributos e comportamentos da classe `Funcionario`, mas a classe `Professor` precisa armazenar uma lista de IDs de disciplinas que o professor leciona. Quando criar instâncias da classe `Professor`, você deve adicionar IDs de disciplinas (de maneira simulada), ou seja, IDs que não necessariamente representam disciplinas (note que não é uma lista de objetos da classe disciplina). Os IDs são apenas para o propósito de testar a implementação da classe `Professor`.  

Considerando as classes `Aluno`, `Funcionario` e `Professor`, é importante que não haja replicação de atributos e métodos nessas classes. Elabore uma maneira de melhor organizar essas classes de forma a haver um generalização conceitual delas. Possívelmente, uma nova classe `ClasseP` deve ser criada. Defina um nome adequado para a classe `ClasseP`. O nome da classe é importante para entender o que ela representa. Note que apenas apenas funcionários possuem salário. 

Podemos extender qualquer classe em Java, contanto que essa classe não seja `final`. Em particular, podemos extender a classe `ArrayList` para adicionar um comportamento que seja conveniente as necessidades do desenvolvedor embora a classe `ArrayList` seja genérica o bastante para atender diversas funcionalidades. O exemplo a seguir apresenta como extender a classe `ArrayList`. A classe `MeuArray` é uma lista de `Fruta`.

```java
	...
	public class MeuArray extends ArrayList<Fruta> {
		...
	}
	...
``` 

Queremos criar uma lista de objetos da classe `ClasseP`. Para isso, defina uma classe `MeuArray` que extende `ArrayList`, você iriá usar instâncias dessa classe para armazenar objetos da classe `ClasseP`. Crie vários objetos da classe `Aluno`,  `Funcionario`, `Professor` e os armazene em uma **mesma** instância de `MeuArray`. 

Ordene os objetos de modo que eles estejam armazenados em ordem alfabética de nome na lista. Para esse fim, deve-se implementar um método na classe `MeuArray` para fazer a ordenação. Note que a classe `ArrayList` já tem um método `sort`, mas esse método não deve ser usado. Uma referência sobre comparação de strings pode ser encontrada [aqui](https://docs.oracle.com/javase/tutorial/java/data/comparestrings.html).

A título de exemplo, considere que uma classe `Banana` (subclasse) herda de uma classe `Fruta` (superclasse). Instanciamos um objeto de `Fruta`, mas queremos verificar se esse objeto também é uma instância de `Banana`. O operador `instanceof` permite verificar se um dado objeto é instância de uma determinada classe. O exemplo abaixo apresenta como usar `instanceof` para verificar se um objeto é instância de uma determinada classe.

```java
	...
	Fruta fruta = new Banana();

	if(fruta instanceof Banana){
		((Banana) fruta).descascar();
	}
	...
```

Depois de ordenar a lista de objetos da classe `ClasseP`, seu software deve imprimir as informações de cada objeto armazenado no vetor. Note que as informações de aluno, funcionário e professor podem ser impressas de maneira diferente. Por exemplo, professor possui uma lista de IDs de disciplinas. **Faça todas as tarefas sem sobrescrever métodos**.

## 3. Tarefas
* Alteração da classe `Funcionario`;
* Implementação da classe `Professor`;
* Implementação da classe `ClasseP`;
* Extensão da classe `ArrayList` via a classe `MeuArray`;
* Implementação do método de ordenação na classe `MeuArray`;
* Impressão dos dados dos objetos armazenados em uma instância da classe `MeuArray`.

## 4. Submissão

Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)). Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.

Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB4-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na tarefa correspondente para esse laboratório na disciplina MC302.

**Data de entrega:** Dia 11/04/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (16/04/2018 às 23:59h), valendo 60% da nota.

## 5. Critérios de Avaliação

**Peso do lab:** 1

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:

* Consideração do enunciado e das tarefas definidas;

* Uso adequado de POO para a solução proposta;

* Organização e identação do código.

Critérios específicos:
* Alteração da classe `Funcionario`(0.5pts);
* Implementação da classe `Professor`(2pts);
* Implementação da classe `ClasseP`(4pts);
* Extensão da classe `ArrayList`(1pts);
* Implementação do método de ordenação(1pts);
* Impressão dos dados dos objetos armazenados em uma instância da classe `MeuArray`(1.5pts).


**Nota final:** Soma dos critérios específicos.

