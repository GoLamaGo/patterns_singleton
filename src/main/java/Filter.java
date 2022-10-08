import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        logger.log("Список на входе: " + source);

        for (Integer item : source) {
            if (item < treshold) {
                result.add(item);
                logger.log("Элемент " + item + " проходит");
            } else {
                logger.log("Элемент " + item + " не проходит");
            }

        }
        logger.log("Отфильтрованный список: " + result);
        return result;
    }
}