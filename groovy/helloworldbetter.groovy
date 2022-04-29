/* answer not mine, from cathy-mcdonalc */

class Greet {
  public static enum Languages { ENGLISH, GERMAN, FRENCH, JAPANESE, ITALIAN, SPANISH }
  
  private static final GREETING = [(Languages.ENGLISH): 'hello', 
     (Languages.GERMAN): 'hallo',
     (Languages.FRENCH): 'salut',
     (Languages.JAPANESE): 'konnichiwa',
     (Languages.ITALIAN): 'ciao',
     (Languages.SPANISH): 'hola']

  private static final WORLD = [(Languages.ENGLISH): 'world', 
     (Languages.GERMAN): 'welt',
     (Languages.FRENCH): 'monde',
     (Languages.JAPANESE): 'sekai',
     (Languages.ITALIAN): 'mondo',
     (Languages.SPANISH):  'mundo']

  public static String greet(language = Languages.ENGLISH) {
    "${GREETING[language]} ${WORLD[language]}!"
  }
}
