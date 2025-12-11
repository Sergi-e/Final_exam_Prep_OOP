public class TestMain {
    public static void main(String[] args) {
        Student stud1= new Student("Shimo", "Brais", 47584, new double[]{4,5,6,5});
        Student stud2= new Student("Kagira", "Egide", 5575, new double[]{5, 5, 6, 7, 6} );
        Teacher teach1=new Teacher("Faustin", "Ishimwe", 6748, "OOP");

        Person people[]={stud1, stud2, teach1};

        //objects for the project
        Project pro1=new Project("Ecofind", new double[]{5,3,5,6,4});
        Project pro2=new Project("KivuSpeaks", new double[]{6,7,8,9});

        //displays and conditions
        for(Person p: people){
            //printing the class type
            System.out.println("Class Type:" +p.getClass().getSimpleName());

            //printing the full name
            System.out.println(p.fullName());
            System.out.println(p.role());

            if(p instanceof Student){
                Student s=(Student) p;
                System.out.println(s.fullName() +"'s average is" + s.average());
                System.out.println("Passed: " + s.hasPassed());
            }
            System.out.println("--------------------------");

            if(p instanceof Teacher){
                Teacher t = (Teacher) p;
                System.out.println("Subject: " + t.getSubject());
            }
        }
          Person[][] people;
        

    }
}
