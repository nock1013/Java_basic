package jdbc.board.exam;

public interface BoardDAO {
	int insert(BoardDTO board);
	int insert(String id, String title, String content);
	int update(int boardNum, String id);
	int delete(int boardNum);
	void Select();

}
