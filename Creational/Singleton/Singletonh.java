public class Singletonh {
    private Singletonh() {}

    private static class SingletonHolder {
	//final means cannot be overridden.
        private static final Singletonh INSTANCE = new Singletonh();
    }

    public static Singletonh getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

class Test {
	// Main driver method
	public static void main(String args[])
	{
		// Instantiating Singleton class with variable x
		Singletonh x = Singletonh.getInstance();

		// Instantiating Singleton class with variable y
		Singletonh y = Singletonh.getInstance();

		// Instantiating Singleton class with variable z
		Singletonh z = Singletonh.getInstance();

		// Printing the hash code for above variable as
		// declared
		System.out.println("Hashcode of x is "
						+ x.hashCode());
		System.out.println("Hashcode of y is "
						+ y.hashCode());
		System.out.println("Hashcode of z is "
						+ z.hashCode());

		// Condition check
		if (x == y && y == z) {

			// Print statement
			System.out.println(
				"Three objects point to the same memory location on the heap i.e, to the same object");
		}

		else {
			// Print statement
			System.out.println(
				"Three objects DO NOT point to the same memory location on the heap");
		}
	}
}