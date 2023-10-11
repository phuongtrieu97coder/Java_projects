public class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
  
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;
    }
  
  
    public String getInfo(){
      return this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+". The language follows the word order: "+this.wordOrder;
    }
  
  
    public static void main(String[] args){
      Language Chinese = new Language("Chinese",10000000,"China, Asia, Europe, USA", "subject-verb-object");
      System.out.println(Chinese.getInfo());
  
      Language Mayan = new Mayan("Ki'che'",2330000);
      System.out.println(Mayan.getInfo());
  
      Language Chinese2 = new SinoTibetan("Chinese",10000000);
      System.out.println(Chinese2.getInfo());
  
      Language Burmese = new SinoTibetan("Burmese",5000000);
      System.out.println(Burmese.getInfo());
  
    }
  }