public class Felidae extends Animal {
    public Felidae(int age, double weight)
    {
        super(age, weight);
    }

    @Override
    public void walk()
    {
        System.out.println("Felidae is walking");
    }

    @Override
    public void run()
    {
        System.out.println("Felidae is running");
    }

    public void meow()
    {
        System.out.println("Felidae is meowing meowing");
    }
}
