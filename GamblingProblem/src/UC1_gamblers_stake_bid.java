public class UC1_gamblers_stake_bid {
    public static void main(String[] args) {
        int stake = 100;
        int nextStake = stake;
        int endDayStake = 0;
        int bet = 10;
        double random = 0.0;
        int win = 0;
        int loss = 0;
        int dayWon = 0;
        int dayLost = 0;
        int percent = (stake * 50) / 100;
        int win50 = stake + percent;
        int loss50 = stake - percent;
        for (int month = 1; month <= 2; month++) {
            System.out.println(" ");
            System.out.println("MONTH: " + month);
            for (int day = 1; day <= 20; day++) {
                System.out.println("MONTH "+month+", DAY: " + day);
                System.out.println(" ");
                System.out.println("Gambler started gambling.");
                while (stake < win50 && stake > loss50) {
                    random = Math.random();
                    if (random < 0.5) {
                        win++;
                        stake = stake + bet;
                        System.out.println("Gambler won the round");
                        System.out.println("Gambler's present stake is " + stake);
                    } else if (random > 0.5) {
                        loss++;
                        stake = stake - bet;
                        System.out.println("Gambler lost the round");
                        System.out.println("Gambler's present stake is " + stake);
                    }
                }
                stake++;
                System.out.println(" ");
                System.out.println("Total number of times the Gambler won and lost in the day " + day+": ");
                System.out.print("win: " + win);
                System.out.println(", lost: " + loss);;
                win=0;
                loss=0;
                endDayStake = stake - 1;
                stake = nextStake;
                if (endDayStake<100){
                    dayWon++;
                    System.out.println("Gambler lost the day.");
                } else if (endDayStake>100) {
                    dayLost++;
                    System.out.println("Gambler won the day");
                }
                System.out.println(" ");
            }
            System.out.println("In month "+month+",the Gambler won total numbers of days:" +dayWon);
            System.out.println("In month "+month+",the Gambler lost total numbers of days:" +dayLost);
            dayWon=0;
            dayLost=0;
        }
    }
}
