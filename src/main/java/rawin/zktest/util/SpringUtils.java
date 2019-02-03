package rawin.zktest.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Wind on 2/3/2019.
 */
@Service
public class SpringUtils {

    private static ApplicationContext context;

    @Autowired
    public SpringUtils(ApplicationContext ctx) {
    	SpringUtils.context = ctx;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
