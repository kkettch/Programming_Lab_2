package pokemons;
import com.company.*;
import ru.ifmo.se.pokemon.*;

public class Azurill extends Pokemon{
    public Azurill(String name, int level) {
        super(name, level);
        setStats(50, 20, 40, 20, 40, 20);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new BubbleBeam(), new Scald());
    }
}
