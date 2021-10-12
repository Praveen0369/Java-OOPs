package osshutdown;
public class shutdown_os  {

	public static void main(String[] args) {
		try {
		    Process proc = Runtime.getRuntime()
		                    .exec(new String[]{ "su", "-c", "reboot -p" });
		    proc.waitFor();
		} catch (Exception ex) {
		    ex.printStackTrace();


	}}}

