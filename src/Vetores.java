import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos alunos consumiram? ");
		int n = leitor.nextInt();
		double aluno[] = new double[n];
		double total;
		

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Por favor, digite o consumo do " + (i + 1) + " aluno");
			aluno[i] = leitor.nextDouble();
		}

		total = 0;

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("O aluno " + (i + 1) + " consumiu R$" + aluno[i]);
			total = total + aluno[i];
		}

		System.out.println("O total de consumo foi de R$" + total);

		leitor.close();

	}

}
