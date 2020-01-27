package hasan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;


@ApplicationScoped
@Model
public class COOFactory {

	@Produces
	public National getNational() {
		return new CountryOfOrigin("Made In China");
	}
}
