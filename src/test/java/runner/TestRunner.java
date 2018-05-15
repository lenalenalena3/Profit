package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@Suite.SuiteClasses({
        Test1.class,
        Test2.class
})

@RunWith(Suite.class)
public class TestRunner {
}


