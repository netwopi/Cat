
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        cat.meow(1);
        cat.getStatus();
        System.out.println(cat.getStatus());
        double eatCat = 0 ;
        for (int x = 0 ; x<10 ; x++){
            eatCat =+ 100;
            cat.feed(eatCat);
            System.out.println(cat.getStatus());
            if (cat.getStatus().equals("Sleeping")){
                System.out.println("SPIT");
            } else {
                System.out.println("BABAX");
                break;
            }
        }
        System.out.println("вес котика : "+cat.getWeight());
        cat.pie();
        System.out.println("всего сьел  : "+cat.getAmounth());

        System.out.println("всего : "+Cat.getCount()+ " котов .");
    }
}
