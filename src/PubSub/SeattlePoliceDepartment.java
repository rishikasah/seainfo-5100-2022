package PubSub;
/*1. Create a class called SeattlePoliceDepartment


10. Publish the message again.
 */

import java.util.ArrayList;
import java.util.List;

public class SeattlePoliceDepartment {

   protected List<Person> subscriberLists;
    String message;
   public SeattlePoliceDepartment(){
        this.subscriberLists = new ArrayList<>();
    }

    public void NotifyCitizens(String message){
        this.message = message;
       for(Person subscriber : subscriberLists){
           subscriber.getNotification(this);
        }
    }
}

