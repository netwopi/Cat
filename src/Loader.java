
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.meow(1);
        cat.getStatus();
        System.out.println(cat.getStatus());
        double eatCat = 0 ;
        for (int x = 0 ; x<100 ; x++){
            eatCat =+ 0.10;
            cat.feed(eatCat);
            System.out.println(cat.getStatus());
            if (cat.getStatus().equals("Sleeping")){
                System.out.println("SPIT");
            } else {
                System.out.println("BABAX");

            }
        }
        System.out.println(cat.getWeight());
        cat.pie();
        System.out.println(cat.getAmounth());
    }
}
