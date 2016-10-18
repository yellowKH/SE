import java.util.*;
public class Studienberatung{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hast du Abitur?");
		String answerOne = scanner.next();

if(answerOne.equals("n")){
		System.out.println("Hast du Fachabitur?");
		String answerTwo = scanner.next();
}
if(answerOne.equals("j")){

		System.out.println("Bist du wissbegierig?");
		String answerTwo = scanner.next();
}

	}
}