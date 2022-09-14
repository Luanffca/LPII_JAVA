public class Principal {
    public static void main(String[] args) {

        Subject lp2 = new Subject("Lp2");
        Subject programing = new Subject("Programing");

        Chat melissa = new Chat("Melissa");
        Chat lara = new Chat("Lara");

        lp2.register(melissa, lara);

        lp2.publish("Oi");

        programing.register(lara);

        programing.publish("blzaaaaa!");
    }
}
