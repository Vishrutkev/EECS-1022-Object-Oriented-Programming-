package Week10;

public class Address {

    private String streetnumber;
    private String streetname;

    public Address(String streetnumber, String streetname) {
        this.streetnumber = streetnumber;
        this.streetname = streetname;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetnumber='" + streetnumber + '\'' +
                ", streetname='" + streetname + '\'' +
                '}';
    }
}
