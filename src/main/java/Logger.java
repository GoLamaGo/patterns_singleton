import java.time.LocalDateTime;
import java.util.Objects;

public class Logger {

    private static Logger INSTANCE = null;
    protected int num = 1;

    public void log(String msg) {
        System.out.println(LocalDateTime.now() + " [" + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (Objects.isNull(INSTANCE)) INSTANCE = new Logger();
        return INSTANCE;
    }
}