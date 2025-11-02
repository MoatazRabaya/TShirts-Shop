public class TshirtBlueDecorator extends TshirtDecorator{
    Tshirt shirt;

    public TshirtBlueDecorator(Tshirt shirt){
        this.shirt = shirt;
    }

    public String getDescription(){
        return shirt.getDescription() + " With Blue Colour";
    }

}
