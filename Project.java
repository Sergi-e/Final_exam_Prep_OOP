public class Project implements Evaluable {
    String title;
    double[] rubriScores;

    //constructor
    Project ( String title, double[] rubriScores){
        this.title=title;
        this.rubriScores=rubriScores;
    }
    @Override
    public double evaluate() {
        double sum = 0;
        for (double score : rubriScores) {
                sum += score;
            }
            return sum / rubriScores.length;
        }

    public double evaluate(boolean wheighted){
        double average=evaluate();

        if(wheighted){
            double wheightAverage=average*2;
            if (average>100) return 100;
            return wheightAverage;
        }
         return average;
    }
}
