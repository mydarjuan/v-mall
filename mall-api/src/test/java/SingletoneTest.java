import org.junit.jupiter.api.Test;

/**
 * @author 刘建波
 * @date 2019-12-30
 */
class SingletoneTest {

  @Test
  void test1() {
    SingletoneTest enumSingleton1 = getInstance();
    System.out.println(enumSingleton1.hashCode());

    SingletoneTest enumSingleton2 = getInstance();
    System.out.println(enumSingleton2.hashCode());

    System.out.println(enumSingleton1.equals(enumSingleton2));
  }

  public static SingletoneTest getInstance() {
    return SingletoneTest.SingletoneTestEnum.INSTANCE.getInstance();
  }


  private enum SingletoneTestEnum {
    INSTANCE;

    private SingletoneTest singleton;


    SingletoneTestEnum() {
      singleton = new SingletoneTest();
    }


    private SingletoneTest getInstance() {
      return singleton;
    }
  }
}
