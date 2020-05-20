package camelproject.testing;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilderTest extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:inputFolder?noop=true").to("file:outputFolder");
	}

}
