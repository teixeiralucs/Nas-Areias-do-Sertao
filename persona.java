public class persona {
    String name;
    int energy;
    String weapon;



    public persona(String name, int energy, String weapon) {
        this.name = name;
        this.energy = energy;
        this.weapon = weapon;
    }

    
    boolean changeEnergy (int change){
        boolean alive = true;
        this.energy += change;

        if (energy <= 0){
            this.energy = 0;
            System.out.println("Os últimos acontecimentos modificaram a força do cuscuz de " + this.name + "em " + change);
            System.out.println("Sua força do cuscuz é de " + this.energy);
            System.out.println("Você sucumbiu à sua dor.");
            alive = false;
            return alive;
        }
        if (energy > 100){
            this.energy = 100;
            System.out.println("Os últimos acontecimentos modificaram a força do cuscuz de " + this.name + "em " + change);
            System.out.println("Sua força do cuscuz é de " + this.energy);
            System.out.println("Você nunca esteve melhor.");
            alive = false;
            return alive;
        }
        else{
            System.out.println("Os últimos acontecimentos modificaram a força do cuscuz de " + this.name + "em " + change);
            System.out.println("Sua força do cuscuz é de " + this.energy);
            return alive;
        }
    }
}
    
