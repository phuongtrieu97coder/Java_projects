public class MadLibs {
  /*
This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Jonas";
      String name2 = "Henry";
      String place1 = "Florida";
      int number = 2080;
      String adjective1 = "happy";
      String adjective2 = "interesting";
      String adjective3 = "boisteously";
      String verb1 = "shout out";
      String noun1 = "Grocery store's owner";
      String noun2 = "products";
      String noun3 = "chanting";
      String noun4 = "noices";
      String noun5 = "country";
      String noun6 = "Tyranny";
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
