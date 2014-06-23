/**
 * 
 */

package hello.world;

import java.io.*;
import java.util.*;

/**
 * @author eric
 *
 */
public final class Main {

	public static void main(String[] args) {
		// BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = null;
		try {
			s = new Scanner(System.in);
			System.out.println(s.nextLine());
		} finally {
			if (s != null) s.close();
		}
	}

}
