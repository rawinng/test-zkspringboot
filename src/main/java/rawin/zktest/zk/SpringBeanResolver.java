package rawin.zktest.zk;

import org.springframework.context.ApplicationContext;
import org.zkoss.xel.XelException;

import rawin.zktest.util.SpringUtils;

/**
 * Created by Wind on 2/3/2019.
 */
public class SpringBeanResolver implements org.zkoss.xel.VariableResolver {

    @Override
    public Object resolveVariable(String s) throws XelException {
        ApplicationContext appCtx = SpringUtils.getContext();

        if (appCtx == null) {
            throw new XelException("Not found spring application context");
        }
        try {
            return appCtx.getBean(s);
        } catch (Exception e) {
            throw new XelException(e);
        }
    }
}
