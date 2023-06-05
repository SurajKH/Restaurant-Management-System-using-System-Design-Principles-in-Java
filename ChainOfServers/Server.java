package ChainOfServers;

//Server Class.
public abstract class Server {

	protected Server currServer;
	
	public void nextServer(Server currServer)
	{
		this.currServer=currServer;
	}
	
	public abstract void serverDetails(long LoadSize); 
}
