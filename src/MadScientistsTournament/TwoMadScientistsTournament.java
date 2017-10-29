package MadScientistsTournament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TwoMadScientistsTournament {

    private static Random random = new Random();
    private static final List<String> ROBOT_SCHEME = Arrays.asList("Head", "Body", "Left hand", "Right hand", "Left leg", "Right leg", "CPU", "RAM", "HDD");
    private static ArrayList<String> robotFactoryDisposalGround = new ArrayList<>();
    private static ArrayList<String> drRobotnikRobotPartsStorage = new ArrayList<>();
    private static ArrayList<String> docBrownRobotPartsStorage = new ArrayList<>();
    private static final Object LOCK = new Object();

    public static void main(String[] arg) throws InterruptedException, BrokenBarrierException, ExecutionException {

        CyclicBarrier night = new CyclicBarrier(3);
        ExecutorService threadPool = Executors.newCachedThreadPool();

        List<Future<Integer>> drRobotnikProgress = new ArrayList<>();
        List<Future<Integer>> docBrownProgress = new ArrayList<>();

        Minion drRobotnicMinion = new Minion(LOCK, night, ROBOT_SCHEME, drRobotnikRobotPartsStorage, robotFactoryDisposalGround, "Dr. Robotnic's minion");
        Minion docBrownMinion = new Minion(LOCK, night, ROBOT_SCHEME, docBrownRobotPartsStorage, robotFactoryDisposalGround, "Doc Brown's minion");
        RobotFactoryDisposal disposal = new RobotFactoryDisposal(LOCK, night, robotFactoryDisposalGround, ROBOT_SCHEME);

        for (int i = 0; i < 20; i++) {
            robotFactoryDisposalGround.add(ROBOT_SCHEME.get(random.nextInt(ROBOT_SCHEME.size())));
        }

        System.out.println("Robot Factory Disposal Ground has: " + robotFactoryDisposalGround + "\n" + "Two Mad Scientists Tournament starts!" + "\n");

        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
            Thread.sleep(100);
            Future<Integer> drRobotnikFuture = threadPool.submit(drRobotnicMinion);
            Future<Integer> docBrownFuture = threadPool.submit(docBrownMinion);
            threadPool.submit(disposal);
            drRobotnikProgress.add(drRobotnikFuture);
            docBrownProgress.add(docBrownFuture);
        }
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.DAYS);

        Integer drRobotnikResult = 0;
        Integer docBrownResult = 0;

        for (Future<Integer> drRobotnikFuture : drRobotnikProgress){
            drRobotnikResult += drRobotnikFuture.get();
        }

        for (Future<Integer> docBrownFuture : docBrownProgress){
            docBrownResult += docBrownFuture.get();
        }

        System.out.println("\n" + "Doctor Ivo \"Eggman\" Robotnik has assembled " + drRobotnikResult + " BattleMechs." + "\n" + "Emmett Lathrop \"Doc\" Brown has assembled " + docBrownResult + " BattleMechs.");

        if (docBrownResult > drRobotnikResult) {
            System.out.println("Emmett Lathrop \"Doc\" Brown wins!");
        } else if (drRobotnikResult > docBrownResult) {
            System.out.println("Doctor Ivo \"Eggman\" Robotnik wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
