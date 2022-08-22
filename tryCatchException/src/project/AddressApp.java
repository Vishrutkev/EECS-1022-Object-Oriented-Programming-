package project;

public class AddressApp {

    public static void main(String[] args) {
        try {

            Address addressA = new Address(2021, "Mornelle crt", "100");
            Address addressB = new Address(2021, "Mornelle crt", "100");
            Address addressC = new Address("null", 2021, "100");
            //addressA.streetName = "Mornelle crt";
           //addressA.streetNumber = "100";


            System.out.println(addressA.getStreetName());
            addressA.setStreetName("Unknown");
            System.out.println(addressA.getStreetName());
            System.out.println(addressB);
            System.out.println(addressC);

        } catch (NullPointerException e) {
            System.out.println("we are here in catch 1 --> " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("we are here in catch 2 --> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("we are here in catch 3 --> " + e.getMessage());
        } finally {
            System.out.println("at finally");
        }


    }

}
