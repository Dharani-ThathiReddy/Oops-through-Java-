import java.util.Scanner;

class LinearSearch {
    int[] a;

    LinearSearch(int n) {
        a = new int[n];
    }

    void Search(int key, int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                flag++;
                System.out.println("The key is found at position: " + (i + 1));
                return;
            }
        }
        if (flag == 0) {
            System.out.println("The key is not found.");
        }
    }

    void display(int n) {
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class ArrayExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = s.nextInt();

        LinearSearch arr = new LinearSearch(n);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr.a[i] = s.nextInt();
        }

        System.out.println("Enter the key to search for:");
        int key = s.nextInt();

        arr.Search(key, n);
        arr.display(n);

        s.close();
    }
}

