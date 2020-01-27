package hasan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Model;
import javax.inject.Named;

public class CountryOfOrigin implements National {

    public CountryOfOrigin() {
    }
	
	
	public CountryOfOrigin(String cOO) {
		COO = cOO;
	}

	private String COO;

        @Override
	public String getCOO() {
		return COO;
	}

        @Override
	public void setCOO(String cOO) {
		COO = cOO;
	}
}
