
public class Queue {
    private Person[] listOfPersons = new Person[1000];
    private int size = 0;

    public void push(Person person){
        listOfPersons[++size] = person;
        swim(size);
    }

    public Person pop() {
        if ( size == 0 )return null;
        Person person = listOfPersons[1];
        listOfPersons[1] =  listOfPersons[size--];
        sink(1);
        return person;
    }

    private void switchPlaces(int a, int b) {
        Person person = listOfPersons[a];
        listOfPersons[a] =  listOfPersons[b];
        listOfPersons[b] = person;
    }

    private void sink(int indexNr){
        while (2*indexNr <= size){
            int firstchild = indexNr * 2 ;
            if (listOfPersons[firstchild].compareTo(listOfPersons[firstchild+1])>0) firstchild++;
            if (listOfPersons[firstchild].compareTo(listOfPersons[indexNr])>0 ) break;
            switchPlaces(firstchild,indexNr);
            indexNr = firstchild;
            }
        }

    private void swim (int indexNr){
        while(indexNr > 1 && listOfPersons[indexNr].compareTo(listOfPersons[indexNr/2]) < 0  ){
            switchPlaces(indexNr,indexNr/2);
            indexNr = indexNr/2;
        }
    }
}
