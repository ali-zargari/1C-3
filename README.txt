project folder:
ali-zargari-cs1c-project03/


Brief description of submitted files:

src/stacks/BrowserNavigation.java
    -  Simulates a browser's back and forward buttons by recording links that are visited
       and then keeping a stack of "back" links and a stack of "forward" links.
    -  Makes use of Navigator.java and StackList.java

src/stacks/Navigator.java
    - provides the BrowserNavigation class withe the functions that are needed
      to iterate through a list of string links. This class allows the user go back and forward one link
      at a time through a stack of links.
    - Makes use of StackList.java

src/stacks/StackList.java
    - A parameterized class which implements Iterable. StackList is a singly
      linked list / stack used to store internet URLs as Strings. StackList
      has 2 inner classes StackIterator and Node, which are used in structuring
      the data passed to StackList.


resources/links.txt
    - A list of links, or commands to be executed by the 3 java classes in src.
    - Used for testing inputs.

resources/links2.txt
    - A list of links, or commands for further testing.

resources/gibberish.txt
    - A list of links, or commands that have no meaning to the program, to test unexpected inputs.

resources/popEmptyStackOfLinks.txt
    - A list of links, or commands to be used for testing pop() when stacks are empty.

resources/RUN.txt
    - A copy and paste of various different outputs by this program.


resources/proof_1.mp4
    - Proof that program runs with links.txt as input

resources/proof_2.mp4
    - Proof that program runs with links2.txt as input

resources/proof_3.mp4
    - Proof that program runs with gibberish.txt as input

resources/proof_4.mp4
    - Proof that program runs with popEmptyStackOfLinks.txt as input


resources/proof_1.jpg
    - Proof that program runs with links.txt as input

resources/proof_2.jpg
    - Proof that program runs with links2.txt as input

resources/proof_3.jpg
    - Proof that program runs with gibberish.txt as input

resources/proof_4.jpg
    - Proof that program runs with popEmptyStackOfLinks.txt as input

README.txt
    -Description of every file.