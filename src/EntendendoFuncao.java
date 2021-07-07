
public class EntendendoFuncao {
	
	public static void saudacao() {
		System.out.println("Olá, tudo bem?");
	}
	
	public static void elogia(String nome){
		System.out.println("Você é muito legal, " + nome);
		nome = "";
		System.out.println("Dentro da funçao, o argumento nome contem: " + nome);
	}
	
	public static void main(String[] args) {
		elogia("José");
		String identificacao = "Cleiton";
		elogia(identificacao);
		System.out.println("Aqui na main a variavel identificacao contem:" + identificacao);
	}
	
}
