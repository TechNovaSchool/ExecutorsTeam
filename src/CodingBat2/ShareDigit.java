package CodingBat2;

public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        int modA = a%10;
        int modB= b %10;
        int divA = a/10;
        int divB = b/10;

        if (modA == modB || divA == divB || modA == divB || divA == modB ) {
            return true;
        }else {
            return false;
        }
    }

}
