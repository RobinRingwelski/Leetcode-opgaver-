class Solution {
    public double[] convertTemperature(double celsius) {
        // Convert Celsius to Kelvin and fahrenheit!
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32.0;

        // Return the results as an array
        return new double[]{kelvin, fahrenheit};
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        double celsius1 = 36.50;
        double[] result1 = solution.convertTemperature(celsius1);
        System.out.printf("Input: %.2f\nOutput: [%.5f, %.5f]\n\n", celsius1, result1[0], result1[1]);

        double celsius2 = 122.11;
        double[] result2 = solution.convertTemperature(celsius2);
        System.out.printf("Input: %.2f\nOutput: [%.5f, %.5f]\n", celsius2, result2[0], result2[1]);
    }
}