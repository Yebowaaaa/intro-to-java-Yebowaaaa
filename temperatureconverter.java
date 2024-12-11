import java.util.Scanner;

public class temperatureconverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature;

        if (choice == 1) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
        } else if (choice == 2) {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
        } else {
            System.out.println("Invalid Choice. Please choose 1  or 2.");
        }
        scanner.close();
    }
}