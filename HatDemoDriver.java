public class HatDemoDriver {
    public static void main(String[] args){
        HeadWear beanie = new Beanie();
        HeadWear baseBallCap = new Cap();
        baseBallCap = new Text(baseBallCap);
        HeadWear hardHat  = new Hardhat();
        hardHat = new Stickers(hardHat);
        hardHat = new Logo(hardHat);

        baseBallCap.hatType();
        hardHat.hatType();
    }
}
