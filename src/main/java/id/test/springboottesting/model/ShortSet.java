package id.test.springboottesting.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author e1077326
 *
 */
public class ShortSet {
	  public static int justThat () {
	    Set<Short> s = new HashSet<>();
	    for (short i = 0; i < 100; i++) {
	      s.add(i);
	    //   s.remove(i - 1);
	    }
	    return s.size();
	  }
	}
