package current;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

/**
 * @Author lpf
 * @Date 2/4/18 11:50 AM
 */
public class TestExecutor {
    public static void main(String[] args) throws Exception{
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService four = Executors.newScheduledThreadPool(5);
        Future<String> one = fixedThreadPool.submit(() -> {
           Thread.sleep(2000);
           return "0";
        });
        System.out.println(one.get(2, TimeUnit.SECONDS));
        System.out.println("main" + Thread.currentThread().getId());
        return;
    }
}
