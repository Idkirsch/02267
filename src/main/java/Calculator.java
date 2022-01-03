public class Calculator {

    public int add(String numbers){
        if(numbers.length() == 0 ){
            return 0;
        }
        if(numbers.length() == 1){
            return Integer.parseInt(numbers);
        }
        if(numbers.length() > 1){
           // String[] splitNumbers = numbers.split("[,]",0);
            String[] splitNumbers = numbers.split("[\r\n,]+",0);

            int total=0;

            for (String myString: splitNumbers) {
                total = total + Integer.parseInt(myString);

            }
            return total;

        }

        else return -1;


    }


}
