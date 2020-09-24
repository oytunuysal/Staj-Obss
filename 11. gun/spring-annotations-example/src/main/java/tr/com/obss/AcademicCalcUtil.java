package tr.com.obss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AcademicCalcUtil {
	@Autowired
	@Qualifier("ScientificCalculator")
	private ICalculator sc; // ICalculator

	public int add(int x, int y) {
		return sc.add(x, y);
	}

	public int subs(int x, int y) {
		return sc.subs(x, y);
	}
	/*
	 * public int sqr(int x) { return sc.sqr(x); }
	 */

}
