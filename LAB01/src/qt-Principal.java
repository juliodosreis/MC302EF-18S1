		// TODO: Incorporar instanciamentos e testes no método main da classe Principal
		Funcionario func1 = new Funcionario(1, "Arthur", "51051051099");
		Aluno aluno1 = new Aluno(500001, "joão", "11122233399", 40);

		func1.imprimeDados();
		func1.setMatricula(-2);
		func1.setNome("Ar");
		func1.setCPF("123");
		System.out.println( "Funcionario modificado(?): ");
		func1.imprimeDados();

		aluno1.imprimeDados();
		aluno1.setMatricula(-1);
		aluno1.setNome("J");
		aluno1.setCPF("12345");
		aluno1.setCurso(-3);
		System.out.println( "Aluno modificado(?): ");
		aluno1.imprimeDados();

