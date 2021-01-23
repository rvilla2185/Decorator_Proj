public class Text extends HatDecorator{
    public Text(HeadWear uniqueHat){
        super(uniqueHat);
    }
    public void hatType(){
        uniqueHat.hatType();
        setUniqueHat(uniqueHat);
    }
    private void setUniqueHat(HeadWear uniqueHat){
        System.out.println("Add text to the hat");
    }
}
