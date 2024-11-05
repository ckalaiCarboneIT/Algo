package com.carbon.tennis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class GameTest {

    @ParameterizedTest
    @MethodSource("provideGameStatusTestCases")
    @DisplayName("Test de l'évaluation du statut de jeu")
    public void testEvaluateGameStatus(int pointsPlayer1, int pointsPlayer2, int expectedGamesWonPlayer1, int expectedGamesWonPlayer2) {
        Player player1 = Player.builder().points(pointsPlayer1).build();
        Player player2 = Player.builder().points(pointsPlayer2).build();

        Game.evaluateGameStatus(player1, player2);

        assertEquals(expectedGamesWonPlayer1, player1.getGamesWon());
        assertEquals(expectedGamesWonPlayer2, player2.getGamesWon());
    }

    private static Stream<Arguments> provideGameStatusTestCases() {
        return Stream.of(
                Arguments.of(4, 2, 1, 0), // Player 1 wins
                Arguments.of(2, 4, 0, 1), // Player 2 wins
                Arguments.of(3, 3, 0, 0), // No winner yet
                Arguments.of(5, 3, 1, 0), // Player 1 wins with advantage
                Arguments.of(3, 5, 0, 1)  // Player 2 wins with advantage
        );
    }
}
