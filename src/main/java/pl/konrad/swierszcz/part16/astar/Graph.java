package pl.konrad.swierszcz.part16.astar;

import java.util.Set;

public record Graph(Set<GraphElement> content, GraphElement start, GraphElement end) {
}
