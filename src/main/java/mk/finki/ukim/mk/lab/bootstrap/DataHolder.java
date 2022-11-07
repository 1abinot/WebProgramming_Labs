package mk.finki.ukim.mk.lab.bootstrap;

import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Balloon> balloons = new ArrayList<>();

    @PostConstruct
    public void init(){
        balloons.add(new Balloon("Red", "Balloon"));
        balloons.add(new Balloon("Green", "Balloon"));
        balloons.add(new Balloon("Yellow", "Balloon"));
        balloons.add(new Balloon("Blue", "Balloon"));
        balloons.add(new Balloon("Purple", "Balloon"));
        balloons.add(new Balloon("Black", "Balloon"));
        balloons.add(new Balloon("Orange", "Balloon"));
        balloons.add(new Balloon("Pink", "Balloon"));

    }

}
