   class Teacher extends Person{
    private String subject;
    
    public Teacher(String firstName, String lastName, int id, String subject){
        super(firstName, lastName, id);
        this.subject=subject;
        System.out.println("Teacher constructor called for " + id);
    }
    @Override
    public String role(){
        return "Teacher";
    }
    
    public String getSubject(){
        return subject;
    }
}
