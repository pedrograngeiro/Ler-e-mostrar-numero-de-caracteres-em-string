import java.util.Scanner;

public class Ex1n {
  public static void main(String[] args) {
    String line;
    int index;
    int location;
    char letter;
    int[] letterCount = new int[26];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma string (ou pressione ENTER para sair): ");
    line = scanner.nextLine();

    while (!line.isEmpty()) {
      for (location = 0; location < line.length(); location++) {
        letter = line.charAt(location);
        if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
          index = Character.toUpperCase(letter) - 'A';
          letterCount[index]++;
        }
      }

      for (index = 0; index < letterCount.length; index++) {
        System.out.println("O número total de letras " + (char) (index + 'A') + " é: " + letterCount[index]);
      }

      // Reinicializar a contagem
      letterCount = new int[26];

      System.out.println("Digite uma string (ou pressione ENTER para sair): ");
      line = scanner.nextLine();
    }

    scanner.close();
  }
}
