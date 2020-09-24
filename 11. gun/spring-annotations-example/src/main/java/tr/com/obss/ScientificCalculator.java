package tr.com.obss;
import org.springframework.stereotype.Component;

@Component("ScientificCalculator")
public class ScientificCalculator implements ICalculator {

	public int add(int x, int y) {
		return x+y;
	}

	public int subs(int x, int y) {
		return x-y;
	}
	
	public int sqrt(int x) {
		return x*x;
	}

}
