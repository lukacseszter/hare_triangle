import java.util.Scanner;

public class Triangle {
    String baseStr;
    String heightStr;
    Double area;
    

    public Triangle() {
        this.inputData();  
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alap:" );
        this.baseStr = scanner.nextLine();
        System.out.println("Magasság:" );
        this.heightStr = scanner.nextLine();
    }

    public void checkInputs() {
        if (this.isGoodInput(baseStr)) {
            System.err.println("1001 hiba!");
            System.exit(1001);
        }

        if(this.isGoodInput(heightStr)) {
            System.err.println("1002 hiba!");
            System.exit(1002);
        }
    }

    public boolean isGoodInput(String input) {
    return input.matches("[0-9.]+");

    }

}
