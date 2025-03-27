public class PetMachine {
    private boolean clean = true;

    private int water= 30;

    private int shampoo=10;

    private Pet pet = null;


    public void takeShowerInPet() {
        if (this.pet == null) {
            System.out.println("Nao tem pet");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2; 
        pet.setClean(true);
        System.out.println("o PET"+ pet.getName()+ "LIMPO");
    }

    public void addWater(){
        if (water == 30) {
            System.out.println("Acapacidade de agua da maquina esta no maximo");
        }

        water += 2;
    }
    public void addShampoo(){
        if (shampoo == 10) {
            System.out.println("Acapacidade de shampoo da maquina esta no maximo");
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
     if (!this.clean) {
        System.out.println("Amaquina esta suja ");
        return;
     }
        if (hasPet()) {
            System.out.println("o pet" + this.pet.getName() + "esta na maquina nesse momento");
            return;
        }
        this.pet = pet;

        System.out.println("O pet " + pet.getName() + " foi retirado da maquina.");
    }
public void removePet(){
    if (this.pet == null) {
        System.out.println("Nao ha pet na maquina.");
        return;
    }

    // Salvar o nome antes de remover o pet
    String petName = this.pet.getName();
    this.clean = this.pet.isClean(); // Atualizar status de limpeza
    this.pet = null; // Agora podemos limpar a referência

    System.out.println("O pet " + petName + " foi retirado da maquina.");
}




    public void wash(){
        this.water -= 10;
        this.shampoo -= 2; 
        this.clean = true;
        System.out.println("maquina esta limpa");
    }
}
