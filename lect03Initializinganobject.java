package OOPS;
//EXAMPLE 01 OBJECT INITIALIZING USING REFERENCE VARIABLE
class Studentdata{
    int id;
    String name;
}
class testdata{
    public static void main(String[] args) {
//        creating multiple object
        Studentdata s=new Studentdata();
        Studentdata p = new Studentdata();
//        initializing object The objects are initialized using their reference variables (s and p).
        s.id=10;
        s.name="adarsh";
        p.id=20;
        p.name="adarsh singh";
//        printing the object
        System.out.println(s.id);
        System.out.println(p.id);
        System.out.println(p.name);
        System.out.println(p.id);

    }
}
