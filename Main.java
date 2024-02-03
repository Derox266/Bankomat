import java.util.ArrayList;

public class Main {
    public static String karta;
    public static String PIN;

    public static String[][] kody = {
            {"CardPoland", "1111"},
            {"Visa", "2222"},
            {"MasterCard", "3333"},
    };

    public static double[] stanyKonta = {100.00, 1290.50, 10099.99};

    public static String[] kolumnyHistoriiTransakcji = {"Numer", "Karta", "Rodzaj transakcji", "Kwota", "Data"};

    public static ArrayList<String[]> wierszeHistoriiTransakcji = new ArrayList<>();
    public static int licznikTransakcji = 1;

    public static void main(String[] args) {
        CardEnterWindow.main();
    }
}
