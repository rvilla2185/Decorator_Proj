public class Stickers extends HatDecorator{
    public Stickers(HeadWear uniqueHat){
        super(uniqueHat);
    }
    public void hatType(){
        uniqueHat.hatType();
        setUniqueHat(uniqueHat);
    }
    private void setUniqueHat(HeadWear uniqueHat){
        System.out.println("Add stickers to the hat");
    }
    public double cost(){
        return uniqueHat.cost() + 1.00;
    }

}
