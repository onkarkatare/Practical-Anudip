package inheritence;

class Student {
    String name;
    int age;
    Address add;

    Student(String name, int age, Address add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    void show() {
        System.out.println(name + " " + age + " " + add.street+" "+add.city+" "+add.state);
    }
}
