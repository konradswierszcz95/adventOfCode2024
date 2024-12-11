package pl.konrad.swierszcz.day11;

import java.util.List;
import java.util.Map;

public record Precalculation(long stone, Map<Integer, List<Long>> children) {
}
