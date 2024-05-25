package OOPS;

//EXAMPLE 1 WHEN THERE IS ONLY ONE CLASS AND MAIN METHOD INSIDE THE CLASS
//creating the class
class Student{
//    creating the fields
    int id;
    String name;
//    creating the main method
    public static void main(String[] args) {
//        creating the object using new keyword
        Student s1= new Student();
//        assigning values to the object
        s1.id=50;
        s1.name="Adarsh";

//        printing the values
        System.out.println(s1.id);
        System.out.println(s1.name);
    }

}

//EXAMPLE 2 WHEN THERE IS MORE THAN ONE CLASS AND MAIN METHOD OUTSIDE THE CLASS
class Vehicle{
    int id;
    String name;
}
    class test {
        public static void main(String[] args) {
            Vehicle v1= new Vehicle();
            v1.id=022;
            v1.name="Car";
            System.out.println(v1.name);
            System.out.println(v1.id);


        }
    }

