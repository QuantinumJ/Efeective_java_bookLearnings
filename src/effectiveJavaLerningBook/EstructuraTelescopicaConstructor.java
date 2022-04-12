package effectiveJavaLerningBook;

public class EstructuraTelescopicaConstructor {
	// constructor telescopico consiste en definir constructores clasicos con los parametros de las variables necesarias, 
	// otro con una variable no necesaria, otra con dos varibles innecesarias y asi sucesivamente
	private final int servingSize;   // Necesario Porcion en mg 
	private final int servings;       // Necesario cantidad de porcion
	private final int calories;      // calorias en porcion , no necasario
	private final int fat;          // Grasas en porcion no necesario 
	private final int sodium;  // no necesario
	private final int carbohydrate; // no necesario
	
	
	public EstructuraTelescopicaConstructor(int servingSize, int servings) {
		this(servingSize,servings,0);		
	}
	public EstructuraTelescopicaConstructor(int servingSize, int servings,int calories) {
		this(servingSize,servings,calories,0);		
	}
	public EstructuraTelescopicaConstructor(int servingSize, int servings,int calories, int fat) {
		this(servingSize,servings,calories,fat,0);		
	}
	public EstructuraTelescopicaConstructor(int servingSize, int servings,int calories, int fat, int sodium) {
		this(servingSize,servings,calories,fat,sodium,0);		
	}
	public EstructuraTelescopicaConstructor(int servingSize, int servings,int calories, int fat, int sodium,int carbohydrate) {
		this.servingSize=servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat =fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	public int getServingSize() {
		return servingSize;
	}
	public int getServings() {
		return servings;
	}
	public int getCalories() {
		return calories;
	}
	public int getFat() {
		return fat;
	}
	public int getSodium() {
		return sodium;
	}
	public int getCarbohydrate() {
		return carbohydrate;
	}

	// A la hora de su uso se va crear el objeto con el constructor vas a utlizar 
	// el mas corto el cual contenga todos los parametros que tu quieres introducir
	// En este caso o un muchos casos tenemos que rellenar los parametros que se piden en el constructor 
	// que nosotros no necesitamos y por eso pondremos el valor 0 en ellos. Y en otros casos por el descuidado 
	// tenemos que saber el orden de los parametros a itroducir que podemos equivocarnos. Por ese motivo si la clase exige muchas variables
	// Es buena practica pensar si no sale rentable hacer una Muestra Constructor (Sample Builder)
	EstructuraTelescopicaConstructor cocaCola = new EstructuraTelescopicaConstructor(240,8,100,0,35,27);
	
	

}
