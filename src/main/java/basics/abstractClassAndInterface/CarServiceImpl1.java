package basics.abstractClassAndInterface;

public class CarServiceImpl1 implements CarService{
    @Override
    public void saveCarInDatabase() {
        System.out.println("Saving car into Oracle DB");
    }

    @Override
    public void readCarFromDatabase() {
        System.out.println("Saving car into Oracle DB");
    }

    @Override
    public void updateCarFromDatabase() {
        System.out.println("Saving car into Oracle DB");
    }
}
