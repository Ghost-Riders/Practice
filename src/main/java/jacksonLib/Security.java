package jacksonLib;

public class Security {
	private String Security_Scheme;

	public Security() {

	}

	public Security(String security_Scheme) {
		Security_Scheme = security_Scheme;
	}

	public String getSecurity_Scheme() {
		return Security_Scheme;
	}

	public void setSecurity_Scheme(String security_Scheme) {
		Security_Scheme = security_Scheme;
	}

	@Override
	public String toString() {
		return "Security [Security_Scheme=" + Security_Scheme + "]";
	}

}
