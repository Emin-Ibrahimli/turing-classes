public class Qiymetlendirme {
    public static void main(String[] args){

int qiymet =84;
String result=( qiymet >=0 && qiymet <= 49)?"Təəsüfki kəsildiniz.":
        (qiymet >= 50 && qiymet <= 59)?"Zəif nəticə.":
                (qiymet >= 60 && qiymet <= 69)?"Qənaətbəxş.":
                        (qiymet >=70 && qiymet <= 89)?"Yaxşı nəticə.":
                                (qiymet >= 90 && qiymet <= 100)?"Əla nəticə.":"Yanlış qiymət.";
System.out.println(qiymet);
System.out.println(result);


    }
}