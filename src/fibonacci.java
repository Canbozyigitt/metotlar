public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // İlk n Fibonacci sayısını hesaplamak için n'i değiştirebilirsiniz.

        System.out.println("Fibonacci Serisi (ilk " + n + " terim):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
