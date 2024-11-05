package com.carbon.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.carbon.tennis.TennisSet;

import static org.junit.jupiter.api.Assertions.*;

class TennisSetTest {

    private Player player1;
    private Player player2;
    private ScoreBoard scoreBoard;

    @BeforeEach
    void setUp() {
        player1 = Player.builder().name("Player 1").build();
        player2 = Player.builder().name("Player 2").build();
        scoreBoard = new ScoreBoard();
    }

    @Test
    void testSetNotOver() {
        player1.setGamesWon(3);
        player2.setGamesWon(2);
        TennisSet.evaluateSetStatus(player1, player2, scoreBoard);

        assertEquals(0, player1.getSetsWon());
        assertEquals(0, player2.getSetsWon());
        assertEquals(3, player1.getGamesWon());
        assertEquals(2, player2.getGamesWon());
        assertTrue(scoreBoard.getScoreSets().isEmpty());
    }

    @Test
    void testSetOverPlayer1Wins() {
        player1.setGamesWon(6);
        player2.setGamesWon(4);
        TennisSet.evaluateSetStatus(player1, player2, scoreBoard);

        assertEquals(1, player1.getSetsWon());
        assertEquals(0, player2.getSetsWon());
        assertEquals(0, player1.getGamesWon());
        assertEquals(0, player2.getGamesWon());
        assertFalse(scoreBoard.getScoreSets().isEmpty());
        assertEquals("(6-4)", scoreBoard.getScoreSets().getFirst());
    }

    @Test
    void testSetOverPlayer2Wins() {
        player1.setGamesWon(5);
        player2.setGamesWon(7);
        TennisSet.evaluateSetStatus(player1, player2, scoreBoard);

        assertEquals(0, player1.getSetsWon());
        assertEquals(1, player2.getSetsWon());
        assertEquals(0, player1.getGamesWon());
        assertEquals(0, player2.getGamesWon());
        assertFalse(scoreBoard.getScoreSets().isEmpty());
        assertEquals("(5-7)", scoreBoard.getScoreSets().getFirst());
    }

    @Test
    void testSetNotOverAt6_5() {
        player1.setGamesWon(6);
        player2.setGamesWon(5);
        TennisSet.evaluateSetStatus(player1, player2, scoreBoard);

        assertEquals(0, player1.getSetsWon());
        assertEquals(0, player2.getSetsWon());
        assertEquals(6, player1.getGamesWon());
        assertEquals(5, player2.getGamesWon());
        assertTrue(scoreBoard.getScoreSets().isEmpty());
    }
}