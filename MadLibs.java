public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Ovis
  Date: 01/26/2024
  */
  	public static void main(String[] args){
      String name1 = "Bobby";
      String name2 = "Billy";

      int number = 7;

      String place1 = "Madrid";

      String adjective1 = "amazing";
      String adjective2 = "awesome";
      String adjective3 = "worried";

      String verb1 = "sing";

      String noun1 = "criminal";
      String noun2 = "masks";
      String noun3 = "television";
      String noun4 = "city";
      String noun5 = "water";
      String noun6 = "pirate";

      

      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
