
public class aula2 {

	public static void main(String[] args) {
		int idade =19;
		double altura = 1.60;
		
		if (idade > 18 || altura >= 1.60) {
			System.out.println("Competirá"); 
		}
		else {
			System.out.println("Nao competirá");
		}
	
		String resposta = idade >18 || altura >=1.80 ? "Competirá":"Nao competira";
		}
		
}
