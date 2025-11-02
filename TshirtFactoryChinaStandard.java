public class TshirtFactoryChinaStandard extends TshirtFactory {
    public Tshirt createTshirt(String size){
        if(size.toLowerCase().equals("small")){
            return new TshirtChinaSmall();
        }else if(size.toLowerCase().equals("medium")){
            return new TshirtChinaMedium();
        }else if(size.toLowerCase().equals("large")){
            return new TshirtChinalLarge();
        }else{
            return null;
        }
    }
}
