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

        CarRepository repository = new CarRepository();
        repository.addCar(car1);
        repository.addCar(car2);
        repository.addCar(car3);
        repository.addCar(car4);
        repository.addCar(car5);
        repository.addCar(car6);
        repository.addCar(car7);
        repository.addCar(car8);
        repository.addCar(car9);
        repository.addCar(car10);

        System.out.println("\nВодители со стажем более 5 лет:\n");
        var list1 = repository.getStage();
        for(var car : list1){
            System.out.println(car);
        }
        System.out.println("\nАвтомобили советского производства:\n");
        var list2 = repository.getManufacture();
        for(var car : list2){
            System.out.println(car);
        }
    }


}