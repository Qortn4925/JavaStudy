package ch08.exercise.sol7;

public class OracleDao implements DataAcessObject {

    @Override
    public void insert() {
        System.out.println("OracleDao.insert");
    }

    @Override
    public void select() {
        System.out.println("OracleDao.select");
    }

    @Override
    public void update() {
        System.out.println("OracleDao.update");
    }

    @Override
    public void delete() {
        System.out.println("OracleDao.delete");
    }
}
