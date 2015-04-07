package testserenityjunit.tools;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Created by rusu on 4/6/15.
 */
public class MyListener extends BlockJUnit4ClassRunner{

    public MyListener(Class<?> klass) throws InitializationError {
        super(klass);
    }
}


