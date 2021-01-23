public class HatDemoDriver {
    public static void main(String[] args){
        HeadWear beanie = new Beanie();
        HeadWear baseBallCap = new Cap();
        baseBallCap = new Text(baseBallCap);
        HeadWear hardHat  = new Hardhat();
        hardHat = new Stickers(hardHat);
        hardHat = new Logo(hardHat);

        beanie.hatType();
        System.out.println("The cost of this hat is "+ beanie.cost()+"\n");
        baseBallCap.hatType();
        System.out.println("The cost of this hat is "+ baseBallCap.cost()+"\n");
        hardHat.hatType();
        System.out.println("The cost of this hat is "+ hardHat.cost()+"\n");

    }
}
