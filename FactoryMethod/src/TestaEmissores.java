
public class TestaEmissores {

	public static void main(String[] args) {

		Emissor emissor1 = new EmissorSMS();
		emissor1.envia("InfoCristian - Transacao Aprovada");
		
		Emissor emissor2 = (Emissor) new EmissorEmail();
		emissor2.envia("InfoCristian - Transacao Aprovada");
		
		EmissorJms emissor3 = new EmissorJms();
		emissor3.envia("InfoCristian - Transacao Aprovada");
		
	}

}
