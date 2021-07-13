package ThucHanh1.animal;

import ThucHanh1.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: Haha-Haha";
    }

    @Override
    public String howToEat() {
        return "Chiên giòn 7 món";
    }
}
