package nextstep.subway.line.domain;

import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static nextstep.subway.line.domain.SectionTestFixture.강남역;
import static nextstep.subway.line.domain.SectionTestFixture.교대역;
import static nextstep.subway.line.domain.SectionTestFixture.역삼역;
import static nextstep.subway.line.domain.SectionTestFixture.강남역_역삼역_구간;
import static nextstep.subway.line.domain.SectionTestFixture.역삼역_교대역_구간;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("구간 모음 테스트")
class SectionsTest {

    @DisplayName("생성 확인")
    @Test
    void 생성_확인() {
        // given
        Section 강남역_역삼역_구간 = 강남역_역삼역_구간();
        Section 역삼역_교대역_구간 = 역삼역_교대역_구간();

        // when
        Sections sections = Sections.of(Arrays.asList(강남역_역삼역_구간, 역삼역_교대역_구간));

        // then
        assertThat(sections)
                .isNotNull();
    }

    @DisplayName("역 목록 조회 확인")
    @Test
    void 역_목록_조회_확인() {
        // given
        Section 강남역_역삼역_구간 = 강남역_역삼역_구간();
        Section 역삼역_교대역_구간 = 역삼역_교대역_구간();
        Sections sections = Sections.of(Arrays.asList(강남역_역삼역_구간, 역삼역_교대역_구간));

        // when
        List<Station> stations = sections.getStations();

        // then
        assertAll(
                () -> assertThat(stations.get(0))
                        .isEqualTo(강남역()),
                () -> assertThat(stations.get(1))
                        .isEqualTo(역삼역()),
                () -> assertThat(stations.get(2))
                        .isEqualTo(교대역())
        );
    }
}