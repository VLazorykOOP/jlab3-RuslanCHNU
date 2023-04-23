//Лабораторна робота 3
//Завдання 1

class Detail {
    protected String name;
    protected double weight;
    protected double cost;

    public Detail(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public void Show() {
        System.out.println("Назва: " + name);
        System.out.println("Вага: " + weight);
        System.out.println("Вартість: " + cost);
    }
}

class Mechanism extends Detail {
    private int numParts;

    public Mechanism(String name, double weight, double cost, int numParts) {
        super(name, weight, cost);
        this.numParts = numParts;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Кількість деталей: " + numParts);
    }
}

class Product extends Detail {
    private String manufacturer;

    public Product(String name, double weight, double cost, String manufacturer) {
        super(name, weight, cost);
        this.manufacturer = manufacturer;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Виробник: " + manufacturer);
    }
}

class Node extends Detail {
    private String location;

    public Node(String name, double weight, double cost, String location) {
        super(name, weight, cost);
        this.location = location;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Локація: " + location);
    }
}

public class Lab3_1 {
    public static void main(String[] args) {
        Detail[] details = new Detail[4];

        details[0] = new Detail("Болт", 0.05, 0.10);
        details[1] = new Mechanism("Двигун", 120.5, 5000.0, 100);
        details[2] = new Product("Телефон", 0.3, 200.0, "Samsung");
        details[3] = new Node("Перемикач", 1.5, 50.0, "Room A");

        for (int i = 0; i < details.length; i++) {
            details[i].Show();
            System.out.println("------------------");
        }
    }
}
