class Solution {
    String compareFrac(String str) {
        String[] fractions = str.split(",");
        String[] firstFractionParts = fractions[0].trim().split("/");
        double firstNumerator = Double.parseDouble(firstFractionParts[0].trim());
        double firstDenominator = Double.parseDouble(firstFractionParts[1].trim());
        double firstValue = firstNumerator / firstDenominator;
        String[] secondFractionParts = fractions[1].trim().split("/");
        double secondNumerator = Double.parseDouble(secondFractionParts[0].trim());
        double secondDenominator = Double.parseDouble(secondFractionParts[1].trim());
        double secondValue = secondNumerator / secondDenominator;
        if (firstValue > secondValue) {
            return fractions[0].trim();
        } else if (secondValue > firstValue) {
            return fractions[1].trim();
        } else {
            return "equal";
        }
    }
}
