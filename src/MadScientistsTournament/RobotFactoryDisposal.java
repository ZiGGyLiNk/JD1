package MadScientistsTournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RobotFactoryDisposal implements Runnable {

    private static Random random = new Random();
    private final CyclicBarrier night;
    private Object lock = new Object();
    private ArrayList<String> robotFactoryDisposalGround;
    private List<String> robotScheme;

    public RobotFactoryDisposal(Object lock, CyclicBarrier night, ArrayList<String> robotFactoryDisposalGround, List<String> robotScheme) {
        this.lock = lock;
        this.night = night;
        this.robotFactoryDisposalGround = robotFactoryDisposalGround;
        this.robotScheme = robotScheme;
    }

    @Override
    public void run() {
        try {
            night.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        synchronized(lock) {
            for (int i = 0; i < random.nextInt(3) + 1; i++) {
                robotFactoryDisposalGround.add(robotScheme.get(random.nextInt(robotScheme.size())));
            }
        }
        System.out.println("Robot Factory Disposal Ground has: " + robotFactoryDisposalGround);
    }
}