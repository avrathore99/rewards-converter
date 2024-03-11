import model.RewardValue;

import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a miles value to convert to cash value: ");
        var input_value = scanner.nextInt();
        int mileValue;
        try {
            System.out.println("converting $" + input_value + " to miles");
            RewardValue rewardsValue = new RewardValue(input_value);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getCashValue() + " Cash");
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }


    }
}