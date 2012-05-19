package br.ucb.fct.enuns;

public enum EnumTypeMask {
	
	DATABANCO("yyyy-MM-dd"), DATAVIEW("dd/MM/yyyy");
	
	private String mask;

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	private EnumTypeMask(String mask) {
		setMask(mask);
	}
	
	
}
