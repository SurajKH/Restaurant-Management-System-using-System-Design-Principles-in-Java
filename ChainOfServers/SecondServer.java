package ChainOfServers;

public class SecondServer extends Server{
	
	static long ServerSizeCapability=10000;
	@Override
	public void serverDetails(long LoadSize) {
		
		long loadFactor=(3/4)*ServerSizeCapability;
		if(loadFactor<=LoadSize)
		{
			System.out.println("Load can be handled within the First Server.");
			System.out.println("Server Details: ");
			System.out.println();
			System.out.println("Note: First Server could not handle the respective Load.");
			System.out.println("Type of Server: Second Server");
			System.out.println("Monitoring Status: Yes");
			System.out.println("Load Balancing Factor: "+loadFactor);
			
		}
		else
		{
			currServer.serverDetails(LoadSize);
		}
		
	}

}
