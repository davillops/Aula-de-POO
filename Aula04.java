
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        c1.status();

        Caneta c2 = new Caneta("NIC", "vermelha", 0.4f);
        c2.status();

        Caneta c3 = new Caneta("BOINK", "verde", 0.2f);
        c3.status();
    }
}