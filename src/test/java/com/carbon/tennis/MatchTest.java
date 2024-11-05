package com.carbon.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class MatchTest {

    @Mock
    private Random mockRandom;
    @Mock
    private Player mockPlayer1;
    @Mock
    private Player mockPlayer2;
    @Mock
    private ScoreBoard mockScoreBoard;
    @Mock
    private TennisSet mockTennisSet;
    @Mock
    private Game mockGame;
    @Spy
    private Match match;

    @BeforeEach
    void setUp() {
        match = spy(Match.builder()
                .player1(mockPlayer1)
                .player2(mockPlayer2)
                .scoreBoard(mockScoreBoard)
                .random(mockRandom)
                .set(mockTennisSet)
                .build());
    }

    @Test
    void testPlayPoint_Player1Wins() {
        when(mockRandom.nextBoolean()).thenReturn(true);
        match.playPoint();
        verify(mockPlayer1).scorePoint();
        verify(mockPlayer2, never()).scorePoint();
    }

    @Test
    void testPlayPoint_Player2Wins() {
        when(mockRandom.nextBoolean()).thenReturn(false);
        match.playPoint();
        verify(mockPlayer2).scorePoint();
        verify(mockPlayer1, never()).scorePoint();
    }




}