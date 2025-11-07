/*
Convert Temperature: 

Declare a variable "temperature" and initialise it with a value of 25.5 (in Celsius) and Print it in Celsius and Kelvin(add 273 to temperature in Celsius).
Print the output in the same format as given below.(there is a single space around - (hyphen))

Sample 1:

Output
Celsius - 25.5  
Kelvin - 298.5  
*/
public class Main {
    public static void main(String[] args) {
        double temperature = 25.5;
        double kelvin = temperature + 273.0;
        System.out.println("Celsius - "  + temperature);
        System.out.println("Kelvin - " + kelvin);
        
    }
}
/*
Celsius ↔ Kelvin
These two are linearly related, only differing by a constant offset.
K = °C + 273.15
(Kelvin is always 273.15 higher than Celsius)
°C = K − 273.15

Celsius ↔ Fahrenheit
Celsius and Fahrenheit differ by both scale and offset.
°F = (°C × 9/5) + 32
(Multiply Celsius by 9/5, then add 32)
°C = (°F − 32) × 5/9
(Subtract 32, then multiply by 5/9)
*/
