import java.util.ArrayList;
import java.util.List;

public class Filter {
}
class student {
    private int age;
    private String name;
    private String group;
    public student(String name,int age, String group){
        this.age = age;
        this.group=group;
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getGroup(){
        return this.group;
    }
}

interface studentFilter{
    List<student> filter(List<student> students);
}

class AgeFilter implements studentFilter{
    private int min;
    public AgeFilter(int lowLimit){
        min = lowLimit;
    }
    @Override
    public List<student> filter(List<student> students) {
        List<student> list = new ArrayList<>();
        for(student student: students){
          if (student.getAge()>=min){
           list.add(student);
          }
        }
        return list;
    }
}
class NameFilter implements studentFilter{
    private String name;
    public NameFilter(String name){
        this.name = name;
    }
    @Override
    public List<student> filter(List<student> students) {
        List<student> list = new ArrayList<>();
        for(student student: students){
            if (student.getName().equals(name)){
                list.add(student);
            }
        }
        return list;
    }
}

class BestSort implements studentFilter{
    studentFilter FirstFilter;
    studentFilter SecondFilter;

    public BestSort(studentFilter FirstFilter, studentFilter SecondFilter){
        this.FirstFilter=FirstFilter;
        this.SecondFilter=SecondFilter;
    }
    @Override
    public List<student> filter(List<student> students) {
        List<student> list = FirstFilter.filter(students);
       return SecondFilter.filter(list);
    }
}