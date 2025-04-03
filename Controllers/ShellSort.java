package Controllers;

public class ShellSort {
    public void sort(int[] array, boolean ascending) {
        int n = array.length;
        int cambios = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;

                while (j >= gap && (ascending ? array[j - gap] > temp : array[j - gap] < temp)) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
                cambios++;
                System.out.println("Cambio: " + cambios + " en gap: " + gap);
            }
        }
    }

    public void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}