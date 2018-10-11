package ai.testweb.test;

public enum Operator_abs {
	PLUS{
		public double eval(double x,double y){
			return x+y;
		}
	},
	MINUS{
		public double eval(double x,double y){
			return x-y;
		}
	};
	
	public abstract double eval(double x,double y);
}
