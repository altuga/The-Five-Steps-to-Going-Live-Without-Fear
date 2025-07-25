package jug.istanbul.springboot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeNumberFinder {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> generateUnsortedRandomNumbers(int amount, int bound) {
        var random = ThreadLocalRandom.current();
        var numbers = new ArrayList<Integer>(amount);
        for (int i = 0; i < amount; i++) {
            numbers.add(random.nextInt(bound));
        }

        Collections.shuffle(numbers);

        return numbers;
    }

}
