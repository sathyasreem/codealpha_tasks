import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> marks = new ArrayList<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            names.add(sc.nextLine());
            System.out.print("Grade/Marks: ");
            marks.add(sc.nextDouble());
            sc.nextLine();
        }

        double sum = 0;
        int maxI = 0, minI = 0;
        for (int i = 0; i < n; i++) {
            sum += marks.get(i);
            if (marks.get(i) > marks.get(maxI)) maxI = i;
            if (marks.get(i) < marks.get(minI)) minI = i;
        }

        System.out.println("\n--- Summary Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }
        System.out.println("Average : " + (sum / n));
        System.out.println("Highest : " + names.get(maxI) + " (" + marks.get(maxI) + ")");
        System.out.println("Lowest  : " + names.get(minI) + " (" + marks.get(minI) + ")");
    }
}
