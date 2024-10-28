package racingcar;

import static racingcar.OutputMessage.*;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class InputHandler {

    public List<String> getCarNames() {
        System.out.println(CAR_NAME_INPUT_MESSAGE.getMessage());

        String input = Console.readLine();
        return Arrays.stream(input.split(","))
                .map(InputValidator::validateCarName).toList();
    }

    public String getRoundSize() {
        System.out.println(ROUND_SIZE_INPUT_MESSAGE.getMessage());
        String input = Console.readLine();
        return InputValidator.validateRoundCount(input);
    }
}
