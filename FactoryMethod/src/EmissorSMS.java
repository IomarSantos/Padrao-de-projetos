
public class EmissorSMS implements Emissor{

	@Override
	public void envia(String Mensagem) {
    System.out.println("Enviando por SMS a mensagem:");
    System.out.println(Mensagem);
	}

}
