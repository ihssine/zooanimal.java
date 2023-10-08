public class Main {
    public static void main(String[] args) {
        animal lion = new animal("yyy", "Lion", 10, true);
        Zoo myZoo = new Zoo(25, "My Zoo", "city", 20);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        lion.displayanimal();
        System.out.println(lion);
        System.out.println(lion.toString());
        myZoo.toString();
        lion.toString();
    boolean added = myZoo.addanimal1(lion);
        if (added) {
        System.out.println("lion add");
    } else {
        System.out.println("zoo is full");
    }
        Zoo zooo = new Zoo(25, "zooo", "ci", 20);
        animal Dog = new animal("Mammal", "Dog", 5, true);
        myZoo.addAnimal(Dog);

        int cher = myZoo.searchAnimal(Dog);
        if (cher != -1) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        animal Dog2 = new animal("Mammal", "Dog", 5, true);

        cher = myZoo.searchAnimal(Dog);
        if (cher != -1) {
            System.out.println("Dog2 found ");
        } else {
            System.out.println("Dog2 not found.");
        }

        myZoo.afficheAnimals();

    int lionin = myZoo.searchAnimal(lion);

        if (lionin != -1) {
        System.out.println("lion exist");
    } else {
        System.out.println("lion not exist");
    }

    boolean removed = myZoo.removeAnimal(lion);

        if (removed) {
        System.out.println("lion removed ");
    } else {
        System.out.println("didnt remove");
    }

    Zoo z1 = new Zoo(10, "z1", "zzz", 15);
    Zoo z2 = new Zoo(20, "z2", "zzz", 5);
    boolean nbanimal = z1.comparerZoo(z1, z2);
    animal animal = new animal("aquatique", "yoo",10,true);
    animal.Aquatiques aqu1 = animal.new Aquatiques("poisson", "cho", 5, false, "eau");
    animal.Aquatiques.Dolphin dol1= aqu1.new Dolphin("dolphin", "pe",5,true,"rrr",15);
    animal.Aquatiques.Penguin pen1= aqu1.new Penguin("penguin", "mo",4,true,"ppp",9);
    animal.Terrestres ter1= animal.new Terrestres("leo","lii",8,true,4);

    aqu1.toString();
    ter1.toString();
    aqu1.swim();
    dol1.swim();

}}

