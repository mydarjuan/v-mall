import java.util.Arrays;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author 刘建波
 * @date 2019-12-30
 */
public class ThreadTest {


  public static class ThreadTrain2 implements Runnable {

    private int availableTicketsCount = 0;

    private int totalTicketsCount = 0;

    private static Object lockObj = new Object();

    public void setTickets(Integer ticketsCount) {
      this.totalTicketsCount = this.availableTicketsCount = ticketsCount;
    }

    @Override
    public void run() {
      while (availableTicketsCount > 0) {
        synchronized (lockObj) {
          if (availableTicketsCount > 0) {
            System.out
                .println(
                    Thread.currentThread().getName() + "卖了第" + (totalTicketsCount - availableTicketsCount + 1)
                        + "张票");
            availableTicketsCount--;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    ThreadTrain2 tt = new ThreadTrain2();
    tt.setTickets(100000);

    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(5);
    executor.setMaxPoolSize(10);
    executor.setQueueCapacity(100);
    executor.setKeepAliveSeconds(3000);
    executor.initialize();

    Arrays.asList(1, 2, 3, 4, 5).forEach(a -> {
      executor.execute(tt);
    });
  }


}


