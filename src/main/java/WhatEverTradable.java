public class WhatEverTradable implements Tradable, Drivable, Domesticatable{
    private int maxSpeed = 100;

    @Override
    public String sound() {
        return "It makes a sound";
    }

    @Override
    public void upgradeSpeed() {
        maxSpeed += 50;
    }

    @Override
    public void downgradeSpeed() {
        int lowered = 50;
        if (maxSpeed - lowered >= 0){
            maxSpeed -= lowered;
        }
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
