
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.meow(1);
        cat.getStatus();
        System.out.println(cat.getStatus());
        double eatCat = 0 ;
        for (int x = 0 ; x<20 ; x++){
            eatCat = eatCat + 100.00;
            cat.feed(eatCat);
            System.out.println(cat.getStatus());
            if (cat.getStatus().equals("Sleeping")){
                System.out.println("SPIT");
            } else {
                System.out.println("BABAX");

            }
        }
    }
}
