public class Truck extends Transport {

    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку прицепа");
    }
    public void service() {
        updateTyre() ;
        checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
