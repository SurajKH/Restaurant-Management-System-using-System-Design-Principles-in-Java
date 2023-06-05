package ChainOfServers;

public class ThirdServer extends Server {

	static long ServerSizeCapability=1000000000;
	@Override
	public void serverDetails(long LoadSize) {
		
		float loadFactor=1.0f;
		loadFactor*=(3*ThirdServer.ServerSizeCapability)/4;
		
		if(loadFactor>=LoadSize)
		{
			System.out.println("Load can be handled within the First Server and Second Server.");
			System.out.println();
			System.out.println("Server Details: ");
			System.out.println();
			System.out.println("Note: First Server and Second Server could not handle the respective Load.");
			System.out.println("Type of Server: Third Server");
			System.out.println();
			System.out.println("Monitoring Status: Yes");
			System.out.println("Load Balancing Factor: "+loadFactor);
			System.out.println();
			System.out.println();
		}
		
		
	}
}
