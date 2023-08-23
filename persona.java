public class Persona {
    private String name;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Persona(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    boolean changeEnergy(int change) {
        boolean alive = true;
        this.energy += change;

        if (energy <= 0) {
            this.energy = 0;
            System.out.println(
                    "Os últimos acontecimentos modificaram a força do cuscuz de " + this.name + "em " + change);
            System.out.println("Sua força do cuscuz é de " + this.energy);
            System.out.println("Você sucumbiu à sua dor.");
            alive = false;
            return alive;
        }
        if (energy > 100) {
            this.energy = 100;
            System.out.println(
                    "Os últimos acontecimentos modificaram a força do cuscuz de " + this.name + "em " + change);
            System.out.println("Sua força do cuscuz é de " + this.energy);
            System.out.println("Você nunca esteve melhor.");
            alive = false;
            return alive;
        } else {
            System.out.println(
                    "Os últimos acontecimentos modificaram a força do cuscuz de " + this.name + "em " + change);
            System.out.println("Sua força do cuscuz é de " + this.energy);
            return alive;
        }
    }
}
