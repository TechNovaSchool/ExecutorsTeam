package CodingBat2;

public class InOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b>a && c>b ){
            return true;
        }else if (bOk == true && c>b &&b <= a ){
            return bOk;
        }return false;
    }

}
