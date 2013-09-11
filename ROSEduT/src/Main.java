/**
 *
 * @author IONUT
 */

public class Main {

    public static int add_one(int x) {
        return x + 1;
    }

    public static int multiply_by_ten(int x) {
        return x * 100;
    }

    public static int substract_eleven(int x) {
        return x - 11;
    }

    public static int add_fifty(int x) {
        return x + 50;
    }

    public static void collection_of_funtions(int x) {
        System.out.print("[" + add_one(x)+ ", ");
        System.out.print(add_fifty(x)+ ", ");
        System.out.print(substract_eleven(x)+ ", ");
        System.out.println(multiply_by_ten(x)+ "]");
    }

    public static void main(String[] args) {
        int i = 4;
        collection_of_funtions(i);
    }
}
