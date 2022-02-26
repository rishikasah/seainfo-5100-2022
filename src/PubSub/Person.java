package PubSub;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment spd) {

        if(!spd.subscriberLists.contains(this))
            spd.subscriberLists.add(this);
    }

    public void unsubscribe(SeattlePoliceDepartment spd) {

        if(spd.subscriberLists.contains(this))
            spd.subscriberLists.remove(this);
    }

    public void getNotification(SeattlePoliceDepartment spd) {
        System.out.println(" Notification from Seattle Police Department for - " + name + " :: Age - " + age + " ::: " + spd.message);
    }
}
