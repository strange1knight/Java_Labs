import java.util.*;

class PrimesGenerator implements Iterator<Integer> {
    private int current = 2;
    private int count;
    private int generated = 0;
    
    public PrimesGenerator(int count) {
        this.count = count;
    }
    
    @Override
    public boolean hasNext() {
        return generated < count;
    }
    
    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        
        while (!isPrime(current)) {
            current++;
        }
        int prime = current;
        current++;
        generated++;
        return prime;
    }
    
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int N = 10;
        PrimesGenerator generator = new PrimesGenerator(N);
        
        List<Integer> primes = new ArrayList<>();
        while (generator.hasNext()) {
            primes.add(generator.next());
        }
        System.out.println("Первые " + N + " простых чисел (прямой порядок): " + primes);
        
        Collections.reverse(primes);
        System.out.println("Первые " + N + " простых чисел (обратный порядок): " + primes);
    }
}