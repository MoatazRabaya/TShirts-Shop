public class TshirtRedDecorator extends TshirtDecorator{
    Tshirt shirt;

    public TshirtRedDecorator(Tshirt shirt){
        this.shirt = shirt;
    }

     public String getDescription(){
        return shirt.getDescription() + " With Red Colour";
     }
}
