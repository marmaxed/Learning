public class Prototype implements Cloneable {

}

class Student implements Cloneable{
    @Override
    public Student clone() throws CloneNotSupportedException {
        return(Student) super.clone();
    }
}
class BaseData{
    private Student student;
    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }
    public void SetStudent(Student student){
        this.student=student;
    }
}
//объект, который умеет клонировать себя используется для бд и проч
