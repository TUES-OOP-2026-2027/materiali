public class Main {
    public static void main(String[] args) {
        Validator tram10 = new Validator("Tram 10");
        Validator bus94 = new Validator("Bus 94");
        Ticket t1 = new Ticket();
        Ticket t2 = t1;
        Ticket t3 = new Ticket();
        tram10.validate(t1, 485);                      // 8:05
        bus94.validate(t3, 490);                       // 8:10
        Inspector ivan = new Inspector("Ivan");
        System.out.println(ivan.checkTicket(t2, 500)); // 8:20
        System.out.println(ivan.checkTicket(t1, 520)); // 8:40
        System.out.println(Ticket.sold + " " + Validator.validations
            + " " + tram10.inThisVehicle);
        Card c = new Card("Maria", 304);               // до 31 октомври
        System.out.println(c.owner() + " " + ivan.checkCard(c, 288));
    }
}
