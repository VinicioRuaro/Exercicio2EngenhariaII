package engenharia2c;

public class Debito {
	int codigoAluno;
	public Debito(int aluno){
		this.codigoAluno =aluno;
	}
	
	public boolean verificaDebito()
	{
	//codigo aleatorio para definir se o aluno tem d�bito
            ////////////////feito na questao 5
	//� necess�rio fazer a verifica��o de forma persistente
            
	if(this.codigoAluno == 4)
		 return false;
	 else
		return true;
	}

}