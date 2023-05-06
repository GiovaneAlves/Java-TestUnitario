package QA.DadosCadastrais;

	public class Validacao {	
		
		private String nome;
		private String cpf; 
		private int idade;
		
		public Validacao () {}
		
		public Validacao(String nome,String cpf,int idade) {
			this.nome = nome;
			this.cpf = Validacao.formatarCPF(cpf);
			this.idade = idade;
		}
	
		public static void validarNome (String nome) {
		 
			if (nome.trim().isEmpty()) 
	         throw new RuntimeException("O nome não pode ser vazio.");
			
			if (!nome.matches("^[\\p{L}\\s]+$")) {
			        throw new IllegalArgumentException("O nome não pode conter números ou caracteres especiais");
			    }
		}
			
				
		public static void validarCpf (String cpf) {
		
			if (cpf.trim().length()!= 11) 	
			 throw new RuntimeException("CPF inválido, tente novamente.");			
		}
		
		public static void validarIdade (int idade) {
			
			if (idade<0||idade>120) 
				throw new RuntimeException("Idade inválida!");
		}
	   
		public static String formatarCPF(String cpf) {
	       cpf = cpf.replaceAll("[^\\d]", ""); // remove tudo que não for dígito
	       cpf = cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	       return cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			Validacao.validarNome(nome);
			this.nome = nome;
		}

		public String getCpf() {
			this.cpf=Validacao.formatarCPF(cpf);
			return cpf;
		}

		public void setCpf(String cpf) {
			Validacao.validarCpf(cpf);
			this.cpf = cpf;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			Validacao.validarIdade(idade);
			this.idade = idade;
		}

		@Override
		public String toString() {
			return "Dados Cadastrais:  Nome:" + nome + "\t CPF:" + cpf + "\t Idade:" + idade + "";
		}
		
		
}