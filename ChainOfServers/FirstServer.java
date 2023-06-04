package ChainOfServers;

public class FirstServer extends Server{

	static long ServerSizeCapability=1000;
	@Override
	public void serverDetails(long LoadSize) {
		
		long loadFactor=(3/4)*ServerSizeCapability;
		if(loadFactor<=LoadSize)
		{
			System.out.println("Load can be handled within the First Server.");
			System.out.println("Server Details: ");
			System.out.println();
			System.out.println("Type of Server: First Server");
			System.out.println("Monitoring Status: Yes");
			System.out.println("Load Balancing Factor: "+loadFactor);
			
		}
		else
		{
			currServer.serverDetails(LoadSize);
		}
		
	}

}
