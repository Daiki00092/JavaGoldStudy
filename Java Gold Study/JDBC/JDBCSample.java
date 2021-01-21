import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSample {

	public static void main(String[] args) {
		JDBCSample sample = new JDBCSample();
		sample.open();
		sample.close();
	}

	Connection conn = null; //DBMSとの接続オブジェクトが!nullなら接続中
	Statement stmt = null;


	//データベースとの接続を開始する。
	public void open() {
		String url = "jdbc:odbc:test";
		String user = "SYSBDA";
		String pw = "masterkey";

		try {
			conn = DriverManager.getConnection(url, user, pw);
			stmt = conn.createStatement();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	//データベースを閉じる(接続を解除する)
	public void close() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}