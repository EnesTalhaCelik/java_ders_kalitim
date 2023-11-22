public class Fish extends Animal implements Pet {


        String Name;
        Fish(int legs, String Name){
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
            System.out.println("Balık oyun oynuyor");
        }

        @Override
        public void eat() {

            System.out.println("Balık yemek yiyor");
        }
        @Override
        public void walk(){
            System.out.println("Balıklar yürüyemez");
            System.out.println("Evrimleşmediği sürece");

        }


}


