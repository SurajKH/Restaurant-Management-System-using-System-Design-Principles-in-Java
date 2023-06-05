package ChainOfServers;

public class SecondServer extends Server{
	
	static long ServerSizeCapability=10000;
	@Override
	public void serverDetails(long LoadSize) {
		
		float loadFactor=1.0f;
		loadFactor*=(3*SecondServer.ServerSizeCapability)/4;
		
		if(loadFactor>=LoadSize)
		{
			System.out.println("Server Details: ");
			System.out.println();
			System.out.println("Note: First Server could not handle the respective Load.");
			System.out.println("Type of Server: Second Server");
			System.out.println();
			System.out.println("Monitoring Status: Yes");
			System.out.println("Load Balancing Factor: "+loadFactor);
			System.out.println();
			System.out.println();
		}
		else
		{
			currServer.serverDetails(LoadSize);
		}
		
	}

}
