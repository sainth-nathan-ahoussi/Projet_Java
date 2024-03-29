package banque;

public class Client {

	private int numberClient;
	private String nameClient;
	private String adresseClient;
	
	public Client(int numberClient, String nameClient, String adresseClient) {
		this.numberClient = numberClient;
		this.nameClient = nameClient;
		this.adresseClient = adresseClient;
		
	}

	public int getNumberClient() {
		return numberClient;
	}

	public void setNumberClient(int numberClient) {
		this.numberClient = numberClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	
	
}