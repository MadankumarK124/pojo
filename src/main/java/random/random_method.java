package random;

import java.util.Random;

public class random_method {

	public int random()
	{
		Random random = new Random();
		int ran1 = random.nextInt(1000);
		return ran1;
	}
}
