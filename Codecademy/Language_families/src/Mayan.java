public class Mayan extends Language{
  public Mayan(String name, int numSpeakers){
    super(name, numSpeakers,  "Central America", "verb-object-subject");
  }

  @Override
  public String getInfo(){
    return this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+". The language follows the word order: "+this.wordOrder+" Fun fact: "+this.name+" is an ergative language";
  }
}