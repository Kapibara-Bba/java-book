class Job {
  int num;
  public Job(int n) {
    num = n;
  }
  public void work() {
    System.out.println(this + " is working.");
    try {
      int n = (int)(Math.random() * 10000);
      Thread.sleep(n);
    } catch (InterruptedException e) {
    }
  }
  public String toString() {
    return "[Job " + num + "]";
  }
}
class JobThread extends Thread {
  Job job;
  public JobThread(int n) {
    job = new Job(n);
  }
  @Override
  public void run() {
    while (true) {
      job.work();
    }
  }
}

public class MultiThreadProgram1 {
  public MultiThreadProgram1(int jobcount) {
    for (int i = 0; i < jobcount; i++) {
      new JobThread(i).start();
    }
  }
  public static void main(String[] args) {
    new MultiThreadProgram1(10);
  }
}
