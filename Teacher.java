public class Teacher extends Person{
    private String subject;
    
    public Teacher(String firstName, String lastName, int id, String subject){
        super(firstName, lastName, id);
        this.subject=subject;
    }
    @Override
    public String role(){
        String teacher=" Faustin";
        return "The teacher of: " + this.subject  + "is" + teacher;
    }   
}
