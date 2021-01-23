public abstract class HatDecorator implements HeadWear {
    protected HeadWear uniqueHat;

    public HatDecorator(HeadWear uniqueHat) {
        this.uniqueHat = uniqueHat;
    }
    public void hatType() {
        uniqueHat.hatType();
    }
}
