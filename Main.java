public class Main {
    public static void main(String[] args) {
        Printer printAge = new Printer();
        int returnedAge = printAge.printAndReturnValue();
        System.out.println("~~~" + returnedAge + "~~~");
    }
}
