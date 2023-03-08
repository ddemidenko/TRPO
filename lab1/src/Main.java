import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A", 2700, new Driver("Косиченко", "Даниил", "Константинович", 5), new Engine("Германия", 400));
        Car car2 = new Car("BMW", "B", 2500, new Driver("Булкин", "Антон", "Андреевич", 3), new Engine("Польша", 500));
        Car car3 = new Car("Ford", "C", 2450, new Driver("Диниленко", "Виктор", "Генадьевич", 10), new Engine("Латвия", 550));
        Car car4 = new Car("Kia", "E", 2300, new Driver("Путанов", "Дмитрий", "Артёмович", 6), new Engine("Россия", 700));
        Car car5 = new Car("Honda", "F", 2800, new Driver("Крикунов", "Василий", "Петрович", 8), new Engine("Австралия", 600));
        Car car6 = new Car("Lada", "S", 2200, new Driver("Андропов", "Евгений", "Витальевич", 9), new Engine("Беларусь", 590));
        Car car7 = new Car("Mazda", "A", 3000, new Driver("Измайлов", "Вадим", "Евгеньевич", 3), new Engine("Китай", 340));
        Car car8 = new Car("Skoda", "B", 2480, new Driver("Батонов", "Никита", "Васильевич", 2), new Engine("Япония", 440));
        Car car9 = new Car("Nissan", "C", 2100, new Driver("Карпович", "Пётр", "Сергеевич", 5), new Engine("Швейцария", 560));
        Car car10 = new Car("Toyota", "A", 2950, new Driver("Бондарев", "Кирилл", "Юрьевич", 7), new Engine("Казахстан", 410));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        System.out.println("\nВодители со стажем более 5 лет:\n");
        getStage(cars);
        System.out.println("\nАвтомобили советского производства:\n");
        getManufacture(cars);

    }
    public static void getStage(ArrayList<Car>cars){
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).driver.stage > 5) {
                System.out.println(cars.get(i).driver.name + " " + cars.get(i).driver.firstName + " " + cars.get(i).driver.lastName);
            }
        }
    }
    public static void getManufacture(ArrayList<Car>cars){
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).engine.manufacturer == "Россия"
                || cars.get(i).engine.manufacturer == "Казахстан"
                || cars.get(i).engine.manufacturer == "Беларусь"
                || cars.get(i).engine.manufacturer == "Латвия")
            {
                System.out.println(cars.get(i).mark);
            }
        }
    }

}