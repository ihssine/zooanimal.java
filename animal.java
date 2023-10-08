class animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    public animal(String family, String name, int age, boolean isMammal) {

        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;


    }

    public String toString() {
        return "family: " + family + "name: " + name + "age: " + age + "mammal: " + isMammal ;}
    public void displayanimal() {
        System.out.println("family: " + family);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("mammal: " + isMammal);

    }
    class Aquatiques extends animal {
          private String habitat;
        public Aquatiques(String family, String name, int age, boolean isMammal, String habitat) {
            super(family, name, age, isMammal);
            this.habitat=habitat;
        }
        public String toString() {
            return "family: " + family + "name: " + name + "age: " + age + "mammal: " + isMammal + "habitat:" + habitat;}
        public void swim(){
            System.out.println("This aquatic animal is swimming.");
        }
        class Dolphin extends Aquatiques {
            float swimmingSpeed;

            public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
                super(family, name, age, isMammal, habitat);
                this.swimmingSpeed = swimmingSpeed;
            }
            public void swim(){
                System.out.println("This dolphin is swimming.");
            }
        }
        class Penguin extends Aquatiques {
            float swimmingDepth;

            public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
                super(family, name, age, isMammal, habitat);
                this.swimmingDepth = swimmingDepth;
            }
    }}
    class Terrestres extends animal {
        private int nbrLegs;
        public Terrestres(String family, String name, int age, boolean isMammal, int nbrLegs) {
            super(family, name, age, isMammal);
            this.nbrLegs=nbrLegs;
        }
        public String toString() {
            return "family: " + family + "name: " + name + "age: " + age + "mammal: " + isMammal + "nbrLegs:" + nbrLegs;
        }
    }
}




