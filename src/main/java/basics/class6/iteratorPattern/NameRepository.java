package basics.class6.iteratorPattern;

import basics.class6.iteratorPattern.impl.NameIterator;

public class NameRepository {

    public Iterator getIterator() {
        return new NameIterator();
    }

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
