package pokemons;
import com.company.*;
import ru.ifmo.se.pokemon.*;

public class Azumarill extends Marill {
    public Azumarill(String name, int level) {
        super(name, level);
        setStats(100, 50, 80, 60, 80, 50);
        setType(Type.WATER, Type.FAIRY);
        setMove(new BubbleBeam(), new Scald(), new Refresh(), new Bubble());
    }
}