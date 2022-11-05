package pokemons;
import com.company.*;
import ru.ifmo.se.pokemon.*;

public class Gourgeist extends Pumpkaboo {
    public Gourgeist(String name, int level) {
        super(name, level);
        setStats(65, 90, 122, 58, 75, 84);
        setType(Type.GHOST, Type.GRASS);
        setMove(new ChargeBeam(), new SeedBomb(), new RazorLeaf(), new FocusBlast());
    }
}
