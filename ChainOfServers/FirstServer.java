package ChainOfServers;

public class FirstServer extends Server{

	static long ServerSizeCapability=1000;
	@Override
	public void serverDetails(long LoadSize) {
		
		float loadFactor=1.0f;
		loadFactor*=(3*FirstServer.ServerSizeCapability)/4;
		//System.out.println("Load Factor: "+FirstServer.ServerSizeCapability);
		System.out.println(loadFactor);
		if(loadFactor>=LoadSize)
		{
			System.out.println("Load can be handled within the First Server.");
			System.out.println();
			System.out.println("Server Details: ");
			System.out.println();
			System.out.println("Type of Server: First Server");
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
