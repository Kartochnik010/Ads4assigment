package com.company;

import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double>;

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }
}
