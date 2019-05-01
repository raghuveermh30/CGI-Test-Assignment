package pk_mercury_tours;

import org.testng.annotations.DataProvider;

public class Places_data {
	
	@DataProvider(name="Places")
	public Object[][] flight_place(){
		
		return new Object[] [] {
			{"Acapulco",
				"Frankfurt",
				"London",
				"New York",
				"Paris",
				"Portland",
				"San Francisco",
				"Seattle",
				"Sydney",
				"Zurich" 
				}
		};
	}

}
