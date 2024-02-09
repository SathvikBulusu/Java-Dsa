public class coolect {
    public static void main(String[] args) {
        //searching the arrays
        int a[] = {12, 34, 54, 32, 34};
        int key = 34;
        int i;
        for (i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println("element found");
                break;
            }
        }

        if (i == a.length)
            System.out.println("element not found");
    }
}

