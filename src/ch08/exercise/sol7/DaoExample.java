package ch08.exercise.sol7;

public class DaoExample {

    public static void dbWork(DataAcessObject dao) {

        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MysqlDao());
    }
}





