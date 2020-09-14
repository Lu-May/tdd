public class Mommifier {
    public String convert(String string) {
        if (string == null)
            return string;
        if (isMoreThanThirtyPercent(string)) {
            if (haveContinuousSetOfVowels(string)) {
                return insertMommy(string).toString();
            }
        }
        return string;
    }

    private boolean haveContinuousSetOfVowels(String string) {
        return isContinuous(string);
    }

    private StringBuilder insertMommy(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.insert(stringBuilder.indexOf("ee"), "mommy");
        return stringBuilder;
    }

    private boolean isContinuous(String string) {
        return string.contains("aa") || string.contains("ee") || string.contains("ii") || string.contains("oo") || string.contains("uu");
    }

    private boolean isMoreThanThirtyPercent(String string) {
        int vowelsCount = 0;
        char[] stringToChar = string.toCharArray();
        for (int i = 0; i < stringToChar.length; ++i) {
            if (isaVowels(stringToChar[i])) {
                vowelsCount++;
            }
        }
        return moreThanThirtyPercent(vowelsCount, stringToChar);
    }

    private boolean moreThanThirtyPercent(int vowelsCount, char[] stringToChar) {
        return 10*(vowelsCount / stringToChar.length) > 3;
    }

    private boolean isaVowels(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
}
