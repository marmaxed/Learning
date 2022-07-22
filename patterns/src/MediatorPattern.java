public class MediatorPattern {

}
abstract class similarClass{
    private int value;
    void setSomeValue(int value) {
        this.value = value;
    }
    private String name;
    String getName(){
        return name;
    }
    protected mediator mediator;
    public similarClass(mediator mediator){
        this.mediator=mediator;
    }
}

class Students extends similarClass{
    int course;
    String name;
    public Students(String name, int course, mediator mediator){
        super(mediator);
        this.name = name;
        this.course = course;
    }
    @Override
    public void setSomeValue(int value) {
     this.course = value;
    }

    @Override
    public String getName() {
        return name;
    }
    void hiredCompetition(){
        if(mediator.getExperience()<course){
            System.out.println("you win!!");
        }
    }
}
class jobSeekers extends similarClass{
    int experience;
    String name;
    public jobSeekers(String name, int experience, mediator mediator){
        super(mediator);
        this.name = name;
        this.experience = experience;
    }
    @Override
    public void setSomeValue(int value) {
     this.experience = value;
    }

    @Override
    public String getName() {
        return name;
    }
    void hiredCompetition(){
        if(experience>mediator.getCourse()){
            System.out.println("You win!");
        }
    }
}

   class mediator{
    protected Students student;
    protected jobSeekers jobSeeker;
    public mediator(Students student, jobSeekers jobSeeker){
        this.student=student;
        this.jobSeeker = jobSeeker;
    };
    int getCourse(){
        return student.course;
    };
    int getExperience(){
        return jobSeeker.experience;
    };
}

class WorkWithClass extends mediator{

    public WorkWithClass(Students student, jobSeekers jobSeeker) {
        super(student, jobSeeker);
    }
    void compare(){
        if(getExperience()>getCourse()){
            System.out.println("seeker win!!");
        } else
        {System.out.println("student win!!!!");}
    }
}