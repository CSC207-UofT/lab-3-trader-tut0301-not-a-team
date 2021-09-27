public class Bird implements Tradable, Domesticatable{

    @Override
    public String sound() {
        return "Biu biu biu";
    }

    @Override
    public int getPrice() {return 100;}
}
