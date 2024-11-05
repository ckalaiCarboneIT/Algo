package com.carbon.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ScoreBoardTest {

    private ScoreBoard scoreBoard;

    @BeforeEach
    void setUp() {
        scoreBoard = new ScoreBoard();
    }

    @ParameterizedTest
    @MethodSource("provideSetScores")
    void testAddSetScore(int player1Games, int player2Games, String expectedScore) {
        scoreBoard.addSetScore(player1Games, player2Games);
        assertEquals(expectedScore, scoreBoard.getScoreSets().toString());
    }

    private static Stream<Arguments> provideSetScores() {
        return Stream.of(
                Arguments.of(6, 4, "[(6-4)]"),
                Arguments.of(7, 5, "[(7-5)]"),
                Arguments.of(6, 0, "[(6-0)]"),
                Arguments.of(7, 6, "[(7-6)]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideMultipleSetScores")
    void testDisplayScore(int[][] scores, String expectedDisplay) {
        for (int[] score : scores) {
            scoreBoard.addSetScore(score[0], score[1]);
        }
        assertEquals(expectedDisplay, scoreBoard.displayScore());
    }

    private static Stream<Arguments> provideMultipleSetScores() {
        return Stream.of(
                Arguments.of(new int[][]{{6, 4}}, "Score: [(6-4)]"),
                Arguments.of(new int[][]{{6, 4}, {7, 5}}, "Score: [(6-4), (7-5)]"),
                Arguments.of(new int[][]{{6, 4}, {7, 5}, {6, 3}}, "Score: [(6-4), (7-5), (6-3)]"),
                Arguments.of(new int[][]{}, "Score: []")
        );
    }
}
