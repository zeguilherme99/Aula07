
public class EntendendoFuncao {
	
	public static void saudacao() {
		System.out.println("Ol�, tudo bem?");
	}
	
	public static void elogia(String nome){
		System.out.println("Voc� � muito legal, " + nome);
		nome = "";
		System.out.println("Dentro da fun�ao, o argumento nome contem: " + nome);
	}
	
	public static void main(String[] args) {
		elogia("Jos�");
		String identificacao = "Cleiton";
		elogia(identificacao);
		System.out.println("Aqui na main a variavel identificacao contem:" + identificacao);
	}
	
}
