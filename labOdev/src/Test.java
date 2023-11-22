public class Test {


    public static void main(String[] args){

        Spider orumcek = new Spider(8);

        Cat muhtar = new Cat(4,"muhtar");
        Cat kedi2 = new Cat(4);

        Fish balik = new Fish(0,"karabaş");


        balik.getName();
        balik.eat();
        balik.walk();

        muhtar.play();
    }
}
