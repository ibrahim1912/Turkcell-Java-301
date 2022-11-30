package lambdaExpressions.lambdaLab1;

public class LambdaExample {

	public static void main(String[] args) {
		exampleWithoutLambdaExp();
		exampleUsingLambdaExp();
	}

	private static void exampleWithoutLambdaExp() {
		CreateNumber createNumber = new CreateNumber() {

			@Override
			public double create() {
				return 15.0;
			}
		};

		System.out.println(createNumber.create());
	}
	
	private static void exampleUsingLambdaExp() {
		CreateNumber createNumber = () -> 15.0;

		System.out.println(createNumber.create());
	}

}
