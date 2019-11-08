public class Animal {
    private int age;
    private double weight;
    public Animal(int age, double weight)
    {
        this.age = age;
        this.weight = weight;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public void walk()
    {
        System.out.println("Animal is walking");
    }
    public void run()
    {
        System.out.println("Animal is running");
    }
}
