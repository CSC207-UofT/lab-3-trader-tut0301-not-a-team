public class Spaceship implements Drivable, Tradable{
    private int maxSpeed;

    public Spaceship(){
        this.maxSpeed = 100;
    }
    @Override
    public void upgradeSpeed() {
        /*
         * Increase the speed of the spaceship.
         */
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        /*
         * Reduce the speed of the spaceship
         */
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        /*
        Return the maximum speed of the spaceship
         */
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        /*
        Return the price of the spaceship.
         */
        return 10000;
    }
}
