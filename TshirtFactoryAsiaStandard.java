public class TshirtFactoryAsiaStandard extends TshirtFactory{

    public Tshirt createTshirt(String size){
        if(size.toLowerCase().equals("small")){
            return new TshirtAsiaSmall();
        }else if(size.toLowerCase().equals("medium")){
            return new TshirtAsiaMedium();
        }else if(size.toLowerCase().equals("large")){
            return new TshirtAsiaLarge();
        }else{
            return null;
        }
    }

}
