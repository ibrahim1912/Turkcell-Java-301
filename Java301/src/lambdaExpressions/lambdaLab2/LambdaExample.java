package lambdaExpressions.lambdaLab2;

public class LambdaExample {

	public static void main(String[] args) {
		Hello hello = (s) ->  "Merhaba " + s;
		
		System.out.println(hello.hello("Dunya"));

		Add add = (a,b) -> a + b;
		System.out.println(add.add(1.2, 3.4));
	}

}
