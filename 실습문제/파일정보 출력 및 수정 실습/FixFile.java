import java.io.File;

public class FixFile {

	public static void main(String[] args) {
		String path = args[0], N1 = args[1], N2 = args[2];

		File file = new File(path), dirs[];

		dirs = file.listFiles();

		if (!file.exists()) {
			System.out.println(path + "의 디렉토리를 찾을 수 없음 !!!");
			System.exit(0);
		} else if ((find(dirs, N1, false)) == false) {
			System.out.println(N1 + "을(를) 검색할 수 없음");
			System.exit(0);
		}

		change(dirs, N1, N2);

	}

	public static void change(File[] dirs, String N1, String N2) {
		File current = null;
		String ps = File.separator;

		for (int i = 0; i < dirs.length; i++) {
			current = dirs[i];
			if (current == null) {
				System.out.println("이름없음");
				break;
			}
			
			if (current.getName().equals(N1)) {
				File n_file = new File(current.getParent() + ps + N2);
				current.renameTo(n_file);
				System.out.printf("%s을(를) %s로 변경 함. [%s]\n", current.getAbsolutePath(), n_file.getAbsolutePath(),
						n_file.isDirectory() ? "디렉토리" : "파일");
			}

			if (current.isDirectory()) {
				change(current.listFiles(), N1, N2);
			}

		}

	}

	public static boolean find(File[] dirs, String N1, boolean flag) {
		File current = null;

		for (int i = 0; i < dirs.length; i++) {
			current = dirs[i];
			if (current.isDirectory()) {
				if (current.getName().equals(N1)) {
					flag = true;

				}
				flag = find(current.listFiles(), N1, flag);
			}

			else {
				if (current.getName().equals(N1)) {
					flag = true;
				}
			}
		}

		return flag;
	}

}
