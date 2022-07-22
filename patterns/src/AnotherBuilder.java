public class AnotherBuilder {

}
//или делать приватными и с геттерами
class Person{
    String name;
    int age;
    String sex;
    int weight;
}
interface PersonBuilder{
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSex(String sex);
    PersonBuilder setWeight(int weight);
}
class BuilderPerson implements  PersonBuilder{
    Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.name=name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age=age;
        return this;
    }

    @Override
    public PersonBuilder setSex(String sex) {
        person.sex=sex;
        return this;
    }

    @Override
    public PersonBuilder setWeight(int weight) {
        person.weight=weight;
        return this;
    }
}