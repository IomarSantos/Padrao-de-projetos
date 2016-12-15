
public class EmissorCreator {
	
	public static final int SMS = 0;
	public static final int Email = 1;
	public static final int Jms = 2;
 
	
	public Emissor create(int tipoDeEmissor){
		if(tipoDeEmissor == EmissorCreator.SMS){
			return (Emissor) new EmissorSMS();
		}else if (tipoDeEmissor == EmissorCreator.Email){
			return (Emissor) new EmissorEmail();
		}else if(tipoDeEmissor == EmissorCreator.Jms){
			return (Emissor) new EmissorJms();
		}else{
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
		}
	}


