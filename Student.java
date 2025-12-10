public class Student extends Person{
    
    private double[] grades;
    private static final double PASSING_GRADE=50.0;
    
    //constructor 1
    public Student(String firstName, String lastName, int id, double[] grades){
     super(firstName, lastName, id);
    this.grades=grades;
    System.out.print(id);
    }

    public double average(){
        double aver=0;
        double sum=0;
        int l=grades.length;
        
        for(int i=0; i < l; i++){
            sum+=grades[i];
            aver=sum/l;
        }
        return aver;
    }
    
    public boolean hasPassed(){
        if(average()<PASSING_GRADE){
            return false;
        }
        return true;
    }
}


