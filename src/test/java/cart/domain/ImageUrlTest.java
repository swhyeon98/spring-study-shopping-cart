package cart.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageUrlTest {

    // JPG, JPEG, PNG 모두 검증해야 하는가?
    @Test
    @DisplayName("이미지 URL이 정상적으로 생성되어야 한다.")
    public void create() {
        //given
        String value = "test.jpeg";

        //when
        ImageUrl imageUrl = new ImageUrl(value);

        //then
        Assertions.assertThat(imageUrl.getValue()).isEqualTo(value);
    }

    @Test
    @DisplayName("url이 비어있다면 예외가 발생해야 한다.")
    public void testEmptyImageUrl() {
        //given
        String value = "";

        //expect
        Assertions.assertThatThrownBy(() -> new ImageUrl(value))
                .hasMessage("[ERROR] 이미지 URL이 비어있습니다. 이미지 URL을 입력해주세요.");
    }

    @Test
    @DisplayName("이미지 URL이 올바른 포맷 형식이 아니라면 예외가 발생해야 한다.")
    public void testExceededNameLength() {
        //given
        String value = "test.js";

        //expect
        Assertions.assertThatThrownBy(() -> new ImageUrl(value))
                .hasMessage("[ERROR] 유효하지 않은 이미지 형식입니다.");
    }
}
