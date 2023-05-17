package cart.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    @DisplayName("상품 이름이 정상이라면 정상적으로 생성되어야 한다.")
    public void testValidNameLength() {
        //given
        String value = "test";

        //when
        Name name = new Name(value);

        //then
        Assertions.assertThat(name.getValue()).isEqualTo(value);
    }

    @Test
    @DisplayName("상품 이름이 null 이라면 예외가 발생해야 한다.")
    public void testEmptyName() {
        //given
        String value = "";

        //expect
        Assertions.assertThatThrownBy(() -> new Name(value))
                .hasMessage("[ERROR] 상품명이 비어있습니다. 상품명을 입력해주세요.");
    }

    @Test
    @DisplayName("상품 이름 길이가 20을 초과한다면 예외가 발생해야 한다.")
    public void testExceededNameLength() {
        //given
        String value = "123456789123456789000";

        //expect
        Assertions.assertThatThrownBy(() -> new Name(value))
                .hasMessage("[ERROR] 상품명의 최대 길이를 초과했습니다. 20자 이내로 작성해주세요.");
    }
}