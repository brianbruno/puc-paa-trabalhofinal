package dijkstra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public void imprimir() {
        for(Node entry : nodes) {
            System.out.println(entry.getName() + " destinos:");
            entry.getAdjacentNodes().forEach((k,v)->System.out.println("Node: " + k.getName() + " Distancia: " + v));
        }
    }

    public void imprimirCaminhoMaisCurto() {
        for(Node entry : nodes) {
            System.out.println("Caminho de A para " + entry.getName() + ":");
            entry.getShortestPath().forEach((k)->System.out.print(k.getName() + " (" + k.getDistance() +")" + " -> "));
            System.out.print(entry.getName() + " (" + entry.getDistance() +")" + "\n");
            System.out.println("--------------------------------");
        }
    }

}
