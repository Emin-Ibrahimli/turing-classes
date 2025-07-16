package RomanNum;

    public class Num {

        private static int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 4, 5, 1};
        private static String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        public String intRoman(int num) {

            String roman = "";

        for(int i = 0; i< value.length; i++){
            while(num>=value[i]){
                roman = roman + symbol[i];
                num = num - value[i];
            }
        }
        return roman;
    }
}