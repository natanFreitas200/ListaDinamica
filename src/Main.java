import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DinamicList<Integer> list = new DinamicList<>();
        list.add(5);
        list.add(9);
        list.add(65);
        list.add(12);
        list.add(23);

        System.out.println(list);
        list.set(0,40);
        list.set(4,50);
        System.out.println(list);
    }
}