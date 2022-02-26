package PubSub;

public class PubSubRunner {

    public static void main(String[] args) {

        SeattlePoliceDepartment publisher = new SeattlePoliceDepartment();

        Person subAdam = new Person("Adam", 24);
        Person subBryce = new Person("Bryce", 35);
        Person subNicole = new Person("Nicole", 30);
        Person subTroy = new Person("Troy", 28);
        Person ben = new Person("Ben", 19);

        // Subscribe Adamn, Bryce, Troy and Nicole to SPD
        subAdam.subscribe(publisher);
        subBryce.subscribe(publisher);
        subNicole.subscribe(publisher);
        subTroy.subscribe(publisher);

        // Publish Message from SPD
        publisher.NotifyCitizens("Law Enforcement Blue Alert in Capitol Hill, Tune in to SPD radio for more info.");

        // Unsubscribe Bryce and Troy
        subBryce.unsubscribe(publisher);
        subTroy.unsubscribe(publisher);

        // Publish message from SPD
        publisher.NotifyCitizens("Amber Alert - Black Audi Reported seen going northbound from I5");
    }
}
