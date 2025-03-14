public class Main {
    public static void main(String[] args) {
        
        System.out.println("iniciei");
        a();
        System.out.println("Finalizei inicio");
    }

    static void a() {
        System.out.println("entrei a");
        b();
        System.out.println("finalizei a");
    }

    static void b() {
        System.out.println("entrei b");
        for (int i = 0; i <= 4; i++) System.out.println(i);
            ;
        c();
        System.out.println("finalizei b");
    }

    static void c() {
        System.out.println("entrei c");
        Thread.dumpStack();
        System.out.println("cabou tudo");
    }
}
