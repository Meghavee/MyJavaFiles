package homework24thApril2021;

public class Dog extends Animals {

    public void makeNoise() {
        System.out.println("bark");
    }

    @Override
    public void eat() { // method overrides from animals class
        System.out.println("meat");
    }

    @Override
    public void fav() {
        System.out.println("Aarav loves Dog");
     //   super.fav();
    }

    @Override
    public void Cat() {
        System.out.println("have milk");
      //  super.Cat();
    }
}
