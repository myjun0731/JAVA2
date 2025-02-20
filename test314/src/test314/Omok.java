package test314;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Omok extends JFrame {

	private static final int BOARD_SIZE = 19;
	private static final int CELL_SIZE = 30;

	private static final int BLACK_STONE = 1;
	private static final int WHITE_STONE = 2;

	private int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
	private int currentPlayer = BLACK_STONE;

	private JLabel statusLabel;
	private JButton undoButton;
	private JButton restartButton;
	private JButton resignButton;

	private List<Point> moveHistory = new ArrayList<>();

	public Omok() {
		setTitle("오목 게임");
		setSize(BOARD_SIZE * CELL_SIZE, BOARD_SIZE * CELL_SIZE + 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		OmokBoard omokBoard = new OmokBoard();
		add(omokBoard, BorderLayout.CENTER);

		statusLabel = new JLabel("흑돌 차례");
		statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(statusLabel, BorderLayout.SOUTH);

		// 버튼 패널 생성
		JPanel buttonPanel = new JPanel();

		undoButton = new JButton("무르기");
		undoButton.addActionListener(e -> undoMove());
		buttonPanel.add(undoButton);

		restartButton = new JButton("재시작");
		restartButton.addActionListener(e -> restartGame());
		buttonPanel.add(restartButton);

		resignButton = new JButton("기권하기");
		resignButton.addActionListener(e -> resignGame());
		buttonPanel.add(resignButton);

		add(buttonPanel, BorderLayout.NORTH);

		setVisible(true);
	}

	private class OmokBoard extends JPanel {
		public OmokBoard() {
			setPreferredSize(new Dimension(BOARD_SIZE * CELL_SIZE, BOARD_SIZE * CELL_SIZE));
			setBackground(new Color(204, 153, 102));

			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int x = e.getX() / CELL_SIZE; // 마우스 클릭 좌표를 셀 좌표로 변환
					int y = e.getY() / CELL_SIZE;

					if (isValidMove(x, y)) {
						board[x][y] = currentPlayer; // 유효한 위치에 돌 배치
						moveHistory.add(new Point(x, y));

						if (checkWin(x, y)) { // 승리 조건 체크
							String winner = currentPlayer == BLACK_STONE ? "흑돌" : "백돌";
							JOptionPane.showMessageDialog(null, winner + " 승리!");
							resetBoard(); // 게임 보드 초기화
						} else {
							switchPlayer(); // 플레이어 교대
							updateStatusLabel();
						}
						repaint(); // 화면 갱신
					}
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawGrid(g); // 그리드 그리기
			drawStones(g); // 돌 그리기
		}

		private void drawGrid(Graphics g) {
			g.setColor(Color.BLACK);
			for (int i = 0; i < BOARD_SIZE; i++) {
				g.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, BOARD_SIZE * CELL_SIZE); // 세로선
				g.drawLine(0, i * CELL_SIZE, BOARD_SIZE * CELL_SIZE, i * CELL_SIZE); // 가로선
			}
		}

		private void drawStones(Graphics g) {
			for (int x = 0; x < BOARD_SIZE; x++) {
				for (int y = 0; y < BOARD_SIZE; y++) {
					if (board[x][y] == BLACK_STONE) {
						g.setColor(Color.BLACK); // 흑돌 색
						g.fillOval(x * CELL_SIZE + 3, y * CELL_SIZE + 3, CELL_SIZE - 6, CELL_SIZE - 6); // 흑돌 그리기
					} else if (board[x][y] == WHITE_STONE) {
						g.setColor(Color.WHITE); // 백돌 색
						g.fillOval(x * CELL_SIZE + 3, y * CELL_SIZE + 3, CELL_SIZE - 6, CELL_SIZE - 6); // 백돌 그리기
					}
				}
			}
		}
	}

	private boolean isValidMove(int x, int y) {
		return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE && board[x][y] == 0;
	}

	private boolean checkWin(int x, int y) {
		int player = board[x][y];
		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				if (dx == 0 && dy == 0)
					continue;
				if (checkDirection(x, y, dx, dy, player))
					return true;
			}
		}
		return false;
	}

	private boolean checkDirection(int x, int y, int dx, int dy, int player) {
		int count = 1;
		for (int i = 1; i < 5; i++) {
			int nx = x + dx * i;
			int ny = y + dy * i;
			if (isValidCoordinate(nx, ny) && board[nx][ny] == player)
				count++;
			else
				break;
		}
		for (int i = 1; i < 5; i++) {
			int nx = x - dx * i;
			int ny = y - dy * i;
			if (isValidCoordinate(nx, ny) && board[nx][ny] == player)
				count++;
			else
				break;
		}
		return count >= 5;
	}

	private boolean isValidCoordinate(int x, int y) {
		return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
	}

	private void switchPlayer() {
		currentPlayer = (currentPlayer == BLACK_STONE) ? WHITE_STONE : BLACK_STONE;
	}

	private void updateStatusLabel() {
		statusLabel.setText((currentPlayer == BLACK_STONE) ? "흑돌 차례" : "백돌 차례");
	}

	private void resetBoard() {
		board = new int[BOARD_SIZE][BOARD_SIZE];
		currentPlayer = BLACK_STONE;
		updateStatusLabel();
		moveHistory.clear();
		repaint();
	}

	private void undoMove() {
		if (!moveHistory.isEmpty()) {
			Point lastMove = moveHistory.remove(moveHistory.size() - 1);
			board[lastMove.x][lastMove.y] = 0;
			switchPlayer();
			updateStatusLabel();
			repaint();
		}
	}

	private void restartGame() {
		int result = JOptionPane.showConfirmDialog(this, "게임을 재시작 하시겠습니까?", "게임 재시작", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			resetBoard();
		}
	}

	private void resignGame() {
		int result = JOptionPane.showConfirmDialog(this, "게임을 기권하시겠습니까?", "게임 기권", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(this, "게임을 기권하였습니다. 시작 화면으로 돌아갑니다.");
			dispose(); // 게임 종료 후 시작 화면으로 돌아가기
			new OmokStartPage(); // 시작 페이지 다시 열기
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new OmokStartPage()); // 오목 시작 페이지 실행
	}

	// 오목 시작 페이지 클래스
	static class OmokStartPage extends JFrame {

		public OmokStartPage() {
			setTitle("오목 게임 시작");
			setSize(300, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);

			// 시작 버튼
			JButton startButton = new JButton("게임 시작");
			startButton.addActionListener(e -> startGame());

			// 프로그램 끝내기 버튼
			JButton exitButton = new JButton("프로그램 끝내기");
			exitButton.addActionListener(e -> System.exit(0));

			// 버튼 패널에 추가
			JPanel buttonPanel = new JPanel();
			buttonPanel.add(startButton);
			buttonPanel.add(exitButton);

			// 레이아웃 설정
			setLayout(new BorderLayout());
			add(buttonPanel, BorderLayout.CENTER);

			setVisible(true);
		}

		private void startGame() {
			// 오목 게임 시작
			new Omok(); // Omok 클래스 인스턴스 생성
			this.dispose(); // 시작 페이지 창 닫기
		}
	}
}
