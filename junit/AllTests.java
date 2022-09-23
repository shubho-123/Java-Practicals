package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdminPassword.class, TestAge.class, TestApple.class, TestConuntA.class, TestSquare.class })
public class AllTests {

}
