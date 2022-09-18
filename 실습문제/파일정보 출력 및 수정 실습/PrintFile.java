import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PrintFile {
	public static SimpleDateFormat inForm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss (a)", new Locale("ko", "KR"));

	public static void main(String[] args) {
		String path = args[0];
		File file = new File(path), dirs[];

		if (!file.exists()) {
			System.out.println(path + "의 디렉토리는 존재하지 않음!!");
			System.exit(0);
		}
		System.out.print(path + " 디렉토리의 내용");

		dirs = file.listFiles();

		ListDir(dirs, "");

	}

	public static void ListDir(File[] dirs, String str) {
		File current;

		for (int i = 0; i < dirs.length; i++) {
			current = dirs[i];
			if (current.isDirectory()) {
				if (str.length() == 0) {
					System.out.println();
					System.out.printf("     %s (디렉토리) [수정일:%s] ", current.getName(),
							inForm.format(current.lastModified()));
				} else {
					System.out.println();
					System.out.printf("     %s (디렉토리) [수정일:%s] ", str + "\u27A5" + current.getName(),
							inForm.format(current.lastModified()));
				}

				if (current.listFiles().length >= 1) {

					ListDir(current.listFiles(), str + "     ");
				}

			} else {
				if (str.length() == 0) {
					System.out.println();
					System.out.printf("     %s<%d bytes> (파일) [%s]", current.getName(), current.length(),
							inForm.format(current.lastModified()));
				} else {
					System.out.println();
					System.out.printf("     %s<%d bytes> (파일) [%s]", str + "\u27A5" + current.getName(),
							current.length(), inForm.format(current.lastModified()));
				}

			}

		}

	}

}
