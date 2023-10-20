package baseball.view;

import baseball.check.NumberCheck;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    NumberCheck numberCheck = new NumberCheck();
    public List<Integer> PlayerNumberInput() {
        List<Integer> playernum = new ArrayList<>();
        String snum = Console.readLine();

        numberCheck.NumbersCheck(snum); // 숫자 검증

        for(String s : snum.split("")) {
            playernum.add(Integer.parseInt(s));
        }

        return playernum;
    }

    public boolean FinishGame() {
        String cond = Console.readLine();

        numberCheck.NumberCheck(cond); // 숫자 검증

        return Integer.parseInt(cond) == 1;
    }

}
