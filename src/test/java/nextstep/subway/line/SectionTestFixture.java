package nextstep.subway.line;

import nextstep.subway.line.domain.Line;
import nextstep.subway.line.domain.Section;
import nextstep.subway.station.domain.Station;

public class SectionTestFixture {
    private SectionTestFixture() {
        throw new UnsupportedOperationException();
    }

    public static Line 이호선() {
        return Line.of(1L, "이호선", "bg-green-600");
    }

    public static Station 강남역() {
        return Station.of(1L, "강남역");
    }

    public static Station 역삼역() {
        return Station.of(2L, "역삼역");
    }

    public static Station 교대역() {
        return Station.of(3L, "교대역");
    }

    public static Section 이호선_강남역_역삼역_구간() {
        return Section.of(1L, 이호선(), 강남역(), 역삼역(), 10);
    }

    public static Section 이호선_역삼역_교대역_구간() {
        return Section.of(2L, 이호선(), 역삼역(), 교대역(), 10);
    }
}