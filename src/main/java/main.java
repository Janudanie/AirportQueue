import java.util.Date;
import java.sql.Timestamp;

public class main {
    public static void main(String[] args) {



        Queue securityQueue = new Queue();
        Queue checkinQueue = new Queue();

        //simulate people arriving to the airport, and doing checkin
        checkinQueue.push(addPerson(Catagories.Business));
        checkinQueue.push(addPerson(Catagories.Business));
        checkinQueue.push(addPerson(Catagories.Late));
        checkinQueue.push(addPerson(Catagories.Monkey));
        securityQueue.push(checkinQueue.pop());
        checkinQueue.push(addPerson(Catagories.Disabled));
        securityQueue.push(checkinQueue.pop());
        checkinQueue.push(addPerson(Catagories.Monkey));
        securityQueue.push(checkinQueue.pop());
        securityQueue.push(checkinQueue.pop());
        checkinQueue.push(addPerson(Catagories.Business));
        securityQueue.push(checkinQueue.pop());
        checkinQueue.push(addPerson(Catagories.Monkey));
        checkinQueue.push(addPerson(Catagories.Monkey));
        securityQueue.push(checkinQueue.pop());
        securityQueue.push(checkinQueue.pop());
        securityQueue.push(checkinQueue.pop());
        securityQueue.push(checkinQueue.pop());
        checkinQueue.push(addPerson(Catagories.Family));
        securityQueue.push(checkinQueue.pop());



        Person temp;
        System.out.println();
        for(int i = 0; i<10;i++){
            temp = securityQueue.pop();
            System.out.println("Customer : " + temp.getId() + " is through security and ready to board : " + temp.getCategory());
        }

    }
    public static Person addPerson(Catagories category){
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        Person temp = new Person(timestamp,category);
        return temp;
    }
}
