public class Main {
    public static void main(String[] args) {
        House house = new House();
        House house1 = new House();
        House house2 = new House();

        //info house 1

        house1.address = "Corso Roma, Roma";
        house1.numbersOfFloor = 4;

        //info house 2

        house2.address = "Corso Napoli, Roma";
        house2.numbersOfFloor = 5;
        house1.printHouseDetails(house1.address, house1.numbersOfFloor);
        house2.printHouseDetails(house2.address, house2.numbersOfFloor);

        System.out.println ("Ecco le indicazioni di casa mia e della scuola!");

    }
  }