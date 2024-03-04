package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{		
		// Using this method to get PlaceId
		StepDefination m =new StepDefination();
		if(StepDefination.place_id==null)
		{
		
		m.add_Place_Payload_with("Gopal Rao Phanindra", "French", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_maps_to_using("Gopal Rao Phanindra", "getPlaceAPI");
		}
		
		

	}
}
