
# Estrutura Condicionais (IF/ELSE/SWITCH CASE/WHILE/FOR).

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
  
## SWITCH CASE

O condicional switch testa o valor contido em uma variável e o compara com os valores fornecidos em cada caso, representados pela palavra reservada case. Podemos ter quantos casos forem necessários na estrutura, e quando um dos valores corresponder ao da variável de teste, o código do caso será executado.

![image](https://user-images.githubusercontent.com/54123623/183676416-16f545d9-903a-4530-a318-94fecfce72c1.png)

## While
A estrutura while executa um bloco de instruções enquanto uma determinada condição for verdadeira (true). Neste caso, serão impressos os valores de 1 a 10, e depois quando a variável i possuir o valor 11 a condição do while será falso (false) e sua estrutura não é mais executada.

Na expressão condicional do while é possível utilizar qualquer operador de comparação (< [menor], > [maior], <= [menor ou igual], >= [maior ou igual], == [igual a] e != [diferente de]) e qualquer operador lógico (&& [and], || [ou]).

O while sempre precisará de uma expressão condicional que definirá quando o laço deve ser interrompido.

Sintaxe do while:
----------------------------------------------------

	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10){
			System.out.println(contador);
			contador +=1;
			
		}
		System.out.println(contador);
	}
![image](https://user-images.githubusercontent.com/54123623/183688402-b6cb7fde-8ec9-4471-aa56-ab98d9dfd34b.png)


## For

Executa a declaração e expressão de laço repetidamente, até que a condição da expressão se torne falsa.

Sintaxe do for:
----------------------------------------------------
ele é executado somente uma vez contador; condição booleana para saber se deve ou nao entrar dentro do for; o que deve ser executado no final da execução

No programa abaixo ele conta até 10:

	public static void main(String[] args) {
		for (int contador = 0; contador <=10; contador++) {
			System.out.println(contador);	
		}	
	}
![image](https://user-images.githubusercontent.com/54123623/183688304-ed7a2c8c-4692-4cb2-8c9c-25d3ee3e2ab0.png)

	
## Dicas 😎

main + ctrl + espaço
para gerar o método main

ctrl + shift + f
para formatar o código fonte

sysout + ctrl + espaço
para gerar a instrução System.out.println().




