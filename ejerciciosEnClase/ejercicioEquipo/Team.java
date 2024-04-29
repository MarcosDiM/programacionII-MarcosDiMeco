package Ejercicio_Clase_16_4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Player>{
    private List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public Iterator<Player> iterator() {
        return new TeamIterator();
    }
    private class TeamIterator implements Iterator<Player> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return (index < players.size());
        }

        @Override
        public Player next() {
            return players.get(index++);
        }
    }
}
