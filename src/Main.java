import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        String partyChoice = "";
        String party = "D - Democrat\tR - Republican\tI - Independent\nChoose your party: ";
        System.out.println(partyChoice);
        partyChoice = "D";
        if (partyChoice.equalsIgnoreCase("D")) {
            System.out.println("You are a Democratic Donkey");
        }
        else if (partyChoice.equalsIgnoreCase("R")) {
            System.out.println("You are a Republican Elephant");
        }
        else if (partyChoice.equalsIgnoreCase("I")) {
            System.out.println("You are a Independent Eagle");
        }
        else {
            System.out.println("You are a other");
        }
    }
}