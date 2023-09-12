package basicprograms;

//‘a’ (= 2) is equal to ‘b’ (= 2), we are printing “equal”.
//Since ‘a’ (= 5) is greater than ‘b’ (= 3), we are printing “greater”.
//otherwise smaller
public class IfElse {

    public String compareNumbers(int a, int b) {
        if (a > b) {
            return "Greater";
        }
        if (a < b) {
            return "Smaller";
        }

        return "Equal";
    }

    public static void main(String[] args) {
        IfElse obj= new IfElse();
        System.out.println(obj.compareNumbers(2,3));
    }
}
