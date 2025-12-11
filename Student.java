class Student extends Person implements Evaluable {
    
    private double[] grades;
    private static final double PASSING_GRADE=50.0;
    
    //constructor 1
    public Student(String firstName, String lastName, int id, double[] grades){
    
        super(firstName, lastName, id);
        this.grades= new double[grades.length];
        for(int i=0;  i< grades.length; i++){
            this.grades[i]=grades[i];
        }
        System.out.println("Student constructor called for " + id);
    }
    
    //implementing the role class
    @Override
    public String role(){
        return "Student";
    }

    public double average(){  
        if (grades.length==0) return 0;
            double sum=0;
        for(int i=0; i < grades.length; i++){
            sum+=grades[i];
        }
        return sum/grades.length;
    }
    
    public boolean hasPassed(){
        if(average()< PASSING_GRADE){
            return false;
        }
        return true;
    }
    @Override
    public double evaluate(){
        return average();
    }
}


