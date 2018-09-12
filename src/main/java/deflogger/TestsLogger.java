package deflogger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestsLogger {
    protected static Logger Log = LogManager.getLogger();

    public static void startTestCase (String testCase){
        Log.info("***************************");
        Log.info(String.format("Test case %s started", testCase));
        Log.info("***************************");
    }
    public static void logStep (String step){
        Log.info("***************************");
        Log.info(String.format("Step %s started", step));
        Log.info("***************************");
    }
    public static void logStep ()
    {
        int j = 1;
        Throwable t = new Throwable ();
        StackTraceElement [] ste = t.getStackTrace();
        String fullClassPath = ste [j].getClassName();
        String [] path = fullClassPath.split ("\\.");
        String className = path [path.length-1];
        Log.info(String.format("###### %s %s started", className, ste [j].getMethodName()));

    }
}
