import java.util.*;

public class Game {
    public void guess(String guessNumber){
        if (guessNumber == null) {
            throw new IllegalArgumentException();
        }

        if(guessNumber.length() != 3){
            throw new IllegalArgumentException();
        }

        if(isNotNumber(guessNumber)){
            throw new IllegalArgumentException();
        }

        if(hasDuplicate(guessNumber)){
            throw new IllegalArgumentException();
        }
    }

    public  boolean hasDuplicate(String guessNumber) {
        // 입력된 문자열이 null이거나 길이가 1보다 작으면 중복된 숫자가 없음
        if (guessNumber == null || guessNumber.length() < 2) {
            return false;
        }

        HashSet<Character> seen = new HashSet<>();

        for (char c : guessNumber.toCharArray()) {
            // 이미 나온 숫자인지 HashSet을 이용하여 확인
            if (seen.contains(c)) {
                return true;
            }
            // HashSet에 숫자 추가
            seen.add(c);
        }

        // 중복된 숫자가 없음
        return false;
    }

    private boolean isNotNumber(String guessNumber) {
        char[] chars = guessNumber.toCharArray();
        for (char number : chars) {
            if(number < '0' || number > '9'){
                return true;
            }
        }
        return false;
    }
}
