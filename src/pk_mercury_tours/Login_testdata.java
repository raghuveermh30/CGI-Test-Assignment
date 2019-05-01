package pk_mercury_tours;

import org.testng.annotations.DataProvider;

public class Login_testdata {
	
	@DataProvider(name="Login")
	public Object[][] getdatafromdata(){
		
		return new Object[] [] {
			
			{ "testing" , "testing" },
			
			{ "dixit" , "dixit"}
		};
	}

	@DataProvider(name="browser")
 public Object[] [] getbrow(){
		
		return new Object[] [] {
			
			{"chrome"},
			{"firefox"}
		};
		}
	}

