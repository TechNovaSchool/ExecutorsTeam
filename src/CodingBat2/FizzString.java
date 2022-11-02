package CodingBat2;

public class FizzString {
    public String fizzString(String str) {
        int cut = str.length() -1;
        if (str.charAt(0) == 'f' && str.charAt(cut) !='b'){
            return "Fizz";
        }else if (str.charAt(cut) =='b' && str.charAt(0) != 'f'){
            return "Buzz";
        }else if((str.charAt(0) == 'f') && (str.charAt(cut) =='b')){
            return "FizzBuzz";
        }else {
            return str;
        }
    }

    public static void main(String[] args) {
        FizzString fb = new FizzString();

        System.out.println(fb.fizzString("dib"));
        System.out.println(fb.fizzString("fig"));
        System.out.println(fb.fizzString("fib"));
    }


}
