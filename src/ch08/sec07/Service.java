package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod 종속코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("디폴트 메소드 중복 ㅗ드 a");
        System.out.println("디폴트 메소드 중복 ㅗ드 b");

    }

    static void staticMethod1() {
        System.out.println("static 종속 코드");
        staticCommon();
    }

    static void staticMetohd2() {
        System.out.println("static 종속 코드 2");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드 c");
        System.out.println("staticMethod 중복 코드 d");
    }
}
