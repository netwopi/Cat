
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double amounth;

    public double getAmounth() {
        return amounth;
    }

    public Cat()
    {
        weight = 1500.0 + 1000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow(int x) {
        for (int s = 1; s < x; s++) {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }

    public void feed(Double amount)
    {
        amounth=getAmounth()+amount;
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }
    public void pie(){
        weight=weight-0.1;
        System.out.println("Я пописал и теперь мой вес " + weight );
    }

    public Double getWeight()
    {
        return weight;
    }


    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
