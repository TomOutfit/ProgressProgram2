package OMS;

public class Person {
    public String name,age,sex;

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public abstract void language();
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }
    
}
