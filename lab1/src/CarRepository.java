import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
    private ArrayList<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int index) {
        cars.remove(index);
    }

    public void updateCar(int index, Car newCar) {
        cars.set(index, newCar);
    }

    public ArrayList<Car> getAllCars() {
        return cars;
    }

    /**
     * Функция возврощает лист водителей со стажем больше 5 лет
     * @return список водителей
     */
    public List<String> getStage(){
        return cars.stream()
                .filter(e -> e.driver.stage > 5)
                .map(car -> car.driver.name + " " + car.driver.firstName + " " + car.driver.lastName)
                .toList();
    }
    /**
     * Функция возврощает лист автомобилей совесткого производства
     * @return список марок автомобилей
     */
    public List<String> getManufacture(){
        return cars.stream()
                .filter(e -> e.engine.manufacturer == "Россия"
                        || e.engine.manufacturer == "Казахстан"
                        || e.engine.manufacturer == "Беларусь"
                        || e.engine.manufacturer == "Латвия")
                .map(car -> car.mark)
                .toList();
        }
    }

