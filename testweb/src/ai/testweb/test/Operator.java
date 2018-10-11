package ai.testweb.test;

public enum Operator implements Eval {
	add{
		public double eval(double x,double y){
			return x+y;
		}
		public int eval(int x,int y){
			return x+y;
		}
	},
	minus{
		public double eval(double x,double y){
			return x-y;
		}
		public int eval(int x,int y){
			return x-y;
		}
	},
	times{
		public double eval(double x,double y){
			return x*y;
		}
		public int eval(int x,int y){
			return x*y;
		}
	},
	divide{
		public double eval(double x,double y){
			return x/y;
		}
		public int eval(int x,int y){
			return x/y;
		}
	}
}
