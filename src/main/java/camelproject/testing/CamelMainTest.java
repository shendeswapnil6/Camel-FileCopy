package camelproject.testing;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			CamelContext con = new DefaultCamelContext();
			SimpleRouteBuilderTest simpleRoute = new SimpleRouteBuilderTest();
			con.addRoutes(simpleRoute);
			con.start();
			Thread.sleep(30000);
			con.stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
