public class ZooDiamondProblem {
    interface Animal {
        void makeSound();
    }

    interface Bird extends Animal {
        void layEggs();
    }

    interface Mammal extends Animal {
        void giveBirth();
    }

    public class UniqueAnimal implements Mammal, Bird{

        @Override
        public void makeSound() {

        }

        @Override
        public void layEggs() {

        }

        @Override
        public void giveBirth() {

        }
    }
}
