
class Zoo {
    animal[] animals;
    String name;
    String city;
    int nbrCages = 25;


    public Zoo(int nbrAnimals, String name, String city, int nbrCage) {

        animals = new animal[nbrAnimals];
        this.name= name;
        this.city=city;
        this.nbrCages=nbrCage;;
        name = name; city = city; nbrCage = nbrCage;
    }

    public void displayZoo() {
        System.out.println("zoo Name: " + name);
        System.out.println("city: " + city);
        System.out.println("Nbr Cages: " + nbrCages);
        }

   
    public String toString() {
        return "Zoo Name: " + name + "city: " + city + "Nbr Cages: " + nbrCages;
    }

     public boolean addAnimal(animal animal) {

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
            return false;
        }

    public void afficheAnimals() {
        System.out.println("Animals in the Zoo:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("Animal " + (i + 1) + ": " + animals[i].name);
            }}
    }
    public int searchAnimal(animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }}
        return -1;
    }
    public boolean removeAnimal(animal an) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(an)) {
                animals[i] = null;
                return true;
            }}
        return false;
    }
    public boolean isZooFull() {
        int NB = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                NB++;
            }}
        return NB >= nbrCages;
    }
    public int nbanimals() {
        int nb= 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                nb++;
            }
        }
        return nb;
    }
    public boolean comparerZoo(Zoo z1, Zoo z2) {
        int nbz1 = z1.nbanimals();
        int nbz2 = z2.nbanimals();

        return nbz1 > nbz2;
    }
    public boolean addanimal1(animal animal)
    { int NB=0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i]!=null) {
                NB++;
            }
            else{
                animals[i]=animal;
                return true;
            }
        }
        return false;
    }

}



