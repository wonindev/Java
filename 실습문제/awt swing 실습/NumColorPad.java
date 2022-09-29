import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class HW extends JFrame {
	public static int W;
	public static int H;
	public static int R;
	public static int C;
	public static int n;
	public static JButton[][] bts;
	public static boolean oddflag;
	public static boolean evenflag;

	public HW() {

		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		setLayout(null);

		JButton b;

		n = 1;

		bts = new JButton[R][C];

		setTitle(String.format("[과제#1] %d행 %d열 (%dx%d)", R, C, W, H));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				b = new JButton("" + n++);
				bts[i][j] = b;
				b.setBounds(j * W, i * H, W, H);
				b.setBackground(new Color(254, 255, 153));
				b.setForeground(new Color(34, 87, 153));
				add(b);
			}
		}

		b = new JButton("홀수");
		b.setBounds(0, H * R, (int) (W * C / 4.0f), H);
		b.addActionListener(new MyHandler());
		add(b);

		b = new JButton("짝수");
		b.setBounds((int) (W * C / 4.0f), H * R, (int) (W * C / 4.0f), H);
		b.addActionListener(new MyHandler());
		add(b);

		b = new JButton("소수");
		b.setBounds((int) (W * C / 4.0f) * 2, H * R, (int) (W * C / 4.0f), H);
		b.addActionListener(new MyHandler());
		add(b);

		b = new JButton("초기화");
		b.setBounds((int) (W * C / 4.0f) * 3, H * R, (int) (W * C / 4.0f), H);
		b.addActionListener(new MyHandler());
		add(b);

		setSize(new Dimension(W * C, H * R + 28 + H));
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		W = Integer.parseInt(args[0]);
		H = Integer.parseInt(args[1]);
		R = Integer.parseInt(args[2]);
		C = Integer.parseInt(args[3]);

		new HW();
	}

	class MyHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			String bname = b.getText();
			switch (bname) {
			case "홀수":
				int oddcnt = 1;
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						if (oddcnt % 2 != 0) {
							bts[i][j].setBackground(new Color(0, 76, 153));
							bts[i][j].setForeground(Color.white);
						}
						oddcnt++;
					}
				}

				break;

			case "짝수":
				int evencnt = 1;

				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						if (evencnt % 2 == 0) {
							bts[i][j].setBackground(new Color(0, 76, 153));
							bts[i][j].setForeground(Color.white);
						}
						evencnt++;
					}
				}
				break;

			case "소수":
				break;

			case "초기화":
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						bts[i][j].setBackground(new Color(254, 255, 153));
						bts[i][j].setForeground(new Color(34, 87, 153));
					}
				}
				break;
			}

		}
	}
}
