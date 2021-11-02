package stacks;


/**
 * An object of class Navigator provides the BrowserNavigation class withe the functions that are needed
 * to iterate through a list of string links. This class allows the user go back and forward one link
 * at a time through a stack of links.
 *
 *
 * @author Ali Zargari
 */
public class Navigator {

    // holds the current link string
    private String currentLink;

    // A stack of back String links
    private StackList<String> backLinks;

    // A stack of forward String links
    private StackList<String> forwardLinks;


    /**
     * Constructor for Navigator class.
     */
    public Navigator(){
        currentLink = "";
        backLinks = new StackList<String>();
        forwardLinks = new StackList<String>();
    }

    /**
     * Accessor method for currentLink
     *
     * @return the currentLink String.
     */
    public String getCurrentLink() {

        return currentLink;
    }

    /**
     * Accesspr method for backLinks variable.
     * @return backLinks StackList
     */
    public StackList<String> getBackLinks() {

        return backLinks;
    }

    /**
     * Accesspr method for forwardLinks variable.
     * @return forwardLinks StackList
     */
    public StackList<String> getForwardLinks() {

        return forwardLinks;
    }

    /**
     * Mutator method for currentLink variable,
     * update forwardLinks and backLinks stacks.
     * @param linkName the new link name String to be stored in currentLink variable.
     */
    public void setCurrentLink(String linkName) {

        // if current link is valid
        if(!getCurrentLink().isEmpty())
        {
            backLinks.push(getCurrentLink());
        }
        currentLink = linkName;
        forwardLinks.clear();
    }

    /**
     * Set currentLink to the next available link in the backLinks stack, if the stack is not empty.
     */
    public void goBack() {
        if(!backLinks.isEmpty()) {
            forwardLinks.push(currentLink);
            currentLink =  backLinks.pop();

        } else {
            System.out.println("\n------backLinks is empty. No links in stack.------");
        }

    }

    /**
     * Set currentLink to the next available link in the forwardLinks stack, if the stack is not empty.
     */
    public void goForward() {
        if(!forwardLinks.isEmpty()) {
            backLinks.push(currentLink);
            currentLink =  forwardLinks.pop();

        } else {
            System.out.println("\n------forwardLinks is empty. No links in stack.------");
        }
    }
}
