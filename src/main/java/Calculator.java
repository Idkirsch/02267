public class Calculator {

    public int add(String numbers){
        int length = numbers.length();

        if(length == 0 ){
            return 0;
        }
        if(length == 1){
            return Integer.parseInt(numbers);
        }
        if(length > 1){

            if(numbers.contains("//")){
                String[] splitDelim = numbers.split("[\n\r /]+",0);
                String delimiter = splitDelim[1];
                String[] splitNumbers = splitDelim[2].split("["+delimiter+"]",0);
                int total=0;
                for (String myString: splitNumbers) {
                    total += Integer.parseInt(myString);
                }
                return total;
            }
            else{
                String[] splitNumbers = numbers.split("[\r\n,]+",0);
                int total=0;
                for (String myString: splitNumbers) {
                    total += Integer.parseInt(myString);
                }
                return total;
            }
        }

        else return -1;


    }


}
