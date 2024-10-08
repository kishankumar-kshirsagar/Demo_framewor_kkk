package PomPackage;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import BasePackage.TestBase;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Pom_ProjectSetting_CreateAPILeads extends TestBase {
	WebDriver driver;
	public Pom_ProjectSetting_CreateAPILeads(WebDriver driver)
	{
		this.driver = driver;
	}

//	static String urll="https://staging-ld.textdrip.com/api/create_lead/";
//	private String  phone1 ="3162235519";
//	private String  phone2 ="7206542889";
//	private String APIKey="tvEO1Upu2EAJrqR4nAIUChpLlOy1AdoOmlQCWF9h";
//	private String bucket="94c4e299-d34f-4f43-a818-e14c9ae5120e";
	
	public void Pom_createAPILeads_1() throws IOException {
		FileReader reader=new FileReader(
		"D:\\LeadDistro-Automation\\LeadDistro_automation\\src\\main\\java\\BasePackage\\BaseClass.properties"); 
        Properties props=new Properties(); 
        props.load(reader); 
        String urll = props.getProperty("api_url");
        String phone1 = props.getProperty("phone_1");
        String phone2 = props.getProperty("phone_2");
        String APIKey = props.getProperty("API_Key");
        String bucket = props.getProperty("Bucket_id");
        System.out.println("API url >> "+urll);
        System.out.println("API Key >> "+APIKey);
        System.out.println("Bucket ID >> "+bucket);
        System.out.println("PH-1 >> "+phone1);
        System.out.println("PH-2 >> "+phone2);
        
        System.out.println(urll);
		String requestBody = "{\n" +
                "    \"name\" : \"LD API Leads\",\n" +
                "    \"phone\" : \""+ phone1 + "\",\n" +
                "    \"email\" : \"kishan@pranshtech.com\",\n" +
                "    \"tags\":\"API LD\",\n" +
                "    \"birthdate\" : \"27.12.95\",\n" +
                "    \"address\" : \"Goata Ahmedabad 458695 live\",\n" +
                "    \"city\" : \"Ahmedabad\",\n" +
                "    \"state\" : \"Gujrat\",\n" +
                "    \"zipcode\" : \"4569853\",\n" +
                "    \"custom_field1\" : \"CF1\",\n" +
                "    \"custom_field2\" : \"CF2\",\n" +
                "    \"custom_field3\" : \"CF3\",\n" +
                "    \"custom_field4\" : \"CF4\",\n" +
                "    \"custom_field5\" : \"CF5\",\n" +
                "    \"source\" :\"API leads Kishan\",\n" +
                "    \"optional\" : \"usha\"\n" +
                "}";

		given()
		.contentType("Application/json")
		.headers("APIKey",APIKey)
		.pathParam("create_lead", "create_lead/")
		.body(requestBody)
		.body(requestBody.toString())

		.when()
		.post(urll + "{create_lead}")
		
		.then()
		.log().all()
		.statusCode(201)
		 .body("data", anyOf(
                 equalTo("Lead has been Created and Assigned to Team Member!"),
                 containsString("Lead has been Skipped |"),
                 equalTo("Lead has been Skipped | Number is under DNC Type")));
		
		System.out.println("Create API Passed._____________________________________________________________________________________");

		
		
		
		//Create leads by API bucket
		String requestBodyy = "{\n" +
                "    \"name\" : \"API LeadsBucket\",\n" +
                "    \"phone\" : \""+ phone2 + "\",\n" +
                "    \"bucket\": \""+ bucket + "\",\n"+
                "    \"tags\": \"bucket API LD\",\n" +
                "    \"email\" : \"ld@pranshtech.com\",\n" +
                "    \"birthdate\" : \"28.12.95\",\n" +
                "    \"address\" : \"Ganesh glory 11, Gota, Ahmedabad, Gujrat\",\n" +
                "    \"city\" : \"Ahmedabad\",\n" +
                "    \"state\" : \"Gujrat\",\n" +
                "    \"zipcode\" : \"422620\",\n" +
                "    \"custom_field1\" : \"CF1\",\n" +
                "    \"custom_field2\" : \"CF2\",\n" +
                "    \"custom_field3\" : \"Cf3\",\n" +
                "    \"custom_field4\" : \"Cf4\",\n" +
                "    \"custom_field5\" : \"Cf5\",\n" +
                "    \"source\": \"QA API lead\",\n" +
                "    \"optional\" : \"usha\"\n" +
                "}";

        given()
            .header("Content-Type", "application/json")
            .header("APIKey", APIKey)
            .body(requestBodyy)
            .body(requestBodyy.toString())
            .pathParam("create_lead_bucket", "bucket_create_lead/")
        .when()
        .post(urll + "{create_lead_bucket}")
        .then()
        .log().all()
        .statusCode(201)
        .body("data", anyOf(
                equalTo("Lead has been Skipped | Number is under DNC Type"),
                
                equalTo("Lead has been Skipped | Number is Landline"),
                
                equalTo("Lead has been scheduled!")));
        
        System.out.println("Create API with bucket Passed.__________________________________________________________________________");
        
        //get leads details API 
        given()
        .header("APIKey", APIKey)
        .header("Content-Type", "application/json")
        .body("{\"phone\":\""+ phone1  +"\"}")
        .pathParam("geat_leads_details", "get_lead_details/")
    .when()
        .post(urll+ "{geat_leads_details}")
    .then()
       .log().all()
        .statusCode(200)
      
        .body("status", equalTo("success"));       
        
        System.out.println("Get leads details API Passed.___________________________________________________________________________"); 
        
         
        
	}


}
	

