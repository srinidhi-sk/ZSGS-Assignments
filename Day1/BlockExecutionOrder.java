public class BlockExecutionOrder{

	// static block
	static{
		System.out.println("Static Block!!");
	}

	//initializer block
	{
		System.out.println("Initializer Block!!");
	}

	BlockExecutionOrder(){
		System.out.println("Constructor Called");
	}

    public static void main(String[] args) {
			System.out.println("Main Block!!");
			BlockExecutionOrder b = new BlockExecutionOrder();
    }
}

