package basics.class5;

import basics.class5.exception.DatabaseException;
import basics.class5.exception.DatabaseRunTimeException;

public class DatabaseConnection {

    public static void connectToDb() throws DatabaseException {
        // assume we try to connect DB here but failed... so we throw an exception

        throw new DatabaseException("Exception(checked): 链接数据库失败！");
    }

    public static void talkToDb() {
        // assume we try to connect DB here but failed... so we throw an exception

        throw new DatabaseRunTimeException("Runtime exception(unchecked): 链接数据库失败！");
    }
}
