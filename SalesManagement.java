public class SalesManagement implements Subject{
    private static int smallCount;
    private static int mediumCount;
    private static int largeCount;
    private SalesManagement instance;

    private SalesManagement(){

    }

    public SalesManagement getInstance(){
        if(instance == null){
            instance = new SalesManagement();
        }

        return instance;
    }

    public static int getSmallCount() {
        return smallCount;
    }

    public static int getMediumCount() {
        return mediumCount;
    }

    public static int getLargeCount() {
        return largeCount;
    }

    public static void setSmallCount(int smallCount) {
        SalesManagement.smallCount = smallCount;
    }

    public static void setMediumCount(int mediumCount) {
        SalesManagement.mediumCount = mediumCount;
    }

    public static void setLargeCount(int largeCount) {
        SalesManagement.largeCount = largeCount;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
