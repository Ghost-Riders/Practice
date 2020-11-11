package jacksonLib;

public class QR_Dataset_Version {
	private String Version_No;

	public QR_Dataset_Version() {

	}

	public QR_Dataset_Version(String version_No) {
		Version_No = version_No;
	}

	public String getVersion_No() {
		return Version_No;
	}

	public void setVersion_No(String version_No) {
		Version_No = version_No;
	}

	@Override
	public String toString() {
		return "QR_Dataset_Version [Version_No=" + Version_No + "]";
	}
}
