package Week10;

import java.util.ArrayList;
import java.util.List;

public class ShallowDeepcopy {

    public static void printList(List<Student> list){
        for (Student e : list)
            System.out.println(e);
    }



    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("AAA", 20, new Address("30","AddressA")));
        studentList.add(new Student("BBB", 23, new Address("35","AddressB")));
        studentList.add(new Student("BBB", 40, new Address("40","AddressC")));

        //DeepCopy
        System.out.println();
        System.out.println("-----------------------DeepCopy--------------------------------------------------------");
        List<Student> studentList1 = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            Student original = studentList.get(i);
            Student t = new Student(original.getName(), original.getAge(), original.getAddress());
            studentList1.add(t);
        }


        // Shallow Copy

        //List <Student> studentList1 = new ArrayList<>();
//        for (Student e : studentList)
//            studentList1.add(e);
//        System.out.println("-----------------------StudentList--------------------------------------------------------");
//        printList(studentList);
        System.out.println("-------------------------------------------------------------------------------");
//        System.out.println("List: " + studentList);
//        System.out.println("another list: " + studentList1);
//        System.out.println("-----------------------StudentList1--------------------------------------------------------");
//        printList(studentList1);

        studentList.get(0).setName("EEE");

        //printList(studentList1);


        System.out.println();
        System.out.println("--------------After changing one of the student name in studentList-----------------------");
        System.out.println();
        System.out.println("-----------------------StudentList--------------------------------------------------------");
        printList(studentList);
        System.out.println("-----------------------StudentList1--------------------------------------------------------");
        printList(studentList1);




    }
}
