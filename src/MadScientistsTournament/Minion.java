package MadScientistsTournament;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.Random;

public class Minion implements Callable<Integer> {

    private static Random random = new Random();
    private final CyclicBarrier night;
    private Object lock = new Object();
    private List<String> robotScheme;
    private ArrayList<String> robotPartsStorage;
    private ArrayList<String> robotFactoryDisposalGround;
    private String minionName;

    public Minion(Object lock, CyclicBarrier night, List<String> robotScheme, ArrayList<String> robotPartsStorage, ArrayList<String> robotFactoryDisposalGround, String minionName) {
        this.lock = lock;
        this.night = night;
        this.robotScheme = robotScheme;
        this.robotPartsStorage = robotPartsStorage;
        this.robotFactoryDisposalGround = robotFactoryDisposalGround;
        this.minionName = minionName;
    }

    @Override
    public Integer call() throws Exception {
        night.await();
        for (int i = 0; i < random.nextInt(3) + 1; i++) {
            synchronized (lock) {
                if (robotFactoryDisposalGround.size() > 0) {
                    robotPartsStorage.add(robotFactoryDisposalGround.remove(random.nextInt(robotFactoryDisposalGround.size())));
                }
            }
        }
        System.out.println(minionName + ": Master, we have: " + robotPartsStorage);
        return assembleRobotFromParts(minionName, robotScheme, robotPartsStorage);
    }

    private static int assembleRobotFromParts(String minionName, List<String> robotScheme, ArrayList<String> robotPartsStorage) {
        if (robotPartsStorage.containsAll(robotScheme)) {
            for (String s : robotScheme) {
                robotPartsStorage.remove(s);
            }
            System.out.println(minionName + "New BattleMech is assembled, master!");
            return 1;
        } else {
            return 0;
        }
    }
}