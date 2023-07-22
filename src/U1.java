public class U1 extends Rocket {
    private final int rocketCostU1 = 100;
    private final int rocketWeightU1 = 10 * 1000;
    private final int maxWeightU1 = 18 * 1000;
    private  int cargoCarried;
    private final int cargoLimit = maxWeightU1 - rocketWeightU1;

    public U1(){
        setRocketCost(rocketCostU1);
        setMaxWeight(maxWeightU1);
        setRocketWeight(rocketWeightU1);
        setCargoCarried(cargoCarried);
        setCargoLimit(cargoLimit);

    }
    public boolean launch() {
        double launchExplosionChance = 5 * ((double) getCargoCarried() / getCargoLimit());
        double random = (Math.random() * 100 + 1);
        return !(random <= launchExplosionChance);
    }
    public boolean land() {
        double landCrashChance = 1 * ((double) getCargoCarried() / getCargoLimit());
        double random = (Math.random() * 100 + 1);
        return !(random <= landCrashChance);
    }

}
