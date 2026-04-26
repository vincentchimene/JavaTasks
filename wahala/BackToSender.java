public class BackToSender {

    public int calculateRidersPay(int collectionRate) {
        int amountPerParcel = 0;
        int basePay = 5000;

    
        if(collectionRate < 50) {
            amountPerParcel = 160;
        }
        else if(collectionRate >= 50 && collectionRate <= 59) {
            amountPerParcel = 200;
        }
        else if(collectionRate >= 60 && collectionRate <= 69) {
            amountPerParcel = 250;
        }
        else if(collectionRate >= 70) {
            amountPerParcel = 500;
        }
        return (collectionRate * amountPerParcel + basePay);                                
    }
}

