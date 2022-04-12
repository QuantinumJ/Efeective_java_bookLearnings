package effectiveJavaLerningBook;



public class SampleBuilderMuestra {
	private final int servingSize;   // Necesario Porcion en mg 
	private final int servings;       // Necesario cantidad de porcion
	private final int calories;      // calorias en porcion , no necasario
	private final int fat;          // Grasas en porcion no necesario 
	private final int sodium;  // no necesario
	private final int carbohydrate; // no necesario
	
	public static class Builder{
		// Parametros necesarios
		private final int servingSize;
		private final int servings; 
		
		// Parametros que no son necesarios
		private  int calories=0;      
		private  int fat=0;        
		private  int sodium=0;  
		private  int carbohydrate=0;
		//constructor
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		public SampleBuilderMuestra build() {
			return new SampleBuilderMuestra(this);
		}
	}
	private SampleBuilderMuestra(Builder build) {
		servingSize = build.servingSize;
		servings = build.servings;
		calories = build.calories;
		fat = build.fat;
		sodium = build.sodium;
		carbohydrate = build.carbohydrate;
	}
	
	// uso
		SampleBuilderMuestra cocaCola = new SampleBuilderMuestra.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
}
