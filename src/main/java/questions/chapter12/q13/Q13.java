package questions.chapter12.q13;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Q13 {
    /*
    13. Which of the following compiles and is equivalent to this loop?
List<Unicorn> all = new ArrayList<>();
for (Unicorn current : ServiceLoader.load(Unicorn.class))
all.add(current);
A.
List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.getStream()
.collect(Collectors.toList());

B.
List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.stream()
.collect(Collectors.toList());
C.
List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.getStream()
.map(Provider::get)
.collect(Collectors.toList());
++D.
List<Unicorn> all = ServiceLoader.load(Unicorn.class)
.stream()
.map(Provider::get)
.collect(Collectors.toList());
E. None of the above
     */

    void method(){

        List<Unicorn> all=new ArrayList<>();
        for (Unicorn current : ServiceLoader.load(Unicorn.class))
            all.add(current);
    }

    void optionD(){

        List<Unicorn> all=ServiceLoader.load(Unicorn.class).stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }

}
