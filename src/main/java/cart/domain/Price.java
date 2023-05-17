package cart.domain;

public class Price {
    private static final String ERROR_MESSAGE = "[ERROR] ";
    private static final int MIN_PRICE = 0;
    private static final int MAX_PRICE = Integer.MAX_VALUE;

    private final int value;

    public Price(int value) {
        validatePrice(value);
        this.value = value;
    }

    private void validatePrice(int value) {
        if (value <= MIN_PRICE) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "가격은 " + MIN_PRICE + "이상이어야 합니다.");
        }

        if (value > MAX_PRICE) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "가격은 " + MAX_PRICE + "이하이어야 합니다.");
        }
    }

    public int getValue() {
        return value;
    }
}