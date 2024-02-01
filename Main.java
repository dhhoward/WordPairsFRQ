class Main {
  public static void main(String[] args) {
   // System.out.print(new WordPair("hi", "there").getFirst()); 
    String[] words = {"Hi", "there", "Tyler", "Sam"};
    WordPairsList list = new WordPairsList(words);
     System.out.println(list);

    // For second part, uncomment this test:
    //System.out.println("The number of matched pairs is: " + list.numMatches());
  }
}