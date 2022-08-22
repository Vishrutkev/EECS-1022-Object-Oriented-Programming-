package project;

public class Address {

    private String streetNumber;
    private String streetName ;
    private int suiteNumber;

    private Address(){
        this.suiteNumber = Integer.MAX_VALUE;
        this.streetName = "Unknown";
        this.streetNumber = "Unknown";
    }

    public Address(int suiteNumber, String streetName, String streetNumber) {

        if (streetNumber.equals("Unknown") ){
           throw new IllegalArgumentException("You cannot create object with unknown");
        }



        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.suiteNumber = suiteNumber;
    }

    public Address(String streetName, int suiteNumber, String streetNumber) {

        if (streetName == null){
            throw new NullPointerException("You cannot create object with null");
        }



        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.suiteNumber = suiteNumber;

    }
    public String toString(){
        return "(" + this.suiteNumber+ "-"+ this.streetNumber + " " + this.streetName + ")";
    }


    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getSuiteNumber() {
        return suiteNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        if (streetName == null){
            throw new NullPointerException("You cannot create object with null");
        }
        if (streetName.equals("Unknown") ){
            throw new IllegalArgumentException("You cannot create object with unknown");
        }
        this.streetName = streetName;
    }

    public void setSuiteNumber(int suiteNumber) {
        this.suiteNumber = suiteNumber;
    }
}
