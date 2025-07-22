//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            HalfPrice halfPrice = new HalfPrice(30,"Super Men","dublado");

            System.out.println("Half Price Ticket");
            System.out.println("Value Ticket: " + halfPrice.getRealValue());
            System.out.println("Name Movie: "+ halfPrice.getNameMovie());
            System.out.print("Audio Track Movie: " + halfPrice.getAudioTrack());
        System.out.println("\n \n");


        Family family = new Family(30,"Batman","legendado", 10);

        System.out.println("\nFamily Price Ticket");
        System.out.println("Value Ticket: " + family.getRealValue());
        System.out.println("Name Movie: "+ family.getNameMovie());
        System.out.print("Audio Track Movie: " + family.getAudioTrack());
        System.out.println("\n \n");

        Family minorFamily = new Family(30,"Silo","dublado", 2);

        System.out.println("\nFamily Price Ticket");
        System.out.println("Value Ticket: " + minorFamily.getRealValue());
        System.out.println("Name Movie: "+ minorFamily.getNameMovie());
        System.out.print("Audio Track Movie: " + minorFamily.getAudioTrack());



    }
}