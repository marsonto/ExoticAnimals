package ShoppingApp.services;

public class Animal {

    private int id;
    private String species;
    private String name;
    private int age;
    private String location;
    private double price;

    public Animal(){}

    public Animal(final int id, final String species, final String name, final int age, final String location, final double price){
        this.id = id;
        this.species = species;
        this.name = name;
        this.age = age;
        this.location = location;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
