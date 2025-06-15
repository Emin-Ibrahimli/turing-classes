public class Fesiller {
    public static void main(String[] args) {
        int december = 12;
        int january = 1;
        int February = 2;
        int March = 3;
        int April = 4;
        int May = 5;
        int June = 6;
        int July = 7;
        int August = 8;
        int September = 9;
        int October = 10;
        int November = 11;

        int month = 5;


        String result = (month == 12 || month == 1 || month == 2) ? "Qış fəsili" :
                (month > 2 && month < 6) ? "Yaz fəsili" :
                        (month > 5 && month < 9) ? "Yay fəsili" :
                                (month > 8 && month < 12) ? "Payız fəsili" : "Yanlış fəsil";

System.out.println(month);
System.out.println(result);








  //      if (month == 12 || month == 1 || month == 2) {

//            System.out.println("Qış fəsili");
  //      }
    //    else if (month > 2 && month < 6) {

//        System.out.println("Yaz fəsilidir");
  //      }
    //    else if (month > 5 && month < 8) {

      //      System.out.println("Yay fəsili");
        //}
       // else if (month > 8 && month < 12) {

       //     System.out.println("Payız fəsili");
        //}




    }
}

