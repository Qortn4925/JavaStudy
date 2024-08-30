package ch08.exercise.sol7;

public class MysqlDao implements DataAcessObject {
    @Override
    public void insert() {
        System.out.println("MysqlDao.insert");
    }

    @Override
    public void select() {
        System.out.println("MysqlDao.select");
    }

    @Override
    public void update() {
        System.out.println("MysqlDao.update");
    }

    @Override
    public void delete() {
        System.out.println("MysqlDao.delete");
    }
}
