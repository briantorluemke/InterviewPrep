public class VarPlusPlus {
    public static void main(String[] args) {

        int var = 5;
        int result = var++;
        // After this, var becomes 6, and result becomes 5
        System.out.println("Var = " + var);
        System.out.println("Result = " + result);

        int var2 = 5;
        int result2 = ++var2;
        // After this, var becomes 6, and result becomes 6
        System.out.println("Var2 = " + var2);
        System.out.println("Result2 = " + result2);

    }
}