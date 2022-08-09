
# Estrutura Condicionais (IF/ELSE).

A estrutura condicional if/else permite ao programa avaliar uma expressão como sendo verdadeira ou falsa e, de acordo com o resultado dessa verificação, executar uma ou outra rotina.

Na linguagem Java o tipo resultante dessa expressão deve ser sempre um boolean, pois diferentemente das demais, o Java não converte null ou inteiros como 0 e 1 para os valores true ou false.

Sintaxe do if/else:
----------------------------------------------------
	public static void main(String[] args) {
  
    [x] Idade definida como 16.
		int idade = 16; 
    
    [x] Impondo que acompanhado seja verdadeiro
		boolean acompanhado = true; 
    
    [x] Verificando se idade(16) é igual ou maior que 18 ou se o menor de idade está acompnhado.
		if (idade >= 18 || acompanhado) {
    [x] Caso uma das condições sejam verdadeiras o programa irá emitir a mensagem abaixo
			System.out.println("Seja bem vindo! ");
    [x] Caso as duas condiçoes sejam falas o programa irá emitir a mensagem abaixo
		} else {
			System.out.println("Menor de idade");
		}
	} 
  ![image](https://user-images.githubusercontent.com/54123623/183664425-bd9f858d-2a36-4c04-8931-56cfed3e402c.png)

