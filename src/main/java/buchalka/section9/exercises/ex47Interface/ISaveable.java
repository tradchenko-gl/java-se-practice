package buchalka.section9.exercises.ex47Interface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);

}
