import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secLine = scanner.nextLine();
        boolean compareString = firstLine.replace(" ", "").equals(secLine.replace(" ", ""));
        System.out.println(compareString);
    }
}