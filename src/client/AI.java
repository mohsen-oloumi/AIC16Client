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

    public void doTurn(World world) {

        // fill this method, we've presented a stupid AI for example!
        //salam in ye comment ast
        //salam in comment dovom ast
        //salam in commente mahshide
        //this is the last comment!!
        Node[] myNodes = world.getMyNodes();
        for (Node source : myNodes) {

            // get neighbours
            Node[] neighbours = source.getNeighbours();
            if (neighbours.length > 0) {
                Node destination = source.getNeighbours()[0];
                for (int i = 0; i < neighbours.length; i++) {
                    if (neighbours[i].getOwner() == -1) {
                        destination = neighbours[i];
                        world.moveArmy(source, destination, source.getArmyCount() / 2);
                        break;
                    } else if (neighbours[i].getOwner() != world.getMyID()) {
                        //destination = neighbours[(int) (neighbours.length * Math.random())];
                        if (neighbours[i].getArmyCount() != world.getMyID() && source.getArmyCount() > 10) {
                            destination = neighbours[i];
                            world.moveArmy(source, destination, source.getArmyCount());
                            break;
                        } else if (neighbours[i].getArmyCount() != world.getMyID() && source.getArmyCount() > 20) {
                            destination = neighbours[i];
                            world.moveArmy(source, destination, source.getArmyCount());
                            break;
                        } else {
                            destination = neighbours[(int) (neighbours.length * Math.random())];
                            world.moveArmy(source, destination, source.getArmyCount());
                            break;
                        }
                    } else {
                        destination = neighbours[(int) (neighbours.length * Math.random())];
                        world.moveArmy(source, destination, source.getArmyCount() / 2);
                        break;
                    }

                }
                System.out.println(destination.getOwner());
            }
        }
        System.out.println("--------------------");
    }

}
