package ChainOfServers;

public class ThirdServer extends Server {

	static long ServerSizeCapability=1000000000;
	@Override
	public void serverDetails(long LoadSize) {
		
		long loadFactor=(3/4)*ServerSizeCapability;
		if(loadFactor<=LoadSize)
		{
			System.out.println("Load can be handled within the First Server and Second Server.");
			System.out.println("Server Details: ");
			System.out.println();
			System.out.println("Note: First Server and Second Server could not handle the respective Load.");
			System.out.println("Type of Server: Third Server");
			System.out.println("Monitoring Status: Yes");
			System.out.println("Load Balancing Factor: "+loadFactor);
			
		}
		else
		{
			System.out.println("Server Crashed.....");
			System.out.println("Note: Data Saved in the Respective Distributed Servers.");
		}
		
	}
}
