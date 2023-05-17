package cart.domain;

public class ImageUrl {
    private static final String ERROR_MESSAGE = "[ERROR] ";
    private static final String URL_EMPTY_ERROR = "이미지 URL이 비어있습니다. 이미지 URL을 입력해주세요.";
    private static final String URL_FORMAT_ERROR = "유효하지 않은 이미지 형식입니다.";
    private static final String VALID_URL_JPG_FORMAT = ".jpg";
    private static final String VALID_URL_JPEG_FORMAT = ".jpeg";
    private static final String VALID_URL_PNG_FORMAT = ".png";

    private final String value;

    public ImageUrl(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        validateEmpty(value);
        validateUrlFormat(value);
    }

    private void validateEmpty(String value) {
        if (value.isEmpty()) {
            throw new IllegalArgumentException(ERROR_MESSAGE + URL_EMPTY_ERROR);
        }
    }

    private void validateUrlFormat(String value) {
        if (!value.matches(VALID_URL_JPG_FORMAT)) {
            throw new IllegalArgumentException(ERROR_MESSAGE + URL_FORMAT_ERROR);
        }
        if (!value.matches(VALID_URL_JPEG_FORMAT)) {
            throw new IllegalArgumentException(ERROR_MESSAGE + URL_FORMAT_ERROR);
        }
        if (!value.matches(VALID_URL_PNG_FORMAT)) {
            throw new IllegalArgumentException(ERROR_MESSAGE + URL_FORMAT_ERROR);
        }
    }

    public String getValue() {
        return value;
    }
}
