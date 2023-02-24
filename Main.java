public class Main {

    // задание полей
   static double TelescopePrice = 14_000; // стоимость телескопа
    static double account = 1000; // счёт пользователя
    static double stipend = 2500; // стипендия
    static double percentBank = 5; // годовая процентная ставка на счету
    static double percentMonth = 5.0 / 12.0; // месячная процентная ставка по счёту

    static double countMonth = 0;


            public static void main(String[] args) {
                System.out.println("Потребовалось " + countMonth() + " месяцев");
                System.out.println("осталось " + (account - TelescopePrice) + "монет");
            }


    /**
     * Метод расчета количества месяцев
     * @return
     */
        static double countMonth() {

        while (TelescopePrice > account ) {
        countMonth = countMonth + 1; // countMonth++;

            account = account + (account * percentMonth ) /100 + stipend;
        }

  /*      for (; TelescopePrice > account;) {

            countMonth = countMonth + 1; // countMonth++;

            account = account + stipend;
        }*/

            return countMonth;
        }

}