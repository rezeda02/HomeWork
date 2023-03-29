public class Main {
    public static void main(String[]  args) {

        int countAdults = 9; // взрослые
        int countPensioners = 5; // пеннсионеры
        int countChildren = 11; // дети

        double ticketPrice = 70; // стоимость билета

         //скидки
        int  pensionerDiscount = 30;
        int childDiscount = 50;


        double result = countAdults *  ticketPrice + countChildren * ticketPrice *  (100 - childDiscount) / 100.0
                + countPensioners *  ticketPrice * (100 - pensionerDiscount) / 100.0;


        System.out.println("Общая стоимость" + result + "монет" ) ;
    }
}
