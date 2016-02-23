package test;

import org.omnifaces.cdi.pooled.Pooled;
import org.omnifaces.cdi.pooled.PooledScopeEnabled;

@Pooled
@PooledScopeEnabled
public class TestClass {

    public String hello() {
        return "Hello, from pooled";
    }
    
}
