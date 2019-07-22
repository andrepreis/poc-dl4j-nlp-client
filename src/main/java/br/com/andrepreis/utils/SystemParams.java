package br.com.andrepreis.utils;

public enum SystemParams {
	
	LABELS_NUMBER("5"),
	MODEL_FILE("C:\\Workspace\\Outros\\poc-dl4j-nlp-client\\resources\\CELL_BRANDS.ZIP");

	
	private final String valor;
	
	SystemParams(String valorOpcao){
        valor = valorOpcao;
    }
    public String getValor(){
        return valor;
    }
}
