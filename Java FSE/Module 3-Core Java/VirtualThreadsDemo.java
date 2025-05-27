public class VirtualThreadsDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                // Simulate work (comment out below line for faster execution)
                // System.out.println("Running in virtual thread: " + Thread.currentThread());
            });
        }

        long end = System.currentTimeMillis();
        System.out.println("Launched 100,000 virtual threads in " + (end - start) + " ms");
    }
}