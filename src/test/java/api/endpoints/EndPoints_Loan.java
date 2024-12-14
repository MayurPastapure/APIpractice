package api.endpoints;

import static io.restassured.RestAssured.*;

import api.payload.Auth;
import api.payload.Loan;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class EndPoints_Loan {
	
	public static Response getReseponseFromPostRequest(Auth payload,String url) {
		Response response = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(Routes.base_url+url);
		return response;
		
	}

	public static Response loanList(Loan payload) {
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)

				.when()
				.post(Routes.loan_post_url);
		return response;
	}
	
	

}

