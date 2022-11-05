package pokemons;
import com.company.*;
import ru.ifmo.se.pokemon.*;

public class Chatot extends Pokemon {
    public Chatot(String name, int level) {
        super(name, level);
        setStats(76, 65, 45, 92, 42, 91);
        setType(Type.NORMAL, Type.FLYING);
        setMove(new RazorLeaf());
    }
}
