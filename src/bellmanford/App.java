package bellmanford;

import java.util.Scanner;

public class App {
    public static void main(String... arg) {
        int numberofvertices = 0;
        int source;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices");
        numberofvertices = scanner.nextInt();

        int adjacencymatrix[][] = new int[numberofvertices + 1][numberofvertices + 1];
        System.out.println("Enter the adjacency matrix");
        for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++) {
            for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++) {
                adjacencymatrix[sourcenode][destinationnode] = scanner.nextInt();
                if (sourcenode == destinationnode) {
                    adjacencymatrix[sourcenode][destinationnode] = 0;
                    continue;
                }
                if (adjacencymatrix[sourcenode][destinationnode] == 0) {
                    adjacencymatrix[sourcenode][destinationnode] = Algoritmo.MAX_VALUE;
                }
            }
        }

        System.out.println("Enter the source vertex");
        source = scanner.nextInt();

        Algoritmo bellmanford = new Algoritmo(numberofvertices);
        bellmanford.BellmanFordEvaluation(source, adjacencymatrix);
        scanner.close();
    }
}
