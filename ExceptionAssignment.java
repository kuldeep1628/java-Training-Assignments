public class ExceptionAssignment {
	public static void main(String[] args) {
		
		
		RemoteDeskTopAcess remoteDeskTopAcess = new RemoteDeskTopAcess();
		try {
			//remoteDeskTopAcess.IsRemoteDesktopOn();
			remoteDeskTopAcess.enterCredentials();
		} catch (RemoteDesktopUnavailableException e) {
			System.out.println("Problem : "+e);
		}
		System.out.println("Service request Completed....");
		
	}
}

class RemoteDesktopUnavailableException extends Exception
{
	RemoteDesktopUnavailableException(String msg) {
		super(msg);
	}
}
class RemoteDeskTopAcess
{
	boolean remotedeskTopOn;
	
	RemoteDeskTopAcess() 	{
		System.out.println("Connection to remote Desktop initiated........");
	}

	void IsRemoteDesktopOn() {
		if(remotedeskTopOn == false) {
			remotedeskTopOn = true;
		}
		System.out.println("Remote desktop is available for connection....");
	}
	
	void enterCredentials() throws RemoteDesktopUnavailableException
	{
		if(remotedeskTopOn == false ) {
			RemoteDesktopUnavailableException remoteDesktopUnavailableEx = new RemoteDesktopUnavailableException("Remote Desktop is unavailable....");
			throw remoteDesktopUnavailableEx;
		}

		System.out.println("verifying credentials...");
		verifyingCredentials();
	}
	
	void verifyingCredentials()
	{
			System.out.println("Credentials verified");
			selectDeskTopName();
	}
	
	void selectDeskTopName()
	{
		System.out.println("Please Select your deskTop from the List");
			connecting();
	}
	
	void connecting() {
			
			System.out.println("Successfully connected to Remote desktop.....");

	}
}
