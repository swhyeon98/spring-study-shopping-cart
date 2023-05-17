package cart.domain;

public class Name {

    private static String ERROR_MESSAGE = "[ERROR] ";
    private static String NAME_EMPTY_ERROR = "상품명이 비어있습니다. 상품명을 입력해주세요.";
    private static String NAME_LENGTH_EXCEEDED_ERROR = "상품명의 최대 길이를 초과했습니다. 20자 이내로 작성해주세요.";
    private static int MAX_LENGTH = 20;

    private final String value;

    public Name(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        validateEmpty(value);
    }

    private void validateEmpty(String value) {
        if (value.isEmpty()) {
            throw new IllegalArgumentException(ERROR_MESSAGE + NAME_EMPTY_ERROR);
        }
    }

    private void validateNameLength(String value) {
        if (value.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE + NAME_LENGTH_EXCEEDED_ERROR);
        }
    }
}
