import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.example.FootballTeam;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FootballTeamTest {

    /*
    private static final int THREE_GAMES_WON = 3;
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(THREE_GAMES_WON);
        //assertThat(team.getGamesWon()).isEqualTo(3);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(THREE_GAMES_WON);
    }
    @ValueSource(ints = {0,1,3,10})
     */
    @ParameterizedTest
    void constructorShouldSetGamesWon(int nb0fGamesWon){
        FootballTeam team = new FootballTeam(nb0fGamesWon);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nb0fGamesWon);
    }

    @ParameterizedTest
    @ValueSource(ints = {-10,-1})
    void constructorShouldThrowExceptionForIllegalGamesWon(int IllegalNbOfGames){
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->{new FootballTeam(IllegalNbOfGames);});
    }

    private static final int ANY_NUMBER = 123;
    @Test
    void shouldBePossibleToCompareTeams(){
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        assertThat(team).isInstanceOf(Comparable.class);
    }

    @Test
    void teamsWithMoreMatchesWonShouldBeGreater(){
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        assertThat(team_3.compareTo(team_2)).isGreaterThan(0);
    }

}



/*
public class FootballTeamTest {
    private static final int THREE_GAMES_WON = 3;
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(THREE_GAMES_WON);
        assertThat(team.getGamesWon())
            .as("number of games won")
            .isEqualTo(THREE_GAMES_WON);
       }
}
 */