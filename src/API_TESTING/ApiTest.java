package API_TESTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/*
 *    API TEST USING JAVA HTTP CLASS	
 */
public class ApiTest {

	public void getMethod() throws IOException
	{
		// create the object of URL class and add parameter as url 
		URL url=new URL("https://dummy.restapiexample.com/api/v1/employees");

		//call open connection method and save to parent class that means upcast dynamic polymorphism
		HttpURLConnection http=(HttpURLConnection)url.openConnection();

		/*
		 * GET METHOD
		 */
		http.setRequestMethod("GET");


		http.connect();
		int responseCode=http.getResponseCode();
		String msg=http.getResponseMessage();
		System.out.println("Response code is "+responseCode);
		System.out.println("Response msg is "+msg);

		//call getinputstream and save into Inputstream

		InputStream inputstream=http.getInputStream();

		//create object InputstreamReader

		InputStreamReader reader=new InputStreamReader(inputstream);

		//create object of BufferedReader

		BufferedReader buffer=new BufferedReader(reader);
		String line;
		StringBuffer buff=new StringBuffer();
		while((line=buffer.readLine())!=null)
		{
			buff.append(line);
		}
		System.out.println(buff);





	}

	public void putMethod() throws IOException
	{
		URL url=new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.setRequestMethod("POST");
 
		http.setRequestProperty("Content-Type","application/json");
		http.setDoOutput(true);
		String jsonBody="{\"name\":\"Raj\",\"salary\":\"123\",\"age\":\"23\"}";
		byte data[]=jsonBody.getBytes();
 		 
		OutputStream output=http.getOutputStream();
		output.write(data);
		

		InputStream inputstream=http.getInputStream();

		//create object InputstreamReader

		InputStreamReader reader=new InputStreamReader(inputstream);

		//create object of BufferedReader

		BufferedReader buffer=new BufferedReader(reader);
		String line;
		StringBuffer buff=new StringBuffer();
		while((line=buffer.readLine())!=null)
		{
			buff.append(line);
		}
		System.out.println(buff);

	}

	public static void main(String args[]) throws IOException
	{
		ApiTest a=new ApiTest();
		//a.getMethod();
		a.putMethod();
	}

}
