import Controllers.ShellSort;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int[] a = {-10, 0, 4, 7, 2, 1, 9, 6};

        // Instancia
        ShellSort sS = new ShellSort();

        System.out.println("Orden de forma ascendente:");
        sS.sort(a, true);
        sS.imprimir(a);

        int[] b = {-10, 0, 4, 7, 2, 1, 9, 6};
        
        System.out.println("Orden de forma descendente:");
        sS.sort(b, false);
        sS.imprimir(b);
    }
}
