package cart.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PriceTest {
    @Test
    @DisplayName("가격이 정상적이라면 정상으로 생성되어야 한다.")
    void create() {
        //given
        int num = 1000;

        //when
        Price price = new Price(num);

        //then
        Assertions.assertThat(price.getValue()).isEqualTo(num);
    }

    @Test
    @DisplayName("가격이 0 이하라면 예외가 발생해야 한다.")
    void validatePrice() {
        int price = 0;

        Assertions.assertThatThrownBy(() -> new Price(price))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 가격은 0이상이어야 합니다.");
    }
}