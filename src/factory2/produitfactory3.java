package factory2;

public class produitfactory3 extends produitfactory  {

	public produitfactory3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected produitA createproduitA() {
		return new produitA3();
	}

}
