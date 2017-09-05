package com.example.kelseyde.hashmap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BearTest {
  Bear bear;
  Salmon salmon;

  @Before
  public void before(){
    bear = new Bear("Baloo");
    salmon = new Salmon();
  }

  @Test
  public void testBellyStartsAtZero(){
    assertEquals(0, bear.foodCount() );
  }

  @Test
  public void testCanEat(){
    bear.eat("Wednesday", salmon);
    assertEquals(1, bear.foodCount() );
  }

  @Test
  public void testEatingUpdatesJournal(){
    bear.eat("Monday", salmon);
    assertEquals(1, bear.getJournal().get("Monday"));
  }

  @Test
  public void testNewWeekResetsJournal(){
    bear.eat("Monday", salmon);
    bear.eat("Tuesday", salmon);
    bear.eat("Thursday", salmon);
    bear.eat("Thursday", salmon);
    assertEquals(1, bear.getJournal().get("Monday"));
    assertEquals(1, bear.getJournal().get("Tuesday"));
    assertEquals(2, bear.getJournal().get("Thursday"));
    bear.newWeek();
    assertEquals(0, bear.getJournal().get("Monday"));
    assertEquals(0, bear.getJournal().get("Tuesday"));
    assertEquals(0, bear.getJournal().get("Thursday"));
  }
}
