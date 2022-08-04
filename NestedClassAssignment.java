public class NestedClassAssignment {
	public static void main(String[] args) {
		
		RemoteDesktop remoteDesktop = new RemoteDesktop(101,"loop");
		
		RemoteDesktop.History history1 = new RemoteDesktop.History();
		RemoteDesktop.History history2 = new RemoteDesktop.History();
		
		remoteDesktop.getAccess(true);
		
		history1.setConnectionId(4);
		history1.setConnectionTime("1:30 PM");
		
		
		history2.setConnectionId(1);
		history2.setConnectionTime("3.30PM");
		
		
			
		System.out.println(history1);
		System.out.println(history2);
	}
}

class RemoteDesktop
{
	private int desktopNo;
	private String desktopName;
	private accessPermission acessPermision = new accessPermission(false,true);
	
	public int desktopNo() {
		return desktopNo;
	}

	void getAccess(boolean activate)
	{
		System.out.println("Connecting to remote....");
		acessPermision.setConnection(activate);
	}
	
	public RemoteDesktop(int desktopNo, String desktopName) {
		super();
		this.desktopNo = desktopNo;
		this.desktopName = desktopName;
	}

	public static class History
	{
		int connectionId;
		String connectionTime;
		
		public int getConnectionId() {
			return connectionId;
		}
		public void setConnectionId(int connectionId) {
			this.connectionId = connectionId;
		}
		public String getConnectionTime() {
			return connectionTime;
		}
		public void setConnectionTime(String connectionTime) {
			this.connectionTime = connectionTime;
		}
		@Override
		public String toString() {
			return "History [connectionId=" + connectionId + ", connectionTime=" + connectionTime + ", toString()=" + super.toString() + "]";
		}
		
	}
	
	private class accessPermission
	{
		boolean vpn; //false
		boolean connection; //false
		
		
		public accessPermission(boolean vpn, boolean connection) {
			super();
			this.vpn = vpn;
			this.connection = connection;
		}
		public boolean vpn() {
			return vpn;
		}
		public boolean connection() {
			return connection;
		}
		public void setConnection(boolean connection) {
			this.connection = connection;
		}
	}
}
