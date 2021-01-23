public class Logo extends HatDecorator{
    public Logo(HeadWear uniqueHat){
        super(uniqueHat);
    }
    public void hatType(){
        uniqueHat.hatType();
        setUniqueHat(uniqueHat);
    }
    private void setUniqueHat(HeadWear uniqueHat){
        System.out.println("Add a logo to the hat");
    }
}
