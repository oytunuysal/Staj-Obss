package tr.com.obss;
import org.springframework.stereotype.Component;

@Component("SimpleCalculator")
public class SimpleCalculator implements ICalculator {

	public int add(int x, int y) {
		return x + y;
	}

	public int subs(int x, int y) {
		return x - y;
	}

}
