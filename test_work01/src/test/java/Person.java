public class Person {
    public String name;
    public String surrname;
    public Integer age;

    public Person(String name, String surrname, Integer age) {
        this.name = name;
        this.surrname = surrname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
