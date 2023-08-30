public class Fitness {
    public static void main(String[] args) {
        /*String name, int day, int month, int year, String eMail, long phoneNumber, String surname, double weight,
                           String bloodPressure, int numberOfSteps
        */
        Account josh = new Account("Josh", 15, 8, 1996, "josh1996@gmail.com",
                9434123854L, "Bradey", 74.5, "120 / 60", 4200);

        Account rusty = new Account("Rusty", 1, 3, 2000, "rustyShackle@gmail.com",
                123456789L, "Shackleford", 54.0, "110 / 50", 12000);

        Account bob = new Account("Bob", 30, 12, 1990, "bobby90@gmail.com",
                243982413L, "Hill", 80.1, "130 / 85", 12);

        Account peggy = new Account("Peggy", 11, 7, 1968, "peggyHill@gmail.com",
                93799921432L, "Hill", 55.5, "120 / 70", 1500);


        josh.printAccountInfo();
        System.out.println("\n");
        rusty.printAccountInfo();
        System.out.println("\n");
        bob.printAccountInfo();
        System.out.println("\n");
        peggy.printAccountInfo();

        josh.setSurname("Roosevelt");
        josh.setBloodPressure("150 / 100");
        josh.setNumberOfSteps(8123);

        bob.setWeight(100.0);
        bob.setNumberOfSteps(7000);
        bob.setBloodPressure("110 / 60");

        System.out.println("\n\nAfter changing fields\n");
        josh.printAccountInfo();
        System.out.println("\n");
        bob.printAccountInfo();

    }
}
