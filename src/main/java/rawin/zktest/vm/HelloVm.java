package rawin.zktest.vm;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

/**
 * Created by Wind on 2/3/2019.
 */
@Component("helloVm")
public class HelloVm {
    @Getter
    @Setter
    private String name;

    @Getter
    private String welcomeText;

    @Init
    public void init() {
    }

    @Command
    @NotifyChange({"welcomeText"})
    public void sayHi() {
        welcomeText = "Hello, " + name + "!";
    }
}
