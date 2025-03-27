import java.util.Scanner;

public class App {

  private final static Scanner scanner = new Scanner(System.in);
  private final static PetMachine petMachine = new PetMachine();
  public static void main(String[] args) {

    var option = -1;

    do {
      System.out.println("===Escolha uma das opcoes===");
      System.out.println("1 - dar banho ");
      System.out.println("2 abastecer maquina com agua");
      System.out.println("3 abastecer maquina com shampoo");
      System.out.println("4 -verifica agua");
      System.out.println("5 verificar shampoo da maquina");
      System.out.println("6 Verificar se tem pet no banho");
      System.out.println("7 Colocar pet na maquina");
      System.out.println("8 retirar pet na maquina");
      System.out.println("9 limpa a maquina");
      System.out.println("10 sair");
      option = scanner.nextInt();

      switch (option) {
        case 1 -> petMachine.takeShowerInPet();
        case 2 -> serWater();
        case 3 -> serShampoo();
        case 4 -> VerifyWater();
        case 5 -> VerifyShampoo();
        case 6 -> checkIfHasPetInMachine();
        case 7 -> setPet();
        case 8 ->  petMachine.removePet();
        case 9 -> petMachine.wash();
        case 0 -> System.exit(0);
default-> System.out.println("opção invalida");
      }

    } while (option != 0);
  }

private static void serWater(){
  System.out.println("Tentando colocar agua na maquina");
  petMachine.addWater();
}

private static void serShampoo(){
  System.out.println("Tentando colocar shampoo na maquina");
  petMachine.addShampoo();
}



  private static void VerifyWater() {
    var amout = petMachine.getWater();
    System.out.println(" A maquina esta no momento com "+ amout + "litros de Agua");
  }
  private static void VerifyShampoo() {
    var amout = petMachine.getShampoo();
    System.out.println(" A maquina esta no momento com "+ amout + "litros de shampoo");
  }

  private static void checkIfHasPetInMachine(){
    var hasPet = petMachine.hasPet();
    System.out.println(hasPet ? "tem pet na maquina" : "Nao tem pet na maquina");
  }

  public static void setPet() {

    var nome = "";

    while (nome == null || nome.isEmpty()) {
      System.out.println("informe nome do pet");

      nome = scanner.next();
    }
 
    var pet = new Pet(nome);
    petMachine.setPet(pet);
    System.out.println("o pet " + pet.getName() +
    " foi colocado na maquina");
  }


}
