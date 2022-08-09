
public class TesteIR {

	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario >= 2800.0) {
			System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");

		} else if (salario >= 3751.0) {
			System.out.println("o IR é de 15% e pode deduzir R$ 350");
		} else {
			System.out.println("De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636");
		}

	}

}
