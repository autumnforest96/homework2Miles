public class Main {
    public static void main(String[] args) {

        int ticketPrice = 12666; // стоимость билета
        int milesRub = 20; // количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / milesRub; // рассчитываем количество миль и приводим к целому числу
        System.out.println("Миль начислено: " + bonusMiles);

    }
}