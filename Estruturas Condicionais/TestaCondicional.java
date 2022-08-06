
public class TestaCondicional {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoa = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
		}else if (quantidadePessoa >=2){
			System.out.println("Menor de idade, mas pode entrar, está acompanhado ");
		}else {
			System.out.println("Menor de idade");
		}
	}

}
