package specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    RequestSpecification requestSpecification;
    private String baseUrl = "https://api.spotify.com";
    private String token = "BQDUpJ8gSmiWVtgcq76K2JVLqf26uTvapL83Kjvn0bJ-rbmtlTcxclAK4Cbl4rLZ_7E4kO1zyNTtOiIVbSdSNVf4ESp3SSARfnpTSiZKNRK87zgC8Phibgj_33CMsS6qrZrsyQ3xXkEuBbzBX0tBfJPf_Y3g4gGl6lzn-10WDTzw-C6FHyd43mvn9zYR8XVuXyFsBXFKmJ4YD--GKqHebrFqJ75NfTmPzGv--MPFmJCxU4F0bqq7cU68H--BDAN52FRVaN_UGHIMrekDVBNDGuJ9ohvgvspg7TNIKyrE";
    public RequestSpec(String endPoint){
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUrl+endPoint)
                .addHeader("Authorization","Bearer " +token)
                .setContentType("application/json")
                .setAccept("application/json")
                .build();
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

}
