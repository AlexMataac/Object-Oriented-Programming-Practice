package enumerators;


public class Main {
    public static void main(String[] args) {
//        AILevel level = AILevel.EASY;
////        System.out.println(level);
//
////        if (level == AILevel.EASY) {
////            System.out.println("For Babies");
////        } else if (level == AILevel.MEDIUM) {
////            System.out.println("For Kids");
////        } else {
////            System.out.println("For Adult");
////        }
//        switch (level) {
//            case EASY:
//                System.out.println("For Babies");
//                break;
//            case MEDIUM:
//                System.out.println("For Kids");
//                break;
//            case HARD:
//                System.out.println("For Adult");
//                break;
//        }

//        USCurrency money = USCurrency.NICKLE;
//        System.out.println(money.value);
        USCurrency coins[] = new USCurrency[3];
        coins[0] = USCurrency.DIME;
        coins[1] = USCurrency.QUARTER;
        coins[2] = USCurrency.NICKLE;

        float sum = 0;

        for (USCurrency coin: coins) {
            sum = sum + coin.value;
            System.out.println(coin.name);
        }
        System.out.println(sum);
    }
}
