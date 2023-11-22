import javax.naming.Name;

public class Cat extends Animal implements Pet{

    Cat(int legs){
        super(legs);
        Name = "muhtar";


    }
    Cat(int legs, String Name){
        super(legs);
        this.Name = Name;

    }


    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String a) {
        Name = a;
    }

    @Override
    public void play() {
        System.out.println(" kedi oyun oynuyor");
    }

    @Override
    void eat() {

        System.out.println("Kedi yemek yiyor");
    }
}
