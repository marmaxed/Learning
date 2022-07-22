public class StatePattern {
}

interface State {
    double chanceOfSuccess(Exam exam);
}


class ExcellentStudent implements State{
    @Override
    public double chanceOfSuccess(Exam exam) {
        return exam.howMuchYouLearning*1.2;
    }
}


class IdealSituation implements State{
    @Override
    public double chanceOfSuccess(Exam exam) {
        return exam.howMuchYouLearning;
    }
}

class SpecialTeacher implements State{
    @Override
    public double chanceOfSuccess(Exam exam) {
        return exam.howMuchYouLearning*Math.random();
    }
}

class AfterScholarshipCelebration implements State {
    @Override
    public double chanceOfSuccess(Exam exam) {
        return (exam.howMuchYouLearning*0.78)*Math.random();
    }
}

class Exam{
    State state;
    double howMuchYouLearning;
    public Exam(State state, double learnedMaterial){
        this.state=state;
        howMuchYouLearning=learnedMaterial;
    }
    public void tryingToPass(){
        System.out.println(state.chanceOfSuccess(this));
    }
}