package com.example.kelseyde.hashmap;
import java.util.HashMap;

public class Bear {
  private String name;
  private HashMap<String, Salmon> belly;
  private HashMap<String, Integer> journal;

  public Bear(String name){
    this.name = name;
    this.belly = new HashMap();
    this.journal = new HashMap();
    journal.put("Monday", 0);
    journal.put("Tuesday", 0);
    journal.put("Wednesday", 0);
    journal.put("Thursday", 0);
    journal.put("Friday", 0);
    journal.put("Saturday", 0);
    journal.put("Sunday", 0);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HashMap getBelly() {
    return belly;
  }

  public void setBelly(HashMap belly) {
    this.belly = belly;
  }

  public HashMap getJournal() {
    return journal;
  }

  public void setJournal(HashMap journal) {
    this.journal = journal;
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void eat(String day, Salmon salmon){
    this.belly.put(day, salmon);
    this.journal.put(day, (this.journal.get(day) + 1));
  }

  public void newWeek(){
    for(Integer i : this.journal.values()){
      i = 0; //don't understand why this doesn't work
    }
  }







}
