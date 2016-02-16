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

    private int [] allNodes; // all nodes array
    private static boolean isAllNodeInitialized = false;
    private static int neighboursCountFactor = 1;
    private static int attackToEnemyFactor = 1;
    private static int neighboursHelpFactor = 1;
    private static int myHelpFactor = 1;



    public void doTurn(World world) {
        if (!isAllNodeInitialized)
            initializeAllNodes(world);

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

    private void initializeAllNodes(World world){}
    private int emptynNeighboursScore(){return 1;}
    private int attackToEnemyScore(){return 1;}
    private int neighboursMaxHelpScore(){return 1;}
    private int myNodeHelpScore(){return 1;}
    private Node wichEmptyNeighbourIsBestToGO(int index){return null;}
    private Node wichNeighbourIsBestToHelp(int index){return null;}
    private Node wichEnemyIsBestToAttack(int index){return null;}
    private int whatActionToDo(){return 0;}

}
