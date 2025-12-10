// The class Person
abstract class Person{
    protected String firstName;
    protected String lastName;
    protected int id;

    //constructor
    public Person(String firstName, String lastName, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        System.out.print(id);
    }
    abstract String role();

    public String fullName(){
        return firstName + lastName;    
    }
}

