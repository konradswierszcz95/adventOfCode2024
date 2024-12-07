package pl.konrad.swierszcz.day7;

import java.util.List;

public record Equation(
        Long result,
        List<Long> terms
) {}
