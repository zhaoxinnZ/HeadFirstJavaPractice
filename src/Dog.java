public class Dog {
    int size;
    String breed;
    String name;

    void bark(int numOfBark) {
        while (numOfBark > 0) {
            System.out.println("ruff");
            numOfBark = numOfBark - 1;
        }
        if (size > 60){
            System.out.println("Wooof! Wooof!");
        }
        else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        }
        else {
            System.out.println("Yip! Yip!");
        }

    }
}

