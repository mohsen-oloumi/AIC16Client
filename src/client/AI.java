package client;

import client.model.Node;

/**
 * AI class.
 * You should fill body of the method {@link #doTurn}.
 * Do not change name or modifiers of the methods or fields
 * and do not add constructor for this class.
 * You can add as many methods or fields as you want!
 * Use world parameter to access and modify game's
 * world!
 * See World interface for more details.
 */
public class AI {

    private int [] allNodes; //all nodes of map


    public void doTurn(World world) {


        Node[] myNodes = world.getMyNodes();
        for (Node source : myNodes) {

            // get neighbours
            Node[] neighbours = source.getNeighbours();
            if (neighbours.length > 0) {
                Node destination = source.getNeighbours()[0];
                world.moveArmy(source, destination, source.getArmyCount() / 2);
            }
        }
    }

}
