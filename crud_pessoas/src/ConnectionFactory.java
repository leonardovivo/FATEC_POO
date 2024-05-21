import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
        private static String host = "pg-39e1c75b-leonardovivo.h.aivencloud.com";
        private static String port = "26297";
        private static String user = "avnadmin";
        private static String db = "crud_pessoas";
        private static String password = "AVNS_zQ5fqTemFUTytnkLnZC";

        public static Connection getConnection() throws Exception {

                var s = String.format(
                                "jdbc:postgresql://%s:%s/%s",
                                host, port, db);
                Connection conexao = DriverManager.getConnection(s, user, password);
                return conexao;
        }
}