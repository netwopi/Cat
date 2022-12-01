import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cat
{
    private String color;
    public static final int LEGS_COUNT = 4;
    public static final int NUMBER_OF_EYES = 4;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;
    private double originWeight;
    private double weight;
    public static int count;

    private double amounth;

    public double getAmounth() {
        return amounth;
    }

    public String getColor() {
        return color;
    }

    public Cat() {
        Random rand = new Random();
        weight = 1500.0 + 1000.0 * Math.random();
        originWeight = weight;
        count++;
        List<String> enumNames = Stream.of(ColorCat.values())
                .map(ColorCat::name)
                .collect(Collectors.toList());
        color = enumNames.get(rand.nextInt(enumNames.size()));
    }

    public Cat(double weight) {
        Random rand = new Random();
        this.weight = weight;
        originWeight = weight;
        count++;
        List<String> enumNames = Stream.of(ColorCat.values())
                .map(ColorCat::name)
                .collect(Collectors.toList());
        color = enumNames.get(rand.nextInt(enumNames.size()));
    }

    public Cat(String color, double originWeight, double weight, double amounth) {
        this.color = color;
        this.originWeight = originWeight;
        this.weight = weight;
        this.amounth = amounth;
    }

    public static Integer getCount() {
        return count;
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
        if(weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count--;
            return "Exploded";

        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", originWeight=" + originWeight +
                ", weight=" + weight +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public void setAmounth(double amounth) {
        this.amounth = amounth;
    }
}
