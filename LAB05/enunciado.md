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
# LABORATÓRIO 05


## 1. Objetivos

Este laboratório tem os seguintes objetivos de aprendizagem:
- Praticar conceito de Herança e outros tipos de relacionamento entre classes;
- Praticar o manuseio de diferentes tipos de visibilidade. 


## 2. Descrição

Você precisa especificar a hierarquia das classes de alunos, pois seu software pode querer tratá-los em diferentes níveis de abstração. Pode ser que para um futuro módulo do software direcionado à secretaria de pós-graduação importe o coeficiente de rendimento (CR) e a proeficiência em inglês do aluno, porém para um outro módulo, de cadastro em eventos da universidade, por exemplo, seja apenas necessário saber se um determinado aluno está ativo, seu nome e cpf.

Este laboratório visa trabalhar especificidades de cada tipo de aluno, começando pelo geral (`Aluno`) e encaminhando-se para alunos de graduação, mestrado e doutorado. Além de tratar dos vinculos entre alunos e disciplinas.

> **Nota**: Nos códigos fornecidos pelo Laboratório você encontrará comentários com a flag `TODO:`; esta flag é comumente destacada por IDEs e utilizada durante o desenvolvimento para encontrar facilmente o que precisa ser feito no código. Em geral essas marcações indicarão a necessidade de remoção de um trecho de código cuja finalidade era apenas o entendimento do funcionamento (*debug*), mas também há indicações do que precisa ser desenvolvido por você.

### 2.1. Pacote `mc302ef`
A classe `GerenciadorAlunos` do pacote `mc302ef` fornece três métodos importantes, sendo: `getListaAlunos()`, `getAnoIngressoRandom()` e `getDisciplinasPorCpfAluno()`. O primeiro gera informações sobre alunos que devem ser instanciados para testar seu software.
O segundo gera números de "ano de ingresso" aleatórios entre a faixa 2014 a 2018. Suas utilizações serão descritas em seguida.
Por último, o método `getDisciplinasPorCpfAluno()` fornece informações sobre em que disciplinas os alunos (diferenciados aqui pelo CPF) devem ser inscritos.

### 2.2. Classe `Aluno`

A classe `Aluno` deve conter mais dois atributos (para além dos que já foram especificados): Ano de ingresso e ano (prazo) limite para integralização do curso. Os limites para integralização do curso variam e serão informados nos tópicos específicos das classes de graduação, mestrado e doutorado, pois suas verificações devem estar implementadas nas respectivas classes. Usaremos valores independentes de curso por questões práticas. Ou seja, por exemplo, Bacharelado em Ciência da Computação tem o mesmo limite que Bacharelado em Matemática.

Especificações e restrições sobre os atributos adicionados à classe `Aluno`:
- O ano de ingresso: 
  - Seja inicializado no construtor, sem ser recebido por parâmetro, utilizando `GerenciadorAlunos.getAnoIngressoRandom()`.
  - Somente deve ser manuseado pela própria classe `Aluno`;
- O ano limite de integralização:
  - Seja passível de ser manuseado diretamente pelas classes filhas (e pela própria classe `Aluno`);
- Lista de `Disciplinas` que o aluno está matriculado.


### 2.3. Classe `AlunoGraduacao`

A classe que representa os alunos de graduação deve conter um método para calcular o ano limite de integralização (conclusão) com **7 anos a partir do ano de ingresso**. Além disso, a classe deve conter um construtor que garanta que todos os atributos de um aluno de graduação sejam iniciados corretamente. Lembre-se que além do instante de inicialização do objeto, podem haver outros momentos em que seja necessário (re)calcular essa data limite, portanto garanta que este mecanismo seja acessível ao sistema como um todo.

Resumo:
- Criação do método `calculaAnoMaxIntegralizacao()`;
- Construtor garantindo inicialização de todos os atributos que um aluno de graduação deve possuir.


### 2.4. Classe `AlunoPos`

O regulamento da pós-graduação exige a comprovação de proeficiência na língua inglesa, os requisitos em cada categoria (mestrado e doutorado) para essa comprovação são diferentes. Garanta que haja um atributo chamado `isInglesComprovado` informando se o aluno de pós já cumpriu esse requisito.

Outro requisito do programa de pós é a aprovação no exame de qualificação, no mestrado chamado de Exame de Qualificação de Mestrado (EQM) e no doutorado Exame de Qualificação Específico (EQE). Para esse caso, declare o atributo `isExameQualificacaoAprovado`.

Ambos os atributos devem ser visíveis para as subclasses de `AlunoPos`. As regras específicas devem ficar a cargo de cada tipo de vínculo: mestrado ou doutorado, garanta que **somente os métodos que representam essas entidades específicas alterem estes valores**, apesar dele poder ser consultado publicamente via classe `AlunoPos`.

> Obs: A implementação destas regras/validações não será requisitada neste laboratório.

Especificações e restrições sobre os atributos e métodos da classe `AlunoPos`:
- Atributo `isInglesComprovado`;
- Atributo `isExameQualificacaoAprovado`; e
- Métodos pertinentes à modelagem da classe segundo as restrições descritas.


### 2.5. Classe `AlunoMestrado` e `AlunoDoutorado`

Duas classes, uma representando alunos de mestrado e outra de doutorado devem ser modeladas nesta etapa. Como todas as pessoas vinculadas ao programa de pós-graduação devem ter seus dados válidos no sistema, certifique-se que os atributos das superclasses sejam inicializados corretamente.

Nessas classes, crie métodos que manuseiem os atributos `isInglesComprovado` e `isExameQualificacaoAprovado`, permitindo que estes sejam alterados.
A ideia é que futuramente sejam implementadas as respectivas regras específicas para validação de cada tipo de aprovação, porém, por hora faça o método receber apenas um `boolean` que diga se foi aprovado ou reprovado e altere os atributos conforme este parâmetro.

> Você pode usar a flag `TODO: ` em um comentário de código para lembrar a si mesmo de que este é um método incompleto, esperando por futuras modificações.

Assuma que o prazo para integralização do curso para alunos de **mestrado seja de 3 anos**, e para os de **doutorado seja de 6 anos**.

Especificações e restrições sobre os métodos da classe `AlunoMestrado` e `AlunoDoutorado`:
- Método para **alterar** o atributo `isInglesComprovado`; e
- Método para **alterar** o atributo `isExameQualificacaoAprovado`;
- Método `calculaAnoMaxIntegralizacao()`, que calcula a data (ano) máxima de integralização a partir do ano de ingresso e regulamento da pós.

> **Nota**: A modelagem do sistema está restrita aos conhecimentos de POO vistos até o momento. É importante lembrar que até o final da disciplina modelagens e soluções mais adequadas utilizando novos conceitos serão requisitadas. Dessa forma, suas classes provavelmente poderão ser refatoradas alcançando os padrões desejáveis.    
 
### 2.6. Classe `Disciplina`

A classe `Disciplina` deve ser refatorada a fim de armazenar uma lista de alunos inscritos. Porém, diferentemente do Laboratório 03 a lista deve conter instâncias de `Aluno`. Para evitar confusões, este Laboratório fornece uma [base de código da classe `Disciplina`](src/Disciplina.java), nele você deve incluir um atributo para armazenar os alunos inscritos na disciplina, assim como métodos para adicionar e remover alunos.

O relacionamento entre `Aluno`e `Disciplina` faz com que seja desejável manter uma lista de alunos inscritos como atributo de `Disciplina` e uma lista de disciplinas como atributo de `Aluno`. Desta forma, seu software precisa garantir que ao adicionar/remover um aluno de uma disciplina, ambos os atributos (das duas classes) sejam alterados corretamente. Pense em como garantir esta propriedade.

Especificações e restrições sobre os atributos e métodos da classe `Disciplina`:
- Atributo para listar alunos inscritos na disciplina;
- Método para adicionar/remover aluno na disciplina.
  - Não esqueça de adicionar/remover a disciplina na lista de disciplinas cursadas pelo aluno.
- Demais alterações do código marcadas pela flag "TODO: "

### 2.7. Classe `Principal`

Utilizar a estrutura disponível no [código de apoio](src/quote-Principal.java#L7) (método `testaInclusaoAlunos()`) para instanciar diferentes tipos de alunos (de graduação, mestrado e doutorado), conforme dados fornecidos pelo método `getListaAlunos()` da classe `mc302ef.GerenciadorAluno`.

Observe trechos principais do código de apoio para tratar os dados recebidos pelo `GerenciadorAlunos`:

```java
ArrayList<String[]> infoAlunos = GerenciadorAlunos.getListaAlunos();
for (String[] campo : infoAlunos) {
	// ...
	if (vinculo.equalsIgnoreCase(GerenciadorAlunos.GRADUACAO) ) {
		// ...
	}
	// ...
}
```

Utilizar a estrutura disponível no [código de apoio](src/quote-Principal.java#L64) (método `testaInscricaoEmDisciplinas()`) para inscrever os alunos em suas respectivas disciplinas, conforme dados fornecidos pelo método `getDisciplinasPorCpfAluno()` da classe `mc302ef.GerenciadorAluno`. Conforme ilustra o código abaixo:

```java
ArrayList<String[]> infoAlunos = GerenciadorAlunos.getDisciplinasPorCpfAluno();
String cpfAluno;
int idDisciplina;

for (String[] params : infoAlunos) {
	cpfAluno = params[0];
	for (int i = 1; i < params.length; i++) { // Do segundo em diante são IDs de disciplinas
		idDisciplina = Integer.paseInt( params[i] );
		// TODO: Vincular aluno e disciplina
	}
}
```

Utilize o procedimento do [Laboratório 03](../LAB03/enunciado.md) para obter as informações sobre as disciplinas. Um exemplo:

```java
String[][] disciplinasInfo = GerenciadorDisciplinas.getDisciplinas();
int discId;
String discNome;

// Exemplo de como recuperar informações da primeira disciplina:
discId = Integer.parseInt(disciplinasInfo[0][GerenciadorDisciplinas.ID]);
discNome = disciplinasInfo[0][GerenciadorDisciplinas.NOME];
```
> Note que as marcações de `TODO: ` estão mais presentes no código de apoio da classe Principal. Elas podem ajudar no desenvolvimento das tarefas.

## 3. Tarefas
- Criação de dois atributos inteiros na classe `Aluno` para armazenar:
  - O ano de ingresso.
  - O ano limite de integralização.
  - Lista de `Disciplinas`;
- Alteração da classe `Disciplina` para armazenar lista de alunos inscritos na disciplina;
- Criação da classe `AlunoGraduacao`:
  - Criação do método `calculaAnoMaxIntegralizacao()`.
- Criação da classe `AlunoPos` com os seguintes atributos:
  - `isInglesComprovado` e `isExameQualificacaoAprovado`;
- Criação da classe `AlunoMestrado` e `AlunoDoutorado`, com:
  - Método para alterar o atributo `isInglesComprovado`.
  - Método para alterar o atributo `isExameQualificacaoAprovado`.
  - Método `calculaAnoMaxIntegralizacao()`;
- Alteração dos métodos de apoio da classe Principal.
  
> Os nomes indicados devem ser utilizados para facilitar a correção do laboratório. Os nomes de atributos e métodos não indicados devem ser o mais explicativos possível afim tanto de garantir legibilidade do código como a individualidade do desenvolvimento.

## 4. Submissão
Submeta o trabalho utilizando o ambiente Google classroom ([googleapps.unicamp.br](https://googleapps.unicamp.br)).
Inclua como comentário seu nome e seu RA além de uma breve descrição dos objetivos do seu programa, as entradas e as saídas esperadas. Documente sua solução através de comentários ao longo do seu programa e indente corretamente o seu código para melhor legibilidade.
Comprima os arquivos dessa atividade no formato .tar.gz e nomeie-o `LAB5-000000.tar.gz`, trocando "000000" pelo seu número de RA. Submeta o arquivo na seção correspondente para esse laboratório na disciplina MC302. **Lembrando que o cumprimento do padrão de nome e formato de arquivo** faz parte da organização do trabalho e implica diretamente na nota.

**Data de entrega:** Dia 23/04/2018 até às 23:59h.

> É tolerada a entrega em até 5 dias após a data padrão (28/04 às 23:59h), valendo 60% da nota.


## 5. Critérios de avaliação
**Peso do lab:** 2

Critérios gerais:

Os seguintes critérios de avaliação serão analisados:
* Consideração do enunciado e das tarefas definidas;
* Uso adequado de POO para a solução proposta;
* Organização e identação do código.

Critérios específicos:
- Alterações na classe `Aluno` (1pt);
- Alterações na classe `Disciplina` (1pt);
- Modelagem e implementação das classes:
  - `AlunoGraduacao` (1pt),
  - `AlunoPos` (2pts),
  - `AlunoMestrado` (1,5pts) e
  - `AlunoDoutorado` (1,5pts);
- Alterações na classe `Principal` (1pt);
- Uso coerente dos conceitos de POO, indentação e organização do código (1pts).

**Nota final:** Soma dos critérios específicos. 
