package Week10;

public class Shallowcopy {

    public static void main(String[] args) {
        Address a = new Address ("2021", "Mornelle crt");
        Student stda = new Student ("Vish", 24, a);
        Student stdb = new Student("AAA" , 25, a);
        System.out.println(stda);
        System.out.println(stdb);
        Address a1 = stdb.getAddress();
        a1.setStreetname("LAS");
        a1.setStreetnumber("123");
        System.out.println("StdA is " + stda); // shallowcopy -->  both the std address will change because both the stda and stdb address has a same reference object.
        System.out.println("StdB is " + stdb);
    }
}
